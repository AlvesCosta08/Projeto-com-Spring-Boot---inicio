package com.livraria.gerenciamento.service;

import com.livraria.gerenciamento.autor.builder.AutorDTOBuilder;
import com.livraria.gerenciamento.dto.AutorDTO;
import com.livraria.gerenciamento.entity.Autor;
import com.livraria.gerenciamento.entity.mapper.AutorMapper;
import com.livraria.gerenciamento.repository.AutorRepository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

@ExtendWith(MockitoExtension.class)
public class AutorServiceTest {

    private final AutorMapper autorMapper =AutorMapper.INSTANCE;

    @Mock
    private AutorRepository autorRepository;
    @InjectMocks
    private  AutorService autorService;

    private AutorDTOBuilder autorDTOBuilder;

    @BeforeEach
    void setUp(){
        autorDTOBuilder = AutorDTOBuilder.builder().build();
        AutorDTO autorDTO = autorDTOBuilder.buildAutorDTO();
    }

    @Test
    void criarNovoAutor() {

        //give
        AutorDTO expectedAutorToCreateDTO = autorDTOBuilder.buildAutorDTO();
        Autor expectedCreateautor =  autorMapper.toModel(expectedAutorToCreateDTO);

        //when
        Mockito.when(autorRepository.save(expectedCreateautor)).thenReturn(expectedCreateautor);

        //then
        AutorDTO createdAutorDTO = autorService.criarAutor(expectedAutorToCreateDTO);

        assertThat(createdAutorDTO , is(IsEqual.equalTo(expectedAutorToCreateDTO)));

    }
}
