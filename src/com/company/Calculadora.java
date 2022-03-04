package com.company;

public class Calculadora {


    public static void soma(double num1, double num2) {

            double result =  num1 + num2;
            System.out.println("SOMA");
            System.out.println(+num1+ "+" +num2+ "=" +result);
        }
    public static void sub(double num1, double num2){

            double result =  num1 - num2;
            System.out.println("SUBTRAÇÃO");
            System.out.println(+num1+ "+" +num2+ "=" +result);
        }
    public static void div(double num1,double num2){

            double result =  num1 / num2;
            System.out.println("DIVISÃO");
            System.out.println(+num1+ "+" +num2+ "=" +result);

        }
    public static void mult(double num1, double num2) {

            double result =  num1 * num2;
             System.out.println("MULTIPLICAÇÃO");
             System.out.println(+num1+ "+" +num2+ "=" +result);

        }
}
