import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int Framboise = 7;
    int Fraise = 8;
    int Banane = 6;
    int Mangue = 10;
    int Pastèque = 9;
    int pomme = 5;
    int a = 0;

    System.out.println("Bienvenue à l'épicerie!");
    System.out.println("Voulez-vous achetez un aliment?");
    System.out.println("Si oui veuillez entrer 1 si non veuillez entrer 2");
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();

    while (true)
    if (a==1) {
        System.out.println("Voici la liste des aliments: Framboise , Fraise , Banane , Mangue , Pastèque , Pomme.");
    break;
    }
    else if (a == 2) {
            System.out.println("Nous sommes désolé de ne pas avoir l'aliment que vous cherchez.");
        break;
    }


    }
}