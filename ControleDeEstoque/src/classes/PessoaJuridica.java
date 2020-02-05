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
    private float descontoLocacao;
    
    public PessoaJuridica(){
        super();
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

    public float getDescontoLocacao() {
        return descontoLocacao;
    }

    public void setDescontoLocacao(float descontoLocacao) {
        this.descontoLocacao = descontoLocacao;
    }
    
    public String getCPFouCNPJ() {
        return this.cnpj;
    }
    
    public float getDesconto(){
    return this.descontoLocacao/100;
    }

    @Override
    public String getCNHouCNHResp() {
        return this.cnhResponsavel;
    }
    
}
