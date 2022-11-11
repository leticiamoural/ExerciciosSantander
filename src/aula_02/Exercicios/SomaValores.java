package aula_02.Exercicios;

public class SomaValores {
    public static void main(String[] args) {

        String jan = "Janeiro: 1543";
        String fev = "Fevereiro: 1222";
        String mar = "Março: 1234";

        String values = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";
        String separateValues [] = values.split(", ");

        System.out.println(separateValues[0]);
        System.out.println(separateValues[1]);
        System.out.println(separateValues[2]);

        String janOnly[] = jan.split(": ");
        String fevOnly[] = fev.split(": ");
        String marOnly[] = mar.split(": ");

        int soma = Integer.parseInt(janOnly[1])+Integer.parseInt(fevOnly[1])+Integer.parseInt(marOnly[1]);
        System.out.println("Total = "+ soma);
    }
}
