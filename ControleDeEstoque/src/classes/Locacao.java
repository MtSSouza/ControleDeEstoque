/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author matheus.souza
 */
public class Locacao {
    
    private long codigo;
    private Date dataLocacao;
    private Date dataEntrega;
    private int qtdDiasLocado;
    private float valorTotalLocacao;
    private Carro carro;
    private Cliente cliente;
    
    public Locacao(){
        this.valorTotalLocacao = 0.00f;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public int getQtdDiasLocado() {
        return qtdDiasLocado;
    }

    public void setQtdDiasLocado(int qtdDiasLocado) {
        this.qtdDiasLocado = qtdDiasLocado;
    }

    public float getValorTotalLocacao() {
        return valorTotalLocacao;
    }

    public void setValorTotalLocacao(float valorTotalLocacao) {
        this.valorTotalLocacao = valorTotalLocacao;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
