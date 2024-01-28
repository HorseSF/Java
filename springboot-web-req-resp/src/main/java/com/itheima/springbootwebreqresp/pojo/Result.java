package com.itheima.springbootwebreqresp.pojo;

import lombok.Data;

@Data
public class Result {
    private Integer code; // 1 成功 0 失败
    private String msg; // 提示信息
    private Object data; // 数据

    public Result() {

    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success(Object data) {
        return new Result(1, "success", data);
    }

    public static Result success() {
        return new Result(1, "success", null);
    }

    public static Result error(String msg) {
        return new Result(0, msg, null);
    }
}
