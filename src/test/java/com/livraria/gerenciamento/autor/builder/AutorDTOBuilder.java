package com.livraria.gerenciamento.autor.builder;

import com.livraria.gerenciamento.dto.AutorDTO;
import lombok.Builder;

@Builder
public class AutorDTOBuilder {

    @Builder.Default
    private final Long id = 1l;

    private final  String nome ="Alves costa";
    private final Integer idade = 47;

    public AutorDTO buildAutorDTO(){
        return new AutorDTO(id,nome,idade);
    }

}
