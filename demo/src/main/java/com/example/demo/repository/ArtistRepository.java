package main.java.com.example.demo.repository;

import main.java.com.example.demo.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}