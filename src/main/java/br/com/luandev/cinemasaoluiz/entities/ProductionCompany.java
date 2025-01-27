package br.com.luandev.cinemasaoluiz.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductionCompany {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("logo_path")
    private String logo_path;

    @JsonProperty("name")
    private String name;

    @JsonProperty("origin_country")
    private String origin_country;

    public ProductionCompany() {
    }

    public ProductionCompany(Long id, String logo_path, String name, String origin_country) {
        this.id = id;
        this.logo_path = logo_path;
        this.name = name;
        this.origin_country = origin_country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogo_path() {
        return logo_path;
    }

    public void setLogo_path(String logo_path) {
        this.logo_path = logo_path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }
}
