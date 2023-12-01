package br.edu.ifsp.dsw3.hotel.model.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_quarto")
public class TipoQuarto extends AbstractEntity<Long> {

    @Column(name = "descricao", length = 205)
    private String descricao;

    @Column(name = "codigo", length = 205)
    private String codigo;

    public TipoQuarto() {
    }

    public TipoQuarto(String descricao, String codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

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