/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Cliente;
import classes.PessoaFisica;
import classes.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class ClienteDados {

    public static ArrayList<Cliente> lstClientes = new ArrayList<Cliente>();

    public static Cliente obterClientePorCPFouCNPJ(String CPFOuCNPJ, List<Cliente> clientes) {

        for (Cliente cliente : clientes) {
            if (CPFOuCNPJ.length() == 14) {
                if (cliente instanceof PessoaJuridica) {
                    String clienteCPFCNPJ = "";
                    String temp = cliente.getCPFouCNPJ();

                    String[] clienteCPFCNPJSplit = temp.split("[./-]");

                    for (String s : clienteCPFCNPJSplit) {
                        clienteCPFCNPJ += s;
                    }

                    if (clienteCPFCNPJ.equals(CPFOuCNPJ)) {
                        return cliente;
                    }
                } else {

                    if (cliente.getCPFouCNPJ().equals(CPFOuCNPJ)) {
                        return cliente;
                    }

                }

            } else if (CPFOuCNPJ.length() == 11) {

                String clienteCPFCNPJ = "";
                String temp = cliente.getCPFouCNPJ();

                String[] clienteCPFCNPJSplit = temp.split("[.-]");

                for (String s : clienteCPFCNPJSplit) {
                    clienteCPFCNPJ += s;
                }

                if (clienteCPFCNPJ.equals(CPFOuCNPJ)) {
                    return cliente;
                }

            } else if (CPFOuCNPJ.length() == 18) {

                if (cliente.getCPFouCNPJ().equals(CPFOuCNPJ)) {
                    return cliente;
                }

            }
        }

        return null;
    }
}
