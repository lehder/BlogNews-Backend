package com.blognews.api.service.impl;

import com.blognews.api.model.Notice;
import com.blognews.api.service.INoticeService;
import com.blognews.api.service.dto.NoticeDTO;
import com.blognews.api.service.dto.NoticeMinimalDTO;
import com.blognews.api.service.mapper.ModelMapperUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoticeService implements INoticeService {

    @Override
    public List<NoticeDTO> obtenerTodas() {
        List<Notice> notices = initializeNotices();
        return ModelMapperUtils.mapAll(notices, NoticeDTO.class);
    }

    @Override
    public List<NoticeMinimalDTO> obtenerTodasMin() {
        List<Notice> notices = initializeNotices();
        return ModelMapperUtils.mapAll(notices, NoticeMinimalDTO.class);
    }

    private List<Notice> initializeNotices() {
        List<Notice> notices = new ArrayList<Notice>();


        Notice notice1 = new Notice((int) '1',  "Nacionales", "Todas las noticias nacional", "", "", "" );
        notices.add(notice1);
        Notice notice2 = new Notice((int) '2',  "Internacionales", "Todas las noticias internacionales", "", "", "" );
        notices.add(notice2);
        Notice notice3 = new Notice((int) '3',  "Deportes", "Noticias deportivas", "", "", "" );
        notices.add(notice3);
        Notice notice4 = new Notice((int) '4',  "Tendencias", "Lo ultimo en tendencias", "", "", "" );
        notices.add(notice4);
        Notice notice5 = new Notice((int) '5',  "Tecnologia", "Tecnologias a nivel mundial", "", "", "" );
        notices.add(notice5);

        return notices;
    }




    }
