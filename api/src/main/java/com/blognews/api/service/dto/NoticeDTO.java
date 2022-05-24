package com.blognews.api.service.dto;

import com.blognews.api.model.Category;
import lombok.Data;

@Data
public class NoticeDTO {
    private Long id;
    private String title;
    private String content;
    private String image;
    private String date;
    private CategoryDTO category;
}
