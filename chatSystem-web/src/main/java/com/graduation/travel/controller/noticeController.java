package com.graduation.travel.controller;

import com.graduation.travel.entity.Notice;
import com.graduation.travel.service.InoticeService;
import com.graduation.travel.service.impl.noticeBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/notice")
public class noticeController {
    @Autowired
    private InoticeService inotice;

    @RequestMapping(value = "/getAllNotice",method = RequestMethod.POST)
    @ResponseBody
    public List<Notice> getAllNotice(){
         return inotice.getAllNotice();
    }

    @RequestMapping(value = "/editNotice",method = RequestMethod.POST)
    @ResponseBody
    public void editNotice(
            @RequestParam("noticeId") String noticeId,
            @RequestParam("noticeTitle") String noticeTitle,
            @RequestParam("noticeContent") String noticeContent,
            @RequestPart("photo") MultipartFile avatar) throws SQLException, IOException{
        inotice.editNotice(noticeId,noticeTitle,noticeContent,avatar);
    }

}
