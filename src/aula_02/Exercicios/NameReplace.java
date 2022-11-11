package aula_02.Exercicios;

import java.util.Scanner;

public class NameReplace {
    public static void main(String[] args) {

        Scanner nameInput = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String name = nameInput.nextLine();

        System.out.println("!" + name.replace(" "," !") );

    }
}
