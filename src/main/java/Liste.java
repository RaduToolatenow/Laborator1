//Aplicatie 1.7.2

import java.util.ArrayList;
import java.util.Random;

public class Liste {


    static java.util.Random rand = new Random();
    static ArrayList<Integer> lista1 = new ArrayList<>();
    static ArrayList<Integer> lista2 = new ArrayList<>();


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int numar = 5 + rand.nextInt(21);
            lista1.add(numar);

        }

        for (int numar : lista1) {
            if (numar >= 10 && numar <= 20) {
                lista2.add(numar);
            }

        }

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        //min max lista 1
        int min1 = lista1.get(0);
        int max1 = lista1.get(0);
        for (int numar : lista1) {
            if (numar < min1)
                min1 = numar;
            if (numar > max1)
                max1 = numar;
        }

        System.out.println("Min: " + min1 + " Max: " + max1);



        //min max lista 2
        int min2 = lista2.get(0);
        int max2 = lista2.get(0);
        for (int numar : lista2) {
            if (numar < min2) min2 = numar;
            if (numar > max2) max2 = numar;
        }
        System.out.println("Min2: " + min2 + " Max2: " + max2);


    }
}
