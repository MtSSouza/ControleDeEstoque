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
public abstract class Cliente {
   
    private String nome;
    private String endereco;

    public Cliente(){
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public abstract String getCPFouCNPJ();
    
    public abstract String getCNHouCNHResp();
    
}
