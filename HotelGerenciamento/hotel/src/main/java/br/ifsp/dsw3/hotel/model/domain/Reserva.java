package br.ifsp.dsw3.hotel.model.domain;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva extends AbstractEntity<Long> {

    @Column(name = "tipo_quarto")
    private int tipoQuarto;

    @Column(name = "nome_cliente")
    private int nomeCliente;

    @Column(name = "data_entrada")
    private Date dataEntrada;

    @Column(name = "data_saida")
    private Date dataSaida;

    @Column(name = "forma_pagamento", length = 205)
    private String formaPagamento;

    @Column(name = "preco")
    private BigDecimal preco;

    // Construtores

    public Reserva() {
    }

    public Reserva(int tipoQuarto, int nomeCliente, Date dataEntrada, Date dataSaida, String formaPagamento, BigDecimal preco) {
        this.tipoQuarto = tipoQuarto;
        this.nomeCliente = nomeCliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.formaPagamento = formaPagamento;
        this.preco = preco;
    }

    // Getters e Setters

    public int getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(int tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public int getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(int nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Reserva [tipoQuarto=" + tipoQuarto + ", nomeCliente=" + nomeCliente + ", dataEntrada=" + dataEntrada
                + ", dataSaida=" + dataSaida + ", formaPagamento=" + formaPagamento + ", preco=" + preco + "]";
    }
}

