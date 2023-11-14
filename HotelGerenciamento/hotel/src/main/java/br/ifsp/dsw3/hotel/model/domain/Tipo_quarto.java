package br.ifsp.dsw3.hotel.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_quarto")
public class Tipo_quarto extends AbstractEntity<Long> {

    @Column(name = "descricao", length = 205)
    private String descricao;

    @Column(name = "codigo", length = 205)
    private String codigo;

    // Construtores

    public TipoQuarto() {
    }

    public TipoQuarto(String descricao, String codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    // Getters e Setters

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "TipoQuarto [descricao=" + descricao + ", codigo=" + codigo + "]";
    }
}


