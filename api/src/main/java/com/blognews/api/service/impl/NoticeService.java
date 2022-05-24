package com.blognews.api.service.impl;

import com.blognews.api.repository.INoticeRepository;
import com.blognews.api.model.Notice;
import com.blognews.api.service.INoticeService;
import com.blognews.api.service.dto.NoticeDTO;
import com.blognews.api.service.dto.NoticeMinimalDTO;
import com.blognews.api.service.mapper.ModelMapperUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class NoticeService implements INoticeService {

    private INoticeRepository noticeRepository;

    // constructor
    public NoticeService(INoticeRepository noticeRepository){
        this.noticeRepository = noticeRepository;
    }


    @Override
    public List<NoticeDTO> obtenerTodas() {
        //List<Notice> notices = initializeNotices();
        List<Notice> notices = noticeRepository.findAll();
        return ModelMapperUtils.mapAll(notices, NoticeDTO.class);
    }

    @Override
    public List<NoticeMinimalDTO> obtenerTodasMin() {
        List<Notice> notices = noticeRepository.findAll();
        return ModelMapperUtils.mapAll(notices, NoticeMinimalDTO.class);
    }

    @Override
    public NoticeDTO guardar(NoticeDTO noticeDTO){
        Notice noticeEntidad = ModelMapperUtils.map(noticeDTO, Notice.class);
        noticeEntidad = noticeRepository.save(noticeEntidad);
        return ModelMapperUtils.map(noticeEntidad, NoticeDTO.class);
    }

    @Override
    public List<NoticeDTO> obtenerTodasPorCategoria(Long categoryId) {
        return null;
    }

    @Override
    public NoticeDTO getById(Long id) {
        return null;
    }

}
