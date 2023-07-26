package com.example.biblioteque.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

    @Entity
    @Getter
    @Setter
    public class LivresEntity {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;
        private String nom;
        private int quatité;

        @Override
        public String toString() {
            return "EtudiantsEntity{" +
                    "id=" + id +
                    ", nom='" + nom + '\'' +'}';

        }



}
