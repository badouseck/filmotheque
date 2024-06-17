package com.desjardins.filmotheque.exceptions;

public class FilmNotFoundException extends RuntimeException{
    private Long id;
    public FilmNotFoundException(Long id) {
        super("Aucun film trouvé avec l'id " + id);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
