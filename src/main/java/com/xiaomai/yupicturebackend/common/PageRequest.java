package com.xiaomai.yupicturebackend.common;

import lombok.Data;

/**
 * 功能:分页请求类
 * 作者:zhl
 */
@Data
public class PageRequest {
    /**
     * 当前页号
     */
    private int current = 1;


    /**
     * 页面大小
     */
    private int pageSize = 1;


    /**
     * 排序字段
     */
    private String sortField;


    /**
     * 排序顺序
     */
    private String sortOrder = "descend";

}
