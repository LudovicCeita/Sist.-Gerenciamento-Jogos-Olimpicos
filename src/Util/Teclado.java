/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Teclado {

    public static int lerInteiro(String mensagem) {
        System.out.println(mensagem);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String lerString(String mensagem) {
        System.out.println(mensagem);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static double lerDouble(String mensagem) {
        System.out.println(mensagem);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static void lerMenu(int n) {

        if (n == 1) {
            System.out.println("\n\n");
            System.out.println("|-----------------------------------------------------|");
            System.out.println("|<<<<<<<<<<<SISTEMA DE GESTAO DE OLIMPIADAS>>>>>>>>>>>|");
            System.out.println("|-----------------------------------------------------|");
        } else if (n == 2) {
            System.out.println("\n");
            System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------|");
            System.out.println("|\tRanking\t\t\tNome\t\t\tModalidade\t\t\tPais\t\t\t\tPontuacao\t  |");
            System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------|");
        } else if (n == 3) {
            System.out.println("\n");
            System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------|");
            System.out.println("|\tNumero\t\t\tNome\t\t\tModalidade\t\t\tSugestao\t\t\tProfisao\t  |");
            System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------------|");
        } else if (n == 4) {
            System.out.println("\n1- Tecnico\n2- Auxiliar Tecnico\n3- Preparador Fisico\n4- Medico\n5- Fisiuterapeuta\n->");
        }
    }
    
    public static String lerProfisao(String numero){
        switch (numero) {
            case "1":
                return "Tecnico";
            case "2":
                return "Auxiliar Tecnico";
            case "3":
                return "Preparador Fisico";
            case "4":
                return "Medico";
            case "5":
                return "Fisiuterapeuta";
        }
        return "Estagiario";
    }

}
