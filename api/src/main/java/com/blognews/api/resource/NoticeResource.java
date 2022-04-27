package com.blognews.api.resource;

import com.blognews.api.model.Notice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class NoticeResource {

    @GetMapping("/notice")
        public List<Notice> obtainListNotice(){

        List<Notice> notice = new ArrayList<Notice>();

        notice = initializeNotices();
        return notice;
    }

    private List<Notice> initializeNotices() {
        List<Notice> categories = new ArrayList<Notice>();

        Notice notice1 = new Notice((int) '1', "Titulo");
        Notice.add(notice1);



        return (List<Notice>) notice1;
    }
}
