package com.company;

public class Variables {
    public static void main(String[] args) {
        // Comentário de uma linha

        /*
        * Comentário
        * de várias
        * linhas
        * */

        // tipoDaVariavel nomeDaVariavel = valorDaVariavel;
        // Tipos primitivos: short, int, long, float, double, char, boolean

        int inteiro = 5;
        System.out.println(inteiro);

        double quebrado = 5.5;
        System.out.println(quebrado);

        char caractere = 'j';
        System.out.println(caractere);

        boolean verdadeiro = true;
        System.out.println(verdadeiro);

        inteiro = (int) 1.194;

        // Operações aritméticas: + - * / %
        // Operações lógicas: && || ! == != > >= < <=

        if(verdadeiro) {
            System.out.println("É verdadeiro!");
        } else {
            System.out.println("É falso!");
        }

        while(inteiro <= 10) {
            System.out.println(inteiro);
            inteiro = inteiro + 1;
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("Uga uga");
        }
    }
}
