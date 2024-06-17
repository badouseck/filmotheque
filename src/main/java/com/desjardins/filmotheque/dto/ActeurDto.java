package com.desjardins.filmotheque.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActeurDto {

    private Long id;
    private String nom;
    private String prenom;
}
