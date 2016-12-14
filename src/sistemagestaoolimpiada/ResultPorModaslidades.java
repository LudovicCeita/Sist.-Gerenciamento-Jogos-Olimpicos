/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestaoolimpiada;

import Util.Teclado;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Notorius B.I.G
 */
public class ResultPorModaslidades {

    private List<Participantes> lista = new ArrayList<>();

    public void addAtleta(String nome, String modalidade, String pais, String pontos) {
        lista.add(new Atletas(nome, modalidade, pais, pontos));
    }

    public void addComisaoTecnica(String nome, String modalidade, String profisao) {
        lista.add(new ComisaoTecnica(nome, modalidade, profisao));
    }

    public void mostrarParticipantes() {
        int cont = 1;
        String modal = Teclado.lerString("Modalidades : \n");

        for (Participantes pessoa : lista) {

            if (pessoa.contemNome(modal)) {
                System.out.print("\t" + cont + "" + pessoa);
                cont++;
            }
        }
        System.out.println("\n\n\n");
    }

    //ordenar uma linked List
    public void ordenarListaRanking() {
        for (int i = 0; i < 100; i++) {
               //Collections.sort(lista);
            Collections.reverse(lista);
        }

    }
}
