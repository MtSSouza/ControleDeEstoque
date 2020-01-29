/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author matheus.souza
 */
public class Carro {
    
    public static ArrayList<Carro> lstCarros = new ArrayList<Carro>();
    
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    
    public Carro(){
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValorDiariaLocacao() {
        return valorDiariaLocacao;
    }

    public void setValorDiariaLocacao(float valorDiariaLocacao) {
        this.valorDiariaLocacao = valorDiariaLocacao;
    }
    private float valorDiariaLocacao;
    
}
