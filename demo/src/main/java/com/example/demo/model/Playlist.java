package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playlistId;
    private String name;

    public Playlist() {
    }

    public Playlist(Long playlistId, String name) {
        this.playlistId = playlistId;
        this.name = name;
    }

    public Playlist(String name) {
        this.name = name;
    }

    public Long getPlaylistId() {
        return this.playlistId;
    }

    public void setPlaylistId(Long playlistId) {
        this.playlistId = playlistId;
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
                " playlistId='" + getPlaylistId() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }
}