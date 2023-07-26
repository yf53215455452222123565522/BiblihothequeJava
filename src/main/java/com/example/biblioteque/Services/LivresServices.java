package com.example.biblioteque.Services;

import com.example.biblioteque.Entity.EtudiantsEntity;
import com.example.biblioteque.Entity.LivresEntity;
import com.example.biblioteque.Repository.LivresRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class LivresServices {
    @Autowired
    private LivresRepository livresRepository;

    public void saveLivres(LivresEntity livresaved) {
        livresaved.setQuatité(0);
        livresRepository.save(livresaved);

    }
    public void deleteLivres(Long id) {
        livresRepository.deleteById(id);
    }
    public LivresEntity updateLivres(Long id, LivresEntity livresEntity) {
        Optional<LivresEntity> optionalLivres = livresRepository.findById(id);
        if (optionalLivres.isPresent()) {
            LivresEntity existingLivres = optionalLivres.get();
            existingLivres.setNom(livresEntity.getNom());
            existingLivres.setQuatité(livresEntity.getQuatité());
            return livresRepository.save(existingLivres);
        } else {
            throw new NoSuchElementException("Le Livre avec l'ID spécifié n'existe pas.");
        }
    }
    public List<LivresEntity> list(){
        return livresRepository.findAll();
    }



}
