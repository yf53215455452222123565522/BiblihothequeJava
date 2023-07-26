package com.example.biblioteque.Repository;

import com.example.biblioteque.Entity.EtudiantsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantsRepositoy extends JpaRepository<EtudiantsEntity,Long> {

}
