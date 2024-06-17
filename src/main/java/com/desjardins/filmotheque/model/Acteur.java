package com.desjardins.filmotheque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Acteur {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
}
