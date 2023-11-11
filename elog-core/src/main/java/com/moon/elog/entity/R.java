package com.moon.elog.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Title: R
 * @Author lin
 * @Date 2023/11/11 15:31
 * @description: 统一返回对象
 */
@Data
public class R<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 响应码
     */
    private int code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    public R() {
    }

    public R(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public R(T data) {
        this.code = BaseResponseEnum.SUCCESS.getCode();
        this.message = BaseResponseEnum.SUCCESS.getMessage();
        this.data = data;
    }

    public static <T> R<T> ok() {
        return new R<>(BaseResponseEnum.SUCCESS.getCode(), BaseResponseEnum.SUCCESS.getMessage());
    }

    public static <T> R<T> ok(T data) {
        return new R<>(data);
    }

    public static <T> R<T> error() {
        return new R<>(BaseResponseEnum.FAIL.getCode(), BaseResponseEnum.FAIL.getMessage());
    }
}
