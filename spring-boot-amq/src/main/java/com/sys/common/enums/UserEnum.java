package com.sys.common.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum UserEnum {

    VALIDATE(0, "待验证"), SUCCESS(1, "注册成功"),
    OFFLINE(2, "离线"), ONLINE(3, "在线"), PROHIBIT(4, "禁用"), ENABLE(5, "启用");

    private final Integer code;
    private final String  value;

    private UserEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public static UserEnum getEnumByKey(String key) {
        if (null == key) {
            return null;
        }
        for (UserEnum temp : UserEnum.values()) {
            if (temp.getCode().equals(key)) {
                return temp;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

}
