package com.xiaomai.yupicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 功能:
 * 作者:zhl
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -7599059472957234887L;

    /**
     *  用户账号
     */
    private String userAccount;
    /**
     *  用户密码
     */
    private String userPassword;
    /**
     *  确认密码
     */
    private String checkPassword;

}
