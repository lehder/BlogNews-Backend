package com.blognews.api.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Category")
public class Category {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "description")
        private String description;
        
        @Column(name = "image")
        private String image;

        public Category(int id, String nacionales, String todas_las_noticias_nacionales, String s) {
        }
}
