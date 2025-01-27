package br.com.luandev.cinemasaoluiz.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Genre {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    public Genre() {
    }

    public Genre(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Genre(Genre genre) {
        this.id = genre.getId();
        this.name = genre.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
