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
public class ComisaoTecnica implements Comparable<ComisaoTecnica>, Participantes {

    private String nome;
    private String Modalidade;
    private String Sugestao;
    private int Contrato;
    private String profissao;

    public ComisaoTecnica(String nome, String modalidade, String profissao) {

        this.nome = nome;
        this.Modalidade = modalidade;
        this.profissao = profissao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public String getSugestao() {
        return Sugestao;
    }

    public void setSugestao(String Sugestao) {
        this.Sugestao = Sugestao;
    }

    public int getContrato() {
        return Contrato;
    }

    public void setContrato(int Contrato) {
        this.Contrato = Contrato;
    }

    public String getProfissao() {
        return profissao;
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

    //RAKING 
    @Override
    public int compareTo(ComisaoTecnica o) {
        return getProfissao().compareTo(o.getProfissao());
    }

    @Override
    public String toString() {
        Teclado.lerMenu(3);
        String profissa = Teclado.lerProfisao(getProfissao());
        return "\t\t\t" + getNome() + "\t\t\t" + getModalidade() + "\t\t\t\t" + getSugestao() + "\t\t\t\t" + profissa + "\t\t\n";
    }

}
