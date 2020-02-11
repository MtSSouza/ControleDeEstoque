/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author matheus.souza
 */
public class Locacao {

    private boolean isAtiva;
    private boolean isFinalzada;
    private String codigo;
    private Date dataLocacao;
    private Date dataEntrega;
    private int qtdDiasLocado;
    private float valorTotalLocacao;
    private Carro carro;
    private Cliente cliente;

    public Locacao() {
        
        Random rand = new Random();
        Date date = new Date();

        this.codigo = Integer.toString(date.getYear()) + Integer.toString(1000 + rand.nextInt(10000));

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean getIsAtiva() {
        return isAtiva;
    }

    public void setIsAtiva(boolean isAtiva) {
        this.isAtiva = isAtiva;
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

    public boolean getIsFinalzada() {
        return isFinalzada;
    }

    public void setIsFinalzada(boolean isFinalzada) {
        this.isFinalzada = isFinalzada;
    }

    public long qtdDiasLocado() {
        try {
            SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
            Date date = new Date();

            Date dtInicio = this.dataLocacao;
            Date dtFim = this.dataEntrega;

            long difMilisegundos = Math.abs(dtFim.getTime() - dtInicio.getTime());
            long dif = TimeUnit.DAYS.convert(difMilisegundos, TimeUnit.MILLISECONDS);

            return dif;

        } catch (Exception e) {
            return 0;
        }
    }
    
    public void valorLocacao(){
        this.valorTotalLocacao = carro.getValorDiariaLocacao() * this.qtdDiasLocado();
    }

}
