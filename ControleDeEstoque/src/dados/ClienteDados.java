/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class ClienteDados {
        public static ArrayList<Cliente> lstClientes = new ArrayList<Cliente>();
        
        public static Cliente obterClientePorNome(String nome, List<Cliente> carros){
        
        for (Cliente cliente : carros) {
            
            if(cliente.getNome().equals(nome)){
                return cliente;
            }            
        }
        
        return null;        
    }
}
