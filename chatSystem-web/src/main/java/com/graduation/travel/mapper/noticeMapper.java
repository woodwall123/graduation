package com.graduation.travel.mapper;

import com.graduation.travel.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Blob;
import java.util.List;

@Mapper
public interface noticeMapper {
    public List<Notice> getAllNotice();
    public void editNotice(String noticeId, String noticeTitle, String noticeContent, Blob photo);
}
