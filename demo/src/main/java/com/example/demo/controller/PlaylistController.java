package main.java.com.example.demo.controller;

import main.java.com.example.demo.model.Playlist;
import main.java.com.example.demo.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    @Autowired
    private PlaylistRepository playlistRepository;

    @GetMapping
    public List<Playlist> getAllPlaylists() {
        return playlistRepository.findAll();
    }
}