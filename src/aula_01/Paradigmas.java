package aula_01;

import java.util.function.BinaryOperator;

public class Paradigmas {


    public static void main(String[] args) {
        //paradigma imperativo : passo-a-passo
        //paradigma estruturado: sequência, decisão e, iteração

//        int a = 2;
//        int b = 3;

//        Calculadora minhaCalculadora = new Calculadora(a,b);
//
//        System.out.println("Soma = " + minhaCalculadora.soma( ));

        //paradigma funcional: imutável

        BinaryOperator <Integer> soma = (a, b) -> a + b;
        int resultado = soma.apply(3,3);
        System.out.println("Soma = " + resultado);
    }
}
