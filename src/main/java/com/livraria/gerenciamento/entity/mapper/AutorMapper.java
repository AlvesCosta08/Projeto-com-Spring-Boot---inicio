package com.livraria.gerenciamento.entity.mapper;

import com.livraria.gerenciamento.dto.AutorDTO;
import com.livraria.gerenciamento.entity.Autor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface AutorMapper {
    AutorMapper INSTANCE = Mappers.getMapper(AutorMapper.class);

    Autor toModel(AutorDTO autorDTO);
    AutorDTO toDTO(Autor autor);
}
