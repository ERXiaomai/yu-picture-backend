package com.xiaomai.yupicturebackend.service;

import com.xiaomai.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaomai.yupicturebackend.model.vo.LoginUserVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 12514
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-01-12 01:51:13
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);



    /**
     * 获取加密后的密码
     * @param userPassword
     * @return
     */
    long userLogin(String userAccount, String userPassword, String checkPassword);
    String getEncryptPassword(String userPassword);

    /**
     * 获得脱敏后的登录用户信息
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);
}
