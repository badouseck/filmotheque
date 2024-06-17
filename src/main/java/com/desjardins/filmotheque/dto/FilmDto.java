package com.desjardins.filmotheque.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilmDto {
    private Long id;
    private String titre;
    private String description;
    private List<ActeurDto> acteurs;
}
