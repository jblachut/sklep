package ui;

import java.util.Scanner;

public class Menu {
    public void wyświetl (){
        System.out.println("1 - dodaj alkohol");
        System.out.println("2 - usuń alkohol");
        System.out.println("3 - wyświetl stan");
        System.out.println("q - wyjscie");
        String wybor;
do {
    System.out.println("podaj wybór");
    Scanner wejscie = new Scanner(System.in);
    wybor = wejscie.nextLine();

    switch (wybor) {
        case "1":
            System.out.println("Dodanie pozycji");
            break;
        case "2":
            System.out.println("Usunięcie pozycji");
            break;

        case "3":
            System.out.println("Wyświetl stan");
            break;
        case "q":
            System.out.println("Wyjscie z programu");
            break;
            default:
                System.out.println("Błędna opcja, spróbuj jeszcze raz");

    }

} while (!wybor.equals("q"));


    }
}
