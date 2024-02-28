package com.solredes.sports.Solredessports.Controller;

import com.solredes.sports.Solredessports.model.Deporte;
import com.solredes.sports.Solredessports.model.TorneoDeporte;
import com.solredes.sports.Solredessports.service.TorneoDeporteService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/torneodeporte/")
public class TorneoDeporteController {

    @Autowired
    private TorneoDeporteService torneoDeporteService;

    @RequestMapping(value = {"/all/"}, method = RequestMethod.GET)
    private ResponseEntity<List<TorneoDeporte>> getAllTorneoDeportes(){
        return ResponseEntity.ok(torneoDeporteService.findAll());
    }

    @RequestMapping(value = {"/bytorneoid/{id}"}, method = RequestMethod.GET)
    private ResponseEntity<List<Deporte>> getAlldeportesbyidtorneo(@PathVariable("id") int idtorneo){
        return ResponseEntity.ok(torneoDeporteService.findbyidtorneo(idtorneo));
    }

    @RequestMapping(value = {"/byids/{idtorneo}/{iddeporte}"}, method = RequestMethod.GET)
    private ResponseEntity<Integer> gettorneodeportebyids(@PathVariable("idtorneo") int idtorneo,  @PathVariable("iddeporte")int iddeporte){
        return ResponseEntity.ok(torneoDeporteService.findbyids(idtorneo, iddeporte));
    }
}
