package com.graduation.travel.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CustomerBean {
    private int id;
    private int type;//用户种类，true为管理员
    private String realName;//只有管理员有realname，游客用户用其他的代替
    private String petName;
    private String phoneNumber;
    private String accountNumber;
    private String mailBox;
    private byte[] photo;
}
