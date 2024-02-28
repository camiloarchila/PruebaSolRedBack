package com.solredes.sports.Solredessports.Controller;

import com.solredes.sports.Solredessports.model.Deporte;
import com.solredes.sports.Solredessports.model.Torneo;
import com.solredes.sports.Solredessports.service.DeporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/deporte/")
public class DeporteController {

    @Autowired
    private DeporteService deporteService;

    @GetMapping
    private ResponseEntity<List<Deporte>> getalldeportes(){
        return ResponseEntity.ok(deporteService.findAll());
    }

    @RequestMapping(value = {"/byid/{id}"}, method = RequestMethod.GET)
    private Optional<Deporte> gettornetobyid(@PathVariable("id") Long iddeporte){
        return deporteService.findById(iddeporte);
    }
}
