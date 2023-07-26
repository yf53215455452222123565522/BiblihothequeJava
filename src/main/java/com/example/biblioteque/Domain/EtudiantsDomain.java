package com.example.biblioteque.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public class EtudiantsDomain {
    @Getter
    @Setter

    private UUID id;
    @Setter
    @Getter
    private String nom;
    @Setter
    @Getter
    private String prenom;
    @Getter
    @Setter
    private String cin;
    @Getter
    @Setter
    private String filiere;


}
