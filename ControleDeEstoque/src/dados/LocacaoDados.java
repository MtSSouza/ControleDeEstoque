/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Cliente;
import classes.Locacao;
import classes.PessoaJuridica;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class LocacaoDados {

    public static ArrayList<Locacao> lstLocacao = new ArrayList<Locacao>();
    public static ArrayList<Locacao> lstBuscaLocacao = new ArrayList<Locacao>();

    public static Locacao obterLocacaoPorCodigo(String codigoLocacao, List<Locacao> locacoes) {

        for (Locacao locacao : locacoes) {

            if (locacao.getCodigo().equals(codigoLocacao)) {
                return locacao;
            }

        }

        return null;
    }

    public static void obterLocacaoPorCPFouCNPJ(String CPFOuCNPJ, List<Locacao> locacoes) {

        for (Locacao locacao : locacoes) {
            if (CPFOuCNPJ.length() == 14) {
                if (locacao.getCliente() instanceof PessoaJuridica) {
                    String clienteCPFCNPJ = "";
                    String temp = locacao.getCliente().getCPFouCNPJ();

                    String[] clienteCPFCNPJSplit = temp.split("[./-]");

                    for (String s : clienteCPFCNPJSplit) {
                        clienteCPFCNPJ += s;
                    }

                    if (clienteCPFCNPJ.equals(CPFOuCNPJ)) {
                        lstBuscaLocacao.add(locacao);
                    }
                } else {

                    if (locacao.getCliente().getCPFouCNPJ().equals(CPFOuCNPJ)) {
                        lstBuscaLocacao.add(locacao);
                    }

                }

            } else if (CPFOuCNPJ.length() == 11) {

                String clienteCPFCNPJ = "";
                String temp = locacao.getCliente().getCPFouCNPJ();

                String[] clienteCPFCNPJSplit = temp.split("[.-]");

                for (String s : clienteCPFCNPJSplit) {
                    clienteCPFCNPJ += s;
                }

                if (clienteCPFCNPJ.equals(CPFOuCNPJ)) {
                    lstBuscaLocacao.add(locacao);
                }

            } else if (CPFOuCNPJ.length() == 18) {

                if (locacao.getCliente().getCPFouCNPJ().equals(CPFOuCNPJ)) {
                    lstBuscaLocacao.add(locacao);
                }

            }
        }

    }

    public static void obterLocacaoPorPlacaDoCarro(String placacarro, List<Locacao> locacoes) {

        for (Locacao locacao : locacoes) {

            if (locacao.getCarro().getPlaca().equals(placacarro)) {
                lstBuscaLocacao.add(locacao);
            }

        }

    }

    public static void obterLocacaoPorData(Date dataInicio, Date dataFim, List<Locacao> locacoes) {

        for (Locacao locacao : locacoes) {

            if (locacao.getDataLocacao().getTime() >= dataInicio.getTime() && locacao.getDataLocacao().getTime() <= dataFim.getTime()) {
                lstBuscaLocacao.add(locacao);
            }

        }

    }

}
