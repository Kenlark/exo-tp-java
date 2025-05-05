import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Exo Périmètre

        // System.out.print("Entrer le rayon: ");
        // int rayon =  scanner.nextInt();

        // double P = 2 * Math.PI * rayon;
        // System.out.println(P);
        // -- //


        // Exo Age

        // System.out.print("Entrer votre âge: ");
        // int major = scanner.nextInt();

        // if (major < 18) {
        // System.out.println("Vous êtes mineur !");
        // } else {
        // System.out.println("Vous êtes majeur !");
        // }

        // Exo nombre pair

        // System.out.print("Entrer votre nombre: ");
        // if (scanner.nextInt() % 2 == 0) {
        // System.out.println("nombre pair");
        //} else {
        //   System.out.println("nombre impair");
        // }

        // Exo année bissextile

        System.out.print("Entrer l'année : ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("C'est une année bissextile");
        } else {
            System.out.println("Ce n'est pas une année bissextile");
        }
    }
}