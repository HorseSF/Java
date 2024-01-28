package com.itheima.springbootwebreqresp.pojo;

import lombok.Data;

@Data
public class User {
    private String name;
    private Integer age;
    private Address address;
}
