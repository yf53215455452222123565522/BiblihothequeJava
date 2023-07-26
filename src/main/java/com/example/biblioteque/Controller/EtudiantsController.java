package com.example.biblioteque.Controller;

import com.example.biblioteque.Entity.EtudiantsEntity;
import com.example.biblioteque.Services.EtudiantsServices;
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
@RequestMapping("/Etudiant")
public class EtudiantsController {
    @Autowired
    private  EtudiantsServices etudiantsServices;



        @PostMapping

        public ResponseEntity<EtudiantsEntity> saveEtudiant(@RequestBody EtudiantsEntity etudiantsEntity) {
            System.out.println("etu "+etudiantsEntity);
            etudiantsServices.saveEtudiant(etudiantsEntity);
            return ResponseEntity.status(HttpStatus.CREATED).build();}
             @DeleteMapping("/{id}")
            public ResponseEntity<Void> deleteEtudiant(@PathVariable Long id) {
                etudiantsServices.deleteEtudiant(id);
                return ResponseEntity.noContent().build();
            }
    @PutMapping("/update/{id}")
    public EtudiantsEntity updateEtudiant(@PathVariable Long id, @RequestBody EtudiantsEntity updatedEtudiant) {
        EtudiantsEntity optionalEtudiant = etudiantsServices.updateEtudiant(id,updatedEtudiant);
        return optionalEtudiant;

    }

    @GetMapping("/listetudiants")
    public List<EtudiantsEntity> getAllEtudiants(){
            return etudiantsServices.list();
    }



    }









