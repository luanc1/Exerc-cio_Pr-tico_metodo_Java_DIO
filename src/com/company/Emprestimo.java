package com.company;

public class Emprestimo {

    public static  int getDuasParcelas(){
        return 2;
    }
    public static  int getTresParcelas(){
        return 3;
    }
    public static  double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static void calcular(double valor, int parcelas){
        if(parcelas == 2){
             double valorFinal = valor  + (valor + getDuasParcelas());
             System.out.println("valor final para duas parcelas R$=" +valorFinal);
        }else if (parcelas == 3){
            double valorFinal = valor  + (valor + getTresParcelas());
            System.out.println("valor final para três parcelas R$=" +valorFinal);
        }else{
            System.out.println("Quantida de parcelas não aceitas");
        }

    }
}
