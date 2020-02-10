/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Cliente;
import classes.Locacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class LocacaoDados {

    public static ArrayList<Locacao> lstLocacao = new ArrayList<Locacao>();

    public static Locacao obterLocacaoPorCodigo(String codigoLocacao, List<Locacao> locacoes) {

        for (Locacao locacao : locacoes) {

            if (locacao.getCodigo().equals(codigoLocacao)) {
                return locacao;
            }

        }

        return null;
    }

}
