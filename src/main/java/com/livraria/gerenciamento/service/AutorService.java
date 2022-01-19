package com.livraria.gerenciamento.service;

import com.livraria.gerenciamento.dto.AutorDTO;
import com.livraria.gerenciamento.entity.Autor;
import com.livraria.gerenciamento.entity.mapper.AutorMapper;
import com.livraria.gerenciamento.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    private final static AutorMapper autormapper = AutorMapper.INSTANCE;

    private AutorRepository autorRepository;

    @Autowired
    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public AutorDTO criarAutor(AutorDTO autorDTO){
        Autor autorToCreate =autormapper.toModel(autorDTO);
        Autor createdAutor =autorRepository.save(autorToCreate);

        return autormapper.toDTO(createdAutor);

    }
}
