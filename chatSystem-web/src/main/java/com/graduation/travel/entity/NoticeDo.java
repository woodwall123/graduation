package com.graduation.travel.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class NoticeDo {
    private String noticeId;
    private String noticeTitle;
    private String noticeContent;
    private String photo;

    public static NoticeDo changeClass(Notice notice){
        NoticeDo noticeDo = new NoticeDo();
        noticeDo.setNoticeId(notice.getNoticeId());
        noticeDo.setNoticeTitle(notice.getNoticeTitle());
        noticeDo.setNoticeContent(notice.getNoticeContent());
        String photo = new String(notice.getPhoto());
        photo = photo.replaceAll("\r|\n","");
        noticeDo.setPhoto(photo);
        return noticeDo;
    }
}
