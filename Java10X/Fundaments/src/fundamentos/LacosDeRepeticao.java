package fundamentos;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        int numeroDeClones = 0;
        int numeroMaximoClones = 50;

        /*

        while (numeroDeClones <= numeroMaximoClones) {
            numeroDeClones++; // interar
            System.out.println("O naruto fez um clone" + numeroDeClones);
        }

        */

        // FOR

        for (int i = 0; i <= numeroMaximoClones; i++) {
            System.out.println("O naruto fez um clone" + i);
        }
    }
}
