package com.jkalango.webapi.jogadores;

import jakarta.persistence.*; //é usada para mapear objetos Java para tabelas em bancos de dados relacionais, ou seja, ela permite que você trabalhe com banco de dados usando objetos Java em vez de escrever SQL diretamente.
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name="jogador")// anotação para o nome da tabela
@Entity(name="Jogador")// nome da classe
@Getter
@NoArgsConstructor //JPA - Solicita um construtor vazio
@AllArgsConstructor
@EqualsAndHashCode(of = "id") //comparar objetos, collections

public class Jogador {
    

    //Identity para o banco especifico. "AUTO" é flexivel caso haja alteração dp banco
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nickName;
    private String email;
    private String telefone;
    private String senha;

public Jogador (DadosCadastroJogador dados){
    this.nome = dados.nome();
    this.nickName = dados.nickName();
    this.email = dados.email();
    this.telefone = dados.telefone();
    this.senha = dados.senha();
}
}
