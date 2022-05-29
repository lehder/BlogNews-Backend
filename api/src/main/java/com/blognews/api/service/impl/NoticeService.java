package com.blognews.api.service.impl;

import com.blognews.api.model.Category;
import com.blognews.api.model.Notice;
import com.blognews.api.repository.INoticeRepository;
import com.blognews.api.service.INoticeService;
import com.blognews.api.service.dto.CategoryDTO;
import com.blognews.api.service.dto.NoticeDTO;
import com.blognews.api.service.dto.NoticeMinimalDTO;
import com.blognews.api.service.mapper.ModelMapperUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class NoticeService implements INoticeService {
    private INoticeRepository noticeRepository;

    // constructor
    public NoticeService(INoticeRepository noticeRepository){
        this.noticeRepository = noticeRepository;
    }


    @Override
    public List<NoticeDTO> obtenerTodas() {
        List<Notice> notices = noticeRepository.findAll();
        return ModelMapperUtils.mapAll(notices, NoticeDTO.class);
    }

    @Override
    public List<NoticeMinimalDTO> obtenerTodasMin() {
        List<Notice> notices = noticeRepository.findAll();
        return ModelMapperUtils.mapAll(notices, NoticeMinimalDTO.class);
    }

    @Override
    public NoticeDTO obtenerNotice(Long id){
        Optional<Notice> noticeOptional = noticeRepository.findById(id);
        if(noticeOptional.isPresent()){
            return ModelMapperUtils.map(noticeOptional.get(), NoticeDTO.class);
        }else {
            return null;
        }
    }

    @Override
    public NoticeDTO guardar(NoticeDTO noticeDTO){
        Notice noticeEntidad = ModelMapperUtils.map(noticeDTO, Notice.class);
        noticeEntidad = noticeRepository.save(noticeEntidad);
        return ModelMapperUtils.map(noticeEntidad, NoticeDTO.class);
    }

    @Override
    public void borrar(Long id){
        Optional<Notice> noticeOptional  = noticeRepository.findById(id);
        if (noticeOptional.isPresent()) {
            noticeRepository.delete(noticeOptional.get());
        }else {
            System.out.println("No existe la Noticia:" + id);
        }
    }

}
