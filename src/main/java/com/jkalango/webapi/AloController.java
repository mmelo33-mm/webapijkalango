package com.jkalango.webapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/alo") //definindo a rota do "site"

public class AloController {
    //requisição e respostas (REQUEST e RESPONSE)
    @GetMapping
    public String aloMundo(){
        return "Alo Mundo - JKalango!";
    }
}