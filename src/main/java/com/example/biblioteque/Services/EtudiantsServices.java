package com.example.biblioteque.Services;

import com.example.biblioteque.Entity.EtudiantsEntity;
import com.example.biblioteque.Repository.EtudiantsRepositoy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Service

public class EtudiantsServices {
    @Autowired
    private  EtudiantsRepositoy etudiantsRepositoy;

    public void saveEtudiant(EtudiantsEntity etudiantsEntity) {
        etudiantsRepositoy.save(etudiantsEntity);
    }
    public void deleteEtudiant(Long id) {
        etudiantsRepositoy.deleteById(id);
    }
    public EtudiantsEntity updateEtudiant(Long id, EtudiantsEntity etudiantsEntity) {
        Optional<EtudiantsEntity> optionalEtudiant = etudiantsRepositoy.findById(id);
        if (optionalEtudiant.isPresent()) {
            EtudiantsEntity existingEtudiant = optionalEtudiant.get();
            existingEtudiant.setNom(etudiantsEntity.getNom());
            existingEtudiant.setPrenom(etudiantsEntity.getPrenom());
            existingEtudiant.setCin(etudiantsEntity.getCin());
            existingEtudiant.setFiliere(etudiantsEntity.getFiliere());
            return etudiantsRepositoy.save(existingEtudiant);
        } else {
            throw new NoSuchElementException("L'étudiant avec l'ID spécifié n'existe pas.");
        }
    }
    public List<EtudiantsEntity> list(){
        return etudiantsRepositoy.findAll();
    }



}
