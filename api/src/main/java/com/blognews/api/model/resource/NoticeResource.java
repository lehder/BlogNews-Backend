package com.blognews.api.model.resource;

import com.blognews.api.service.INoticeService;
import com.blognews.api.service.dto.NoticeDTO;
import com.blognews.api.service.dto.NoticeMinimalDTO;
import org.springframework.web.bind.annotation.*;

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
    public List<NoticeDTO> obtenerListaNotyces(){
        List<NoticeDTO> notice = new ArrayList<NoticeDTO>();
        notice = noticeService.obtenerTodas();
        return notice;
    }

    @GetMapping("/notice/{id}")
    public NoticeDTO obtenerNotice(@PathVariable Long id){
        return noticeService.obtenerNotice(id);
    }

    @GetMapping("/notice-min")
    public List<NoticeMinimalDTO> obtenerListaMinNotyces(){
        List<NoticeMinimalDTO> noticeMinimalList = noticeService.obtenerTodasMin();
        return noticeMinimalList;
    }

    @PostMapping("/notice")
    public NoticeDTO crearNotyces(@RequestBody NoticeDTO noticeDTO){
        return noticeService.guardar(noticeDTO);
    }

    @PutMapping("/notice")
    public NoticeDTO modificarNotice(@RequestBody NoticeDTO noticeDTO){
        return noticeService.guardar(noticeDTO);
    }
}
