package com.blognews.api.resource;

import com.blognews.api.model.Notice;
import com.blognews.api.service.INoticeService;
import com.blognews.api.service.dto.NoticeDTO;
import com.blognews.api.service.dto.NoticeMinimalDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NoticeResource {

    private INoticeService noticeService;

    public NoticeResource(INoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @GetMapping("/notice")
    public List<NoticeDTO> obtainListNotice(){

        List<NoticeDTO> notice = new ArrayList<NoticeDTO>();

        notice = noticeService.obtenerTodas();
        return notice;
    }

    @GetMapping("/notices-min")
    public List<NoticeMinimalDTO> obtenerListaMinNotices(){
        List<NoticeMinimalDTO> noticeMinimalList = noticeService.obtenerTodasMin();
        return noticeMinimalList;
    }
}
