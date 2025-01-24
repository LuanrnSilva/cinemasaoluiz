package br.com.luandev.cinemasaoluiz.services;

import br.com.luandev.cinemasaoluiz.dto.TmdbDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TmdbService {

    @Value("${tmdb.api.key}")
    private String apiKey;


    public TmdbDTO consultaTmdb(String id) {
        String url = "https://api.themoviedb.org/3/movie/"+ id + "?api_key=" + apiKey + "&language=pt-BR";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<TmdbDTO> tmdbDTO = restTemplate.getForEntity(url, TmdbDTO.class);
        return tmdbDTO.getBody();
    }
}
