package com.example.biblioteque.Controller;

import com.example.biblioteque.Entity.EtudiantsEntity;
import com.example.biblioteque.Entity.LivresEntity;
import com.example.biblioteque.Services.EtudiantsServices;
import com.example.biblioteque.Services.LivresServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/Livres")
public class LivresController {
    @Autowired
    private LivresServices livresServices;



    @PostMapping
    public ResponseEntity<LivresEntity> saveLivres(@RequestBody LivresEntity livresEntity) {
        System.out.println("liv "+livresEntity);
        livresServices.saveLivres(livresEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();}


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLivres(@PathVariable Long id) {
        livresServices.deleteLivres(id);
        return ResponseEntity.noContent().build();
    }


    @PutMapping("/update/{id}")
    public LivresEntity updateLivres(@PathVariable Long id, @RequestBody LivresEntity updatedLivres) {
        LivresEntity optionalLivres = livresServices.updateLivres(id,updatedLivres);
        return optionalLivres;

    }


    @GetMapping("/listlivres")
    public List<LivresEntity> getAllLivres(){
        return livresServices.list();
    }
}
