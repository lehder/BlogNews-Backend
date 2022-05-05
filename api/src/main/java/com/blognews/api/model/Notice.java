package com.blognews.api.model;

import lombok.Data;

@Data
public class Notice {
    private Integer id;
    private String title;
    private String content;
    private String image;
    private String date;
    private String categorize_id;

    public Notice(Integer id, String title, String content, String image, String date, String categoria_id){
        this.id = id;
        this.title = title;
        this.content = content;
        this.image = image;
        this.date = date;
        this.categorize_id = categoria_id;
    }
}
