package com.example.biblioteque.Repository;

import com.example.biblioteque.Entity.LivresEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LivresRepository extends JpaRepository<LivresEntity,Long> {

}
