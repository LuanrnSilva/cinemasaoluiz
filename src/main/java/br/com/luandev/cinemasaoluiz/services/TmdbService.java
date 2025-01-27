package br.com.luandev.cinemasaoluiz.services;

import br.com.luandev.cinemasaoluiz.entities.Tmdb;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TmdbService {

    @Value("${tmdb.api.last.url}")
    private String lastUrl;

    @Value("${tmdb.api.url}")
    private String apiUrl;

    public Tmdb consultaTmdb(String id) {
        String url = apiUrl + id + lastUrl;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Tmdb> tmdb = restTemplate.getForEntity(url, Tmdb.class);
        return tmdb.getBody();
    }
}
