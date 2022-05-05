package com.blognews.api.service.dto;

import lombok.Data;

@Data
public class NoticeMinimalDTO {
    private Integer id;
    private String title;
    private String content;
    private String image;
    private String date;
    private String category_id;
}
