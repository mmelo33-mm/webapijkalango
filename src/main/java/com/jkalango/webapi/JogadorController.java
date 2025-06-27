package com.jkalango.webapi;
import org.springframework.web.bind.annotation.RestController;
import com.jkalango.webapi.jogadores.DadosCadastroJogador;
import com.jkalango.webapi.jogadores.Jogador;
import com.jkalango.webapi.jogadores.JogadorRepository;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/jogador") //definindo a rota do "site"
public class JogadorController {

    @Autowired
    private JogadorRepository repository;

@PostMapping
@Transactional// faz a transação para o banco de dados
public void cadastrar(@RequestBody DadosCadastroJogador dados){
//System.out.println(dados);
repository.save(new Jogador(dados));
    }
}
