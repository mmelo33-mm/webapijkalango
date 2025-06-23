package com.jkalango.webapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/fases") //definindo a rota do "site"
public class FaseJogoController {

    @GetMapping
    public int mostrarQtdeFases(){
        return 7;
    }
}
