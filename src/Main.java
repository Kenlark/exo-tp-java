import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Entrer le rayon: ");
    int rayon =  scanner.nextInt();

    double P = 2 * Math.PI * rayon;
    System.out.println(P);


    }
}