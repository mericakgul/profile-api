package com.example.profileapi.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "header")
@Getter
@Setter
@NoArgsConstructor
public class Header {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "subtitle")
    private String subtitle;

    @OneToMany
    @JoinColumn(name = "header_id")
    private List<SocialMedia> socialMedia;

    @OneToOne
    @JoinColumn(name = "image_id")
    private Image image;
}
