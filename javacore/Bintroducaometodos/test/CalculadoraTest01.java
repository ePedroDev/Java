package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
      //  calculadora.somaDoisNumeros();


      //  int num1 = 20
      //  calculadora.mupltiplicaDoisNumeros( num1, 2); -> output = num1 * 2 == 40 :D

        calculadora.divideDoisNumeros(10, 2);

        System.out.println("---------");

        double result = calculadora.divideDoisNumeros(10,2);
        System.out.println(result);

        System.out.println("--------");

        System.out.println(calculadora.divideDoisNumeros(10, 2));

        System.out.println("----------");
        System.out.println(calculadora.divideDoisNumeros02(200, 3));

        System.out.println("----------");
        calculadora.imprimirDivisao(195, 0);
    }
}
