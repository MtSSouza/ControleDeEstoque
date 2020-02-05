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
public class PessoaFisica extends Cliente{
    
    private String cpf;
    private String cnh;
    private Date dtNascimento;
    
    public PessoaFisica(){
        super();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String getCPFouCNPJ() {
        return this.cpf;
    }

    @Override
    public String getCNHouCNHResp() {
       return this.cnh;
    }
    
    
    
}
