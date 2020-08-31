package com.zach.springbootcustomexceptiondemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public enum ResultStatusEnum {
    SUCCESS(200,"request success!"),
    PASSWORD_NOT_MATCHING(400,"password error!");

    @Getter
    @Setter
    private int code;

    @Getter
    @Setter
    private String message;
}
