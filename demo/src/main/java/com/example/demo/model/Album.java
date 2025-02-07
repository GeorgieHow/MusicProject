package main.java.com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long albumId;
    private String title;

    @ManyToOne
    private Artist artist;

    public Album() {
    }

    public Album(Long albumId, String title, Artist artist) {
        this.albumId = albumId;
        this.title = title;
        this.artist = artist;
    }

    public Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
    }

    public Long getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "{" +
                " albumId='" + getAlbumId() + "'" +
                ", title='" + getTitle() + "'" +
                ", artist='" + getArtist() + "'" +
                "}";
    }

}