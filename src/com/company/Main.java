package com.company;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("## Exercício Calculadora ##");
        Calculadora.soma(10,10);
        Calculadora.div(10,10);
        Calculadora.mult(10,10);
        Calculadora.sub(10,5);

        // Mensagem
        System.out.println("## Exercício Mensagem ##");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(1);


        // Calcular
         System.out.println("## Exercício Emprestimo ##");
         Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
         Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
         Emprestimo.calcular(1000, 5);

    }
}
