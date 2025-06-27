package com.jkalango.webapi.jogadores;
//record é como se fosse uma classe mas com menos codigo, mais simples.
public record DadosCadastroJogador(String nome,
                                    String nickName,
                                    String email,
                                    String telefone,
                                    String senha) {

}
