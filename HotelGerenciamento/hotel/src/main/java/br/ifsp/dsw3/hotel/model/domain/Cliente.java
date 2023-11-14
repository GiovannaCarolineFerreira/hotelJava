package br.ifsp.dsw3.hotel.model.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends AbstractEntity<Long> {

    @Column(name = "nome", length = 205)
    private String nome;

    @Column(name = "cidade", length = 205)
    private String cidade;

    @Column(name = "telefone", length = 205)
    private String telefone;

    @Column(name = "email", length = 205)
    private String email;

    // Construtores

    public Cliente() {
    }

    public Cliente(String nome, String cidade, String telefone, String email) {
        this.nome = nome;
        this.cidade = cidade;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cidade=" + cidade + ", telefone=" + telefone + ", email=" + email + "]";
    }
}
