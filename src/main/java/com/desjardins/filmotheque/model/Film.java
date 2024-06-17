package com.desjardins.filmotheque.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Film {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String titre;
    private String description;
    @OneToMany(fetch = LAZY, cascade = CascadeType.ALL)
    private List<Acteur> acteurs;


}
