package com.xiaomai.yupicturebackend.controller;

import com.xiaomai.yupicturebackend.common.BaseResponse;
import com.xiaomai.yupicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能:
 * 作者:zhl
 */
@RestController
@RequestMapping("/")
public class MainController {
    /**
     * 健康检查
     */
    @RequestMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }

}
