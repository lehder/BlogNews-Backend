package com.blognews.api.model.resource;

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

<<<<<<< HEAD:api/src/main/java/com/blognews/api/resource/NoticeResource.java
    @GetMapping("/notices")
    public List<NoticeDTO> obtainListNotice(){

=======
    @GetMapping("/notice")
    public List<NoticeDTO> obtenerListaNotyces(){
>>>>>>> prueba:api/src/main/java/com/blognews/api/model/resource/NoticeResource.java
        List<NoticeDTO> notice = new ArrayList<NoticeDTO>();
        notice = noticeService.obtenerTodas();
        return notice;
    }

<<<<<<< HEAD:api/src/main/java/com/blognews/api/resource/NoticeResource.java
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
=======
    @GetMapping("/notice/{id}")
    public NoticeDTO obtenerNotice(@PathVariable Long id){
        return noticeService.obtenerNotice(id);
    }

    @GetMapping("/notice-min")
    public List<NoticeMinimalDTO> obtenerListaMinNotyces(){
>>>>>>> prueba:api/src/main/java/com/blognews/api/model/resource/NoticeResource.java
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
