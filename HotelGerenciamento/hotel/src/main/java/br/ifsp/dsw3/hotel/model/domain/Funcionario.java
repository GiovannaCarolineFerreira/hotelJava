package br.ifsp.dsw3.hotel.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario extends AbstractEntity<Long> {

    @Column(name = "nome_completo", length = 205)
    private String nomeCompleto;

    @Column(name = "login", length = 205)
    private String login;

    @Column(name = "senha", length = 205)
    private String senha;

    // Construtores

    public Funcionario() {
    }

    public Funcionario(String nomeCompleto, String login, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.login = login;
        this.senha = senha;
    }

    // Getters e Setters

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario [nomeCompleto=" + nomeCompleto + ", login=" + login + ", senha=" + senha + "]";
    }
}

