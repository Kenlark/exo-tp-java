import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // Exo Périmètre

    Scanner scanner = new Scanner(System.in);

    // System.out.print("Entrer le rayon: ");
    // int rayon =  scanner.nextInt();

    // double P = 2 * Math.PI * rayon;
    // System.out.println(P);
    // -- //

    System.out.print("Entrer votre âge: ");
    int major = scanner.nextInt();

    if (major < 18) {
        System.out.println("Vous êtes mineur !");
    } else {
        System.out.println("Vous êtes majeur !");
    }

    }
}