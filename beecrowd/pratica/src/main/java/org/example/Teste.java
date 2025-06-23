package org.example;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        float nota1 = sc.nextFloat();

        System.out.println("Digite a nota 2: ");
        float nota2 = sc.nextFloat();

        System.out.println("Digite a nota 3: ");
        float nota3 = sc.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média é: "+ media);





    }

}
