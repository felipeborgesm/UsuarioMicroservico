package com.letscode.Usuario.dto;

import com.letscode.Usuario.model.Usuario;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class UsuarioResponse {
    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataCriacao;
    private LocalDate dataAtualizacao;

    public UsuarioResponse(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.cpf = usuario.getCpf();
        this.dataCriacao = usuario.getDataCriacao();
        this.dataAtualizacao = usuario.getDataAtualizacao();
    }
}
