package com.xiaomai.yupicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 功能:通用的删除请求类
 * 作者:zhl
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
