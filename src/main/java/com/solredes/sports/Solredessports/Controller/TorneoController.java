package com.solredes.sports.Solredessports.Controller;

import com.solredes.sports.Solredessports.model.Torneo;
import com.solredes.sports.Solredessports.service.TorneoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/torneo/")
public class TorneoController {

    @Autowired
    private TorneoService torneoService;

    @GetMapping
    private ResponseEntity<List<Torneo>> getalltorneos(){
        return ResponseEntity.ok(torneoService.findAll());
    }

    @RequestMapping(value = {"/byid/{id}"}, method = RequestMethod.GET)
    private Optional<Torneo> gettornetobyid(@PathVariable("id") Long idtorneo){
        return torneoService.findById(idtorneo);
    }
}
