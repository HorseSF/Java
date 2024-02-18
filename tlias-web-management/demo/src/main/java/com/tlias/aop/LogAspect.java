package com.tlias.aop;

import com.alibaba.fastjson.JSONObject;
import com.tlias.mapper.OperateLogMapper;
import com.tlias.pojo.OperateLog;
import com.tlias.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * 记录操作日志。
 */

@Slf4j
@Component
@Aspect
public class LogAspect {

    @Autowired
    private OperateLogMapper operateLogMapper;

    @Autowired
    private HttpServletRequest request;

    @Around("@annotation(com.tlias.anno.Log)")
    public Object recordLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        // 操作人的ID
        // 获取请求头的jwt令牌，解析令牌
        String jwt = request.getHeader("token");
        Claims claims = JwtUtils.parseJWT(jwt);
        Integer operateUser = (Integer) claims.get("id");

        // 操作时间
        LocalDateTime operateTime = LocalDateTime.now();

        // 操作类名
        String className = proceedingJoinPoint.getTarget().getClass().getName();

        // 操作方法名
        String methodName = proceedingJoinPoint.getSignature().getName();

        // 操作方法参数
        Object[] args = proceedingJoinPoint.getArgs();
        String methodParams = Arrays.toString(args);

        long begin = System.currentTimeMillis();

        // 调用原始目标方法运行
        Object result = proceedingJoinPoint.proceed();

        // 操作方法返回值
        String returnValue = JSONObject.toJSONString(result);

        // 操作耗时
        long end = System.currentTimeMillis();
        Long costTime = end - begin;

        // 记录操作日志
        OperateLog operateLog = new OperateLog(null, operateUser, operateTime, className, methodName, methodParams, returnValue, costTime);
        operateLogMapper.insert(operateLog);
        log.info("记录AOP操作日志：{}", operateLog);
        return result;

    }
}
