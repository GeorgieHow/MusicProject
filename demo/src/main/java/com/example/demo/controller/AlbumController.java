package main.java.com.example.demo.controller;

import main.java.com.example.demo.model.Album;
import main.java.com.example.demo.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @GetMapping
    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }
}
