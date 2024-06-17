package com.desjardins.filmotheque.mapper;

import com.desjardins.filmotheque.dto.FilmDto;
import com.desjardins.filmotheque.model.Film;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface FilmMapper {

    Film mapDtoToFilm(FilmDto filmDto);

    FilmDto mapToFilmDto(Film film);
}
