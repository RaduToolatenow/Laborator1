import java.util.Scanner;

public class Main {

    public static class Animal {
        public void eat() {
            System.out.println("Animal eats.");
        }
    }
    public static class Cat extends Animal {
        public void eat() {
            System.out.println("The cat eats.");
        }
    }



    static void main() {
/*
        System.out.println("Hello world!");
        char c = 'a';
        int len = 'z' - 'a';
        for(int i=0; i<=len; i++) {
            int next = c + i;
            char nextChar = (char)next;
            System.out.println(nextChar);
        }
*/
        //Aplicatie 1.7.1

        Inversare cuvant = new Inversare();
        System.out.println("Aplicatie 1.7.1: ");
        System.out.println(cuvant.A_Inceput_Scoala("Dunga"));
        System.out.println(" ");

        //Aplicatie 1.7.3

        Forma forma = new Forma();
        System.out.println("Forma:");
        forma.Drept(4, 4);
        System.out.println("Diagonale");
        forma.diagonale(5);


    }






}
