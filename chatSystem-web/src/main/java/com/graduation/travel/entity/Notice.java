package com.graduation.travel.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Notice {
    private String noticeId;
    private String noticeTitle;
    private String noticeContent;
    private byte[] photo;
}
