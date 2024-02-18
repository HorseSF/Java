package com.tlias.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * aop例
 */
@Slf4j
@Component
@Aspect
public class MyAspect1 {

    @Pointcut("execution(* com.tlias.service.impl.DeptServiceImpl.*(..))")
    private  void pt() {}

    @Before("pt()")
    public void before() {
        log.info("before ...");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("around before ...");

        Object result = proceedingJoinPoint.proceed();

        log.info("around after ...");

        return result;
    }

    @After("pt()")
    public void after() {
        log.info("after ...");
    }

    @AfterReturning("pt()")
    public void afterReturning() {
        log.info("afterReturning ...");
    }

    @AfterThrowing("pt()")
    public void afterThrowing() {
        log.info("afterThrowing ...");
    }
}
