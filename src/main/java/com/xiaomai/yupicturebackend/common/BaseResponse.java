package com.xiaomai.yupicturebackend.common;

import com.xiaomai.yupicturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 功能:全局响应封装类
 * 作者:zhl
 */
@Data
public class BaseResponse<T> implements Serializable {//不确定data的类型，用泛型
    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
