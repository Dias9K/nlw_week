package com.example.nlw_week;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/") // entender melhor o que são e pra que servem essas anotações
    public String retornoPrimeiraController() {
        return "Criando a minha primeira Controller";
    }
}
