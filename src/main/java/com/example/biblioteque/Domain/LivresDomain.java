package com.example.biblioteque.Domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;
@Setter
@Getter
public class LivresDomain {

    private UUID id;

    private String nom;


}
