package com.livraria.gerenciamento.controller;

import com.livraria.gerenciamento.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/autor")
public class AutorController {

   private  AutorService autorService;

   @Autowired
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }
}
