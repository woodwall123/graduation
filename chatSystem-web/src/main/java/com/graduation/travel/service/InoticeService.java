package com.graduation.travel.service;

import com.graduation.travel.entity.Notice;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface InoticeService {
    List<Notice> getAllNotice();
    void editNotice(String noticeId, String noticeTitle, String noticeContent, MultipartFile avatar) throws IOException, SQLException;
}
