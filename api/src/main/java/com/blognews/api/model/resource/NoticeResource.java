package com.blognews.api.model.resource;

import com.blognews.api.service.INoticeService;
import com.blognews.api.service.dto.NoticeDTO;
import com.blognews.api.service.dto.NoticeMinimalDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.DELETE, RequestMethod.GET, RequestMethod.PUT})
@RestController
@RequestMapping("/api")
public class NoticeResource {

    private INoticeService noticeService;

    public NoticeResource(INoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @CrossOrigin
    @GetMapping("/notices")
    public List<NoticeDTO> obtenerListaNotices() {
        List<NoticeDTO> noticesList = new ArrayList<NoticeDTO>();
        noticesList = noticeService.obtenerTodas();
        return noticesList;
    }

    @CrossOrigin
    @GetMapping("/notices/{id}")
    public NoticeDTO obtenerNotice(@PathVariable Long id) {
        return noticeService.obtenerNotice(id);
    }

    @CrossOrigin
    @GetMapping("/notices-min")
    public List<NoticeMinimalDTO> obtenerListaMinNotices() {
        List<NoticeMinimalDTO> noticeMinimalList = noticeService.obtenerTodasMin();
        return noticeService.obtenerTodasMin();
    }

    @CrossOrigin
    @PostMapping("/notices")
    public NoticeDTO crearNotice(@RequestBody NoticeDTO noticeDTO) {
        return noticeService.guardar(noticeDTO);
    }

    @CrossOrigin
    @PutMapping("/notices")
    public NoticeDTO modificarNotice(@RequestBody NoticeDTO noticeDTO) {
        return noticeService.guardar(noticeDTO);
    }

    @CrossOrigin
    @DeleteMapping("/notices/{id}")
    public void borrarNotice(@PathVariable Long id) {
        noticeService.borrar(id);
    }

}