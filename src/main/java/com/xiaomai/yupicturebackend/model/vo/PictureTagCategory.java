package com.xiaomai.yupicturebackend.model.vo;

import lombok.Data;

import java.util.List;

/**
 * 功能:
 * 作者:zhl
 */
@Data
public class PictureTagCategory {
    /**
     * 标签列表
     */
    private List<String> tagList;

    /**
     * 分类列表
     */
    private List<String> categoryList;
}
