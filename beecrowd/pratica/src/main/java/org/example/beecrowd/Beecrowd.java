package org.example.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        System.out.println("Digite um valor: ");
        double raio = sc.nextDouble();
        // Math.pow(raio, 2) é uma forma segura de elevar o raio ao quadrado
        double area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);

        sc.close();
    }
}
