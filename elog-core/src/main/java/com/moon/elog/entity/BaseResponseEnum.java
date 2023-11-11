package com.moon.elog.entity;

import lombok.Getter;

/**
 * @Title: BaseResponseEnum
 * @Author lin
 * @Date 2023/11/11 15:49
 * @description: 通用响应枚举
 */
@Getter
public enum BaseResponseEnum {
    SUCCESS(20000, "请求成功"),
    FAIL(20001, "请求失败"),
    BASE_EXCEPTION(50000, "系统异常");

    private int code;

    private String message;

    BaseResponseEnum() {
    }

    BaseResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
