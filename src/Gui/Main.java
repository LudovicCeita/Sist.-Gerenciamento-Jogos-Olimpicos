package Gui;

import sistemagestaoolimpiada.JogosRio2016;
import Util.Teclado;
import sistemagestaoolimpiada.ResultPorModaslidades;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Notorius B.I.G
 */
public class Main {

    private static ResultPorModaslidades ranking = new ResultPorModaslidades();

    public static String menu() {
        Teclado.lerMenu(1);
        return "1- Cadastrar Atleta \n2- Cadastrar Comisao Tecnica \n3- Pesquisar \n4- Raking ";
    }

    public static void main(String[] args) {
        int opcao;

        JogosRio2016 jogos = new JogosRio2016("Olimpiada do Rio de Janeiro 2016");

        do {
            
            opcao = Teclado.lerInteiro(menu());
            if (opcao == 1) {
                cadastrarAtleta(jogos);
            } else if (opcao == 2) {
                cadastrarTecnica(jogos);
            } else if (opcao == 3) {
                efetuarPesquisa(jogos);
            } else if (opcao == 4) {
                Ranking();
            }

        } while (opcao > 0);
    }

    private static void cadastrarAtleta(JogosRio2016 jogos) {

        String nome = Teclado.lerString("Informe o nome do Atleta : ");
        String modalidade = Teclado.lerString("Informe a modalidade : ");
        String pais = Teclado.lerString("Informe o Pais : ");
        String pontos = Teclado.lerString("Informe os Pontos :");
        jogos.addAtleta(nome, modalidade, pais, pontos);
        ranking.addAtleta(nome, modalidade, pais, pontos);
        ranking.ordenarListaRanking();
      
    }

    private static void cadastrarTecnica(JogosRio2016 jogos) {
        String nome = Teclado.lerString("Informe o nome Comiter Tecnico :");
        String modalidade = Teclado.lerString("Informe a modalidade : ");
        Teclado.lerMenu(4);
        String profissao = Teclado.lerString("Qual e a Cargo :");       
        jogos.addComisaoTecnica(nome, modalidade , profissao);
        ranking.addComisaoTecnica(nome, modalidade, profissao);
        ranking.ordenarListaRanking();
    }

    private static void efetuarPesquisa(JogosRio2016 jogos) {
        String chave = Teclado.lerString("Informe a chave de busca : \n");
        if (jogos.pesquisa(chave)) {
            System.out.println("Atleta/Comisao esta presente\n");
        } else {
            System.out.println("Atleta/Comisao NAO esta presente\n");
        }
    }

    private static void Ranking() {
        ranking.ordenarListaRanking();
        ranking.mostrarParticipantes();
    }
}
