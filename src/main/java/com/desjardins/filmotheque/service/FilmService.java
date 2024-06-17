package com.desjardins.filmotheque.service;

import com.desjardins.filmotheque.dto.FilmDto;
import com.desjardins.filmotheque.exceptions.FilmNotFoundException;
import com.desjardins.filmotheque.mapper.FilmMapper;
import com.desjardins.filmotheque.model.Film;
import com.desjardins.filmotheque.repository.FilmRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmService {

    private final FilmRepository filmRepository;
    private final FilmMapper filmMapper;

    public FilmService(FilmRepository filmRepository, FilmMapper filmMapper) {
        this.filmRepository = filmRepository;
        this.filmMapper = filmMapper;
    }

    public FilmDto getFilm(Long id) {
        Film film = filmRepository.findById(id)
                .orElseThrow(() -> new FilmNotFoundException(id));
        return filmMapper.mapToFilmDto(film);
    }

    @Transactional
    public FilmDto save(FilmDto filmDto) {
        Film film = filmRepository.save(filmMapper.mapDtoToFilm(filmDto));
        return filmMapper.mapToFilmDto(film);
    }
}
