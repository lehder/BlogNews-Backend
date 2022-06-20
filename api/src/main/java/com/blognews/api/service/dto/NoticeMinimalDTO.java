package com.blognews.api.service.dto;

import lombok.Data;

@Data
public class NoticeMinimalDTO {
    private Long id;
    private String title;
    private String content;
    private String image;
    private String date;
    private CategoryDTO category;
}
