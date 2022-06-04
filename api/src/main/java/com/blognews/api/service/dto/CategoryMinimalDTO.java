package com.blognews.api.service.dto;

import lombok.Data;

@Data
public class CategoryMinimalDTO {
    private Long id;
    private String name;
    private String description;
}
