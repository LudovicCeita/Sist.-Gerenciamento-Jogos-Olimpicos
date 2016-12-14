/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestaoolimpiada;

import Util.Teclado;

/**
 *
 * @author Notorius B.I.G
 */
public class Atletas implements Comparable<Atletas>, Participantes {

    private String nome;
    private String Modalidade;
    private String pais;
    private String pontuacao;
    private String medalha;

    public Atletas(String nome, String modalidade, String pais, String pontuacao) {
        this.nome = nome;
        this.Modalidade = modalidade;
        this.pais = pais;
        this.pontuacao = pontuacao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setModalidade(String Modalidade) {
        this.Modalidade = Modalidade;
    }

    public String getPais() {
        return pais;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    @Override
    public String getModalidade() {
        return this.Modalidade;
    }
//PESQUISA

    @Override
    public boolean contemNome(String chave) {
        return getNome().contains(chave)
                || getModalidade().contains(chave);
    }

    //RANKING
    @Override
    public int compareTo(Atletas o) {
        return getPontuacao().compareTo(o.getPontuacao());
    }

    @Override
    public String toString() {
        Teclado.lerMenu(2);
        return "\t\t\t" + getNome() + "\t\t\t" + getModalidade() + "\t\t\t\t" + getPais() + "\t\t\t\t" + getPontuacao() + "\n\n";
    }

}
