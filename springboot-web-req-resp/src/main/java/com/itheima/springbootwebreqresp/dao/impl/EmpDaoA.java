package com.itheima.springbootwebreqresp.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.itheima.springbootwebreqresp.dao.EmpDao;
import com.itheima.springbootwebreqresp.pojo.Emp;
import com.itheima.springbootwebreqresp.utils.XmlParserUtils;

@Component // 将当前类交给IOC，成为bean
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        // System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
