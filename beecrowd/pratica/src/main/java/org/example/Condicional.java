package org.example;

public class Condicional {
    public static void main(String[] args) {

        double nota1 = 10;
        double nota2 = 5;
        double nota3 = 7.5;
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média é: " + media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 6) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}
