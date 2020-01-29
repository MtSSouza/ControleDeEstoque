
package dados;

import classes.Carro;
import classes.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labccet
 */
public class CarroDados {
    public static ArrayList<Carro> lstCarros = new ArrayList<Carro>();
    
    public static Carro obterCarroPorPlaca(String placa, List<Carro> carros){
        
        for (Carro carro : carros) {
            
            if(carro.getPlaca().equals(placa)){
                return carro;
            }            
        }
        
        return null;        
    }
}
