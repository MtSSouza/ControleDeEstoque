/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author matheus.souza
 */
public class PessoaJuridica extends Cliente{
    
    private String cnpj;
    private String cnhResponsavel;
    private String descontoLocacao;
    
    public PessoaJuridica(){
        
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnhResponsavel() {
        return cnhResponsavel;
    }

    public void setCnhResponsavel(String cnhResponsavel) {
        this.cnhResponsavel = cnhResponsavel;
    }

    public String getDescontoLocacao() {
        return descontoLocacao;
    }

    public void setDescontoLocacao(String descontoLocacao) {
        this.descontoLocacao = descontoLocacao;
    }
    
    
    
}
