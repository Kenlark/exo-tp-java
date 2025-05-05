import java.util.Scanner;



public class Main {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

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

        // System.out.print("Entrer l'année : ");
        // int year = scanner.nextInt();

        //if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
          //  System.out.println("C'est une année bissextile");
        //} else {
         //   System.out.println("Ce n'est pas une année bissextile");
        //}

        // Exo nombre de jours dans un mois

        //System.out.print("Entrer le mois: ");
        //int month = scanner.nextInt();


        //int days = switch (month) {
          //  case 1, 3, 5, 7, 8, 10, 12 -> 31;
            //case 4, 6, 9, 11 -> 30;
            //case 2 -> 28;
            //default -> -1; // au cas où le mois est invalide
        //};


        // Exo nombre de jours String

        //System.out.println("Ce mois a " + days + " jours.");

        //System.out.print("Entrer le mois: ");
        //String month = scanner.nextLine().toLowerCase();

        //String days = switch (month) {
        //case "january", "march", "may", "july", "august", "october", "december" -> "31";
        //case "april", "june", "september", "november" -> "30";
        //case "february" -> "28";
        //default -> "Unknown month"; // au cas où le mois est invalide
        //};

        //System.out.println("Ce mois a " + days + " jours.");


        // Exo années string leap

        //System.out.print("Entrer le mois: ");
        //String month = scanner.nextLine().toLowerCase();

        //String days = switch (month) {
          //  case "january", "march", "may", "july", "august", "october", "december" -> "31";
            //case "april", "june", "september", "november" -> "30";
            //case "february" -> {
                //System.out.print("Entrer l'année: ");
              //  int year = scanner.nextInt();
                // Vérifier si l'année est bissextile
                //yield isLeapYear(year) ? "29" : "28";  // Utilisation de yield pour renvoyer la valeur
           // }
            //default -> "Unknown month"; // au cas où le mois est invalide
        //};

        //System.out.println("Ce mois a " + days + " jours.");


        // For jusqu'a 100

       // for (int i = 0; i <= 100; i++) {
         //   System.out.println(i);
        //}

        // Exo afficher les codes des caractères des nombres 1 à 255

        for (int i = 1; i <= 255; i++) {
            System.out.println("Code: " + i + " -> Caractère: " + (char)i);
        }

    }
}