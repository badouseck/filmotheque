package com.desjardins.filmotheque.controller;


import com.desjardins.filmotheque.dto.FilmDto;
import com.desjardins.filmotheque.service.FilmService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/film")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<FilmDto> getFilm(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(filmService.getFilm(id));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FilmDto> createFilm(@RequestBody FilmDto filmDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(filmService.save(filmDto));
    }
}
