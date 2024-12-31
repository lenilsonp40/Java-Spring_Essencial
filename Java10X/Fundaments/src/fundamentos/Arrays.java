package fundamentos;

public class Arrays {
    public static void main(String[] args) {

        String[] ninjas = new String[3];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";

        

        for (int i = 0; i < ninjas.length ; i++) {
            System.out.println(ninjas[i]);
        }


    }

}
