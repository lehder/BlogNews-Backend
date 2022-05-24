package com.blognews.api.resource;

import com.blognews.api.model.Notice;
import com.blognews.api.service.INoticeService;
import com.blognews.api.service.dto.NoticeDTO;
import com.blognews.api.service.dto.NoticeMinimalDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RestController
@RequestMapping("/api")
public class NoticeResource {

    private INoticeService noticeService;

    public NoticeResource(INoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @GetMapping("/notices")
    public List<NoticeDTO> obtainListNotice(){

        List<NoticeDTO> notice = new ArrayList<NoticeDTO>();

        notice = noticeService.obtenerTodas();
        return notice;
    }

    @GetMapping("/notices/{id}")
    public NoticeDTO obtainNotice(@PathVariable Long id){
        return noticeService.getById(id);
    }

    @GetMapping("/notices/category/{categoryId}")
    public List<NoticeDTO> obtainListNotice(@PathVariable Long categoryId){
        List<NoticeDTO> notice = new ArrayList<NoticeDTO>();
        notice = noticeService.obtenerTodasPorCategoria(categoryId);
        return notice;
    }

    @GetMapping("/notices-min")
    public List<NoticeMinimalDTO> obtenerListaMinNotices(){
        List<NoticeMinimalDTO> noticeMinimalList = noticeService.obtenerTodasMin();
        return noticeMinimalList;
    }

    @PostMapping("/notices")
    public NoticeDTO crearNotice(@RequestBody NoticeDTO noticeDTO){
        return noticeService.guardar(noticeDTO);
        //return noticeDTO;
    }
}
