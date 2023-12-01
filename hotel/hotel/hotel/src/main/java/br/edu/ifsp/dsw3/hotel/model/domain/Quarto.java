package br.edu.ifsp.dsw3.hotel.model.domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "quarto")
public class Quarto extends AbstractEntity<Long> {

    @Column(name = "numero")
    private int numero;

    @Column(name = "nome", length = 205)
    private String nome;

    @Column(name = "preco")
    private BigDecimal preco;

    @Column(name = "tipo_quarto_id")
    private int tipoQuartoId;

    public Quarto() {
    }

    public Quarto(int numero, String nome, BigDecimal preco, int tipoQuartoId) {
        this.numero = numero;
        this.nome = nome;
        this.preco = preco;
        this.tipoQuartoId = tipoQuartoId;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getTipoQuartoId() {
        return tipoQuartoId;
    }

    public void setTipoQuartoId(int tipoQuartoId) {
        this.tipoQuartoId = tipoQuartoId;
    }

    @Override
    public String toString() {
        return "Quarto [numero=" + numero + ", nome=" + nome + ", preco=" + preco + ", tipoQuartoId=" + tipoQuartoId + "]";
    }
}
