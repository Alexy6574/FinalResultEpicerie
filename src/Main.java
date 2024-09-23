import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Framboise = 7;
        int Fraise = 8;
        int Banane = 6;
        int Mangue = 10;
        int Pastèque = 9;
        int Pomme = 5;
        int a = 0;
        int A;

        while (true) {
            System.out.println("Bienvenue à l'épicerie!");
            System.out.println("Voulez-vous achetez un aliment?");
            System.out.println("Si oui veuillez entrer 1 si non veuillez entrer 2");
            a = sc.nextInt();

            if (a == 1) {
                System.out.println("Voici la liste des aliments: \n1. Framboise. \n2. Fraise.  \n3. Banane. \n4. Mangue. \n5. Pastèque. \n6. Pomme.");
                break;
            }
            else if (a == 2) {
                System.out.println("Nous sommes désolé de ne pas avoir l'aliment que vous cherchez.");
                return;
            }
            else {
                System.out.println("Erreur");
            }
        }

        while (true) {



            System.out.println("Entrez combiens d'aliments que vous voulez acheter , de 1-1000.");


            // A is the number of fruits
            a = sc.nextInt();

            if (a<1000 && a>0) {
                System.out.println("Entrez l'identifiant de l'article");
                A = sc.nextInt();

                switch (A) {
                    case 1:
                        System.out.println("Le total est de: " + Framboise * a + "$");
                        return;
                    case 2:
                        System.out.println("Le total est de: " + Fraise * a + "$");
                        return;
                    case 3:
                        System.out.println("Le total est de: " + Banane * a + "$");
                        return;
                    case 4:
                        System.out.println("Le total est de: " + Mangue * a + "$");
                        return;
                    case 5:
                        System.out.println("Le total est de: " + Pastèque * a + "$");
                        return;
                    case 6:
                        System.out.println("Le total est de: " + Pomme * a + "$");
                        return;
                }
            }
        }
    }
}