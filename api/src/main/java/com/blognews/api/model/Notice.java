package com.blognews.api.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Notice")
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "image")
    private String image;

    @Column(name = "date")
    private String date;

    @Column(name = "categorize_id")
    private String categorize_id;

    public Notice(long id, String nacionales, String todas_las_noticias_nacional, String s, String s1, String s2) {
    }
}
