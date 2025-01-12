package com.xiaomai.yupicturebackend.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能:
 * 作者:zhl
 */
@Getter
public enum UserRoleEnum {

    USER("普通用户","user"),
    ADMIN("管理员","admin");

    private final String text;
    private final String value;

    UserRoleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }
    /**
     * 根据 value 获取枚举
     *
     * @param value 枚举值的value
     * @return 枚举值
     */
    public static UserRoleEnum getEnumByValue(String value){
        if(ObjUtil.isEmpty(value)){
            return null;
        }
        for(UserRoleEnum userRoleEnum: UserRoleEnum.values()){
            if(userRoleEnum.getValue().equals(value)){
                return userRoleEnum;
            }
        }
//        Map<String,UserRoleEnum> map = new HashMap<>();
//        map.put("admin",ADMIN);
        return null;
    }
}
