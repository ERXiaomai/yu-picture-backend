package com.xiaomai.yupicturebackend.controller;

import com.xiaomai.yupicturebackend.common.BaseResponse;
import com.xiaomai.yupicturebackend.common.ResultUtils;
import com.xiaomai.yupicturebackend.exception.ErrorCode;
import com.xiaomai.yupicturebackend.exception.ThrowUtils;
import com.xiaomai.yupicturebackend.model.dto.UserRegisterRequest;
import com.xiaomai.yupicturebackend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能:
 * 作者:zhl
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    /**
     * 用户注册
     */
    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        ThrowUtils.throwIf(userRegisterRequest == null, ErrorCode.PARAMS_ERROR);
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        return ResultUtils.success(result);
    }

}
