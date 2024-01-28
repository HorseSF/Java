package com.itheima.springbootwebreqresp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.springbootwebreqresp.pojo.Emp;
import com.itheima.springbootwebreqresp.pojo.Result;
import com.itheima.springbootwebreqresp.service.EmpService;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
        // 调用service，获取数据
        List<Emp> empList = empService.listEmp();

        // 响应数据
        return Result.success(empList);
    }

    // @RequestMapping("/listEmp")
    // public Result list() {
    // // 加载解析xml
    // String file =
    // this.getClass().getClassLoader().getResource("emp.xml").getFile();
    // System.out.println(file);
    // List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

    // // 数据转换
    // empList.stream().forEach(emp -> {
    // String gender = emp.getGender();
    // if ("1".equals(gender)) {
    // emp.setGender("男");
    // } else if ("2".equals(gender)) {
    // emp.setGender("女");
    // }

    // String job = emp.getJob();
    // if ("1".equals(job)) {
    // emp.setJob("讲师");
    // } else if ("2".equals(job)) {
    // emp.setJob("班主任");
    // } else if ("3".equals(job)) {
    // emp.setJob("就业指导");
    // }
    // });

    // // 响应数据
    // return Result.success(empList);
    // }
}
