/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestaoolimpiada;

import java.util.ArrayList;

/**
 *
 * @author Notorius B.I.G
 */
public class JogosRio2016 {

    private String nome;
    private ArrayList<Participantes> participantes;

    public JogosRio2016(String nome) {

        this.nome = nome;
        this.participantes = new ArrayList<>();

    }

    public void addAtleta(String nome, String modalidade, String pais, String pontos) {
        this.participantes.add(new Atletas(nome, modalidade, pais, pontos));
    }

    public void addComisaoTecnica(String nome, String modalidade , String profissao) {
        this.participantes.add(new ComisaoTecnica(nome, modalidade ,profissao));
    }

    //Pesquisa
    public boolean pesquisa(String chave) {
        for (Participantes item : participantes) {
            if (item.contemNome(chave)) {
                return true;
            }
        }

        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
