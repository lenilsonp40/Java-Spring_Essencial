package fundamentos;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escolha um personagem");
        System.out.println("1- Naruto Uzumaki");
        System.out.println("2- Sasuke Uchiha");
        System.out.println("3- Sakura Haruno");

        int escolhaDoUsuario = caixaDeTexto.nextInt();

        System.out.println("Você digitou o numero: " + escolhaDoUsuario);

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuario escolheu o Sakura Haruno");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida!");
        }



        caixaDeTexto.close();

    }
}
