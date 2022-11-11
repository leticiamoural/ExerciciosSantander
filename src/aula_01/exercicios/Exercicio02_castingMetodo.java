package aula_01.exercicios;

import java.util.Scanner;

public class Exercicio02_castingMetodo {
    public static void main(String[] args) {

        int idade;
        Scanner idadeDigitada;

        idadeDigitada = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        idade = idadeDigitada.nextInt();

        System.out.println("Seu número da sorte é: " + converteESoma(idade));
    }

    public static double converteESoma(int idadeDigitada) {
        double numeroASerSomado = (double) idadeDigitada;
        return numeroASerSomado + 0.023;
    }
}
