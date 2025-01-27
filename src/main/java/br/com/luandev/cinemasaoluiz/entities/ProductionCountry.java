package br.com.luandev.cinemasaoluiz.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductionCountry {

    @JsonProperty("iso_3166_1")
    private String iso_3166_1;

    @JsonProperty("name")
    private String name;

    public ProductionCountry() {
    }

    public ProductionCountry(String iso_3166_1, String name) {
        this.iso_3166_1 = iso_3166_1;
        this.name = name;
    }

    public String getIso_3166_1() {
        return iso_3166_1;
    }

    public void setIso_3166_1(String iso_3166_1) {
        this.iso_3166_1 = iso_3166_1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
