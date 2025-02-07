package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artistId;
    private String name;

    public Artist() {
    }

    public Artist(Long artistId, String name) {
        this.artistId = artistId;
        this.name = name;
    }

    public Artist(String name) {
        this.name = name;
    }

    public Long getArtistId() {
        return this.artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                " artistId='" + getArtistId() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }

}