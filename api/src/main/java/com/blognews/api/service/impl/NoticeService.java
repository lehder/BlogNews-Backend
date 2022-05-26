package com.blognews.api.service.impl;

import com.blognews.api.repository.INoticeRepository;
import com.blognews.api.model.Notice;
import com.blognews.api.service.INoticeService;
import com.blognews.api.service.dto.NoticeDTO;
import com.blognews.api.service.dto.NoticeMinimalDTO;
import com.blognews.api.service.mapper.ModelMapperUtils;
import org.springframework.stereotype.Service;
import sun.jvm.hotspot.utilities.Observable;

import java.util.List;
import java.util.Optional;

@Service
public class NoticeService implements INoticeService {

    private final Object http;
    private INoticeRepository noticeRepository;

    // constructor
    public NoticeService(INoticeRepository noticeRepository, Object http){
        this.noticeRepository = noticeRepository;
        this.http = http;
    }
    

    public getNoticeById(id: number): Observable<Notice>{
        const url = 'http://localhost:8080/apio/notices'+id;
        return this.http.get<Notice>(url);
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
        List<Notice> lista = noticeRepository. findAllByCategoryId(categoryId);
        return ModelMapperUtils.mapAll(lista, NoticeDTO.class);
    }

    @Override

    public NoticeDTO getById(Long id) {

        Optional<Notice> noticeOptional = noticeRepository.findById(id);

        If(noticeOptional.isPresent());{

            return ModelMapperUtils.map(noticeOptional.get(), NoticeDTO.class);

        }

    }

    private void If(boolean present) {
    }

}


