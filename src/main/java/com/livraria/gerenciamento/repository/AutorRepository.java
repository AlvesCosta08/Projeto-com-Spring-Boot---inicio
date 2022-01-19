package com.livraria.gerenciamento.repository;

import com.livraria.gerenciamento.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor , Long> {
}
