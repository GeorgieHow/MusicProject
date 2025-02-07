package main.java.com.example.demo.repository;

import main.java.com.example.demo.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}