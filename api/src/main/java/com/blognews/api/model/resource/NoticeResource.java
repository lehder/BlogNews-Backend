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

    @CrossOrigin
    @GetMapping("/notices")
    public List<NoticeDTO> obtenerListaNotices(){
        List<NoticeDTO> noticesList = new ArrayList<NoticeDTO>();
        noticesList = noticeService.obtenerTodas();
        return noticesList;
    }

    @CrossOrigin
    @GetMapping("/notices/{id}")
    public NoticeDTO obtenerNotice(@PathVariable Long id){
        return noticeService.obtenerNotice(id);
    }

    @GetMapping("/notice-min")
    public List<NoticeMinimalDTO> obtenerListaMinNotyces(){
        List<NoticeMinimalDTO> noticeMinimalList = noticeService.obtenerTodasMin();
        return noticeMinimalList;
    }

    @CrossOrigin
    @PostMapping("/notices")
    public NoticeDTO crearNotyces(@RequestBody NoticeDTO noticeDTO){
        return noticeService.guardar(noticeDTO);
    }

    @CrossOrigin
    @PutMapping("/notices")
    public NoticeDTO modificarNotice(@RequestBody NoticeDTO noticeDTO){
        return noticeService.guardar(noticeDTO);
    }

    @CrossOrigin
    @DeleteMapping("/notices/{id}")
    public void borrarNotice(@PathVariable Long id){
        noticeService.borrar(id);
    }
}