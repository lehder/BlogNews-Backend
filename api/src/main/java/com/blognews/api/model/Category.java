package com.blognews.api.model;

import lombok.Data;

@Data
public class Category {
        private Integer id;
        private String name;
        private String description;
        private String image;

        public Category(Integer id, String name, String description, String image){
            this.id = id;
            this.name = name;
            this.description = description;
            this.image = image;
        }
}
