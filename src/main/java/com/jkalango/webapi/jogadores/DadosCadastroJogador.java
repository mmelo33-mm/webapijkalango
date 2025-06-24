package com.jkalango.webapi.jogadores;
//record é como se fosse uma classe mas com menos codigo, mais simples.
public record DadosCadastroJogador(String nome,
                                    String nickname,
                                    String email,
                                    String telefone,
                                    String senha) {

}
