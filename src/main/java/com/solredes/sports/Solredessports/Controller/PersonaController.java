package com.solredes.sports.Solredessports.Controller;

import com.solredes.sports.Solredessports.model.Persona;
import com.solredes.sports.Solredessports.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/persona/")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    private ResponseEntity<List<Persona>> getallPersonas(){
        return ResponseEntity.ok(personaService.findAll());
    }

    @PostMapping
    private ResponseEntity<Persona> savepersona(@RequestBody Persona persona) {

        Persona personaguardada = personaService.save(persona);
        try {
            return ResponseEntity.created(new URI("/persona/" + personaguardada.getIdPersona())).body(personaguardada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> deletepersona(@PathVariable("id") Long id){
        personaService.deleteById(id);
        return ResponseEntity.ok(personaService.findById(id).isEmpty());
    }
}
