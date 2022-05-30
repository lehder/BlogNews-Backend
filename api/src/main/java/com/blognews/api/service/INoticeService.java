package com.blognews.api.service;

import com.blognews.api.service.dto.NoticeDTO;
import com.blognews.api.service.dto.NoticeMinimalDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface INoticeService {
    public List<NoticeDTO> obtenerTodas();
    public List<NoticeMinimalDTO> obtenerTodasMin();
    public NoticeDTO guardar(NoticeDTO noticeDTO);
    public NoticeDTO obtenerNotice(Long id);
}
