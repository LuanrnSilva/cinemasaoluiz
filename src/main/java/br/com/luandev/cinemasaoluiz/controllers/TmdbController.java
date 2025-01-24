package br.com.luandev.cinemasaoluiz.controllers;

import br.com.luandev.cinemasaoluiz.dto.TmdbDTO;
import br.com.luandev.cinemasaoluiz.services.TmdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tmdb")
public class TmdbController {

    @Autowired
    private TmdbService tmdbService;

    @GetMapping("/consulta/{id}")
    public ResponseEntity<TmdbDTO> consultaTmdb(@PathVariable  String id) {
        return ResponseEntity.ok(tmdbService.consultaTmdb(id));
    }


}
