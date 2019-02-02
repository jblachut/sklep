package ui;

import model.Alkohol;
import model.Sklep;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {
    public void wyświetl (){
        System.out.println("1 - dodaj alkohol");
        System.out.println("2 - usuń alkohol");
        System.out.println("3 - wyświetl stan");
        System.out.println("q - wyjscie");

        String wybor;
        Sklep sklep= new Sklep("Alkohole xxx");
do {
    System.out.println("podaj wybór");
    Scanner wejscie = new Scanner(System.in);



    wybor = wejscie.nextLine();

    switch (wybor) {
        case "1":
            System.out.println("Dodanie pozycji");
            System.out.println("Podaj nazwę");
            String nazwa=wejscie.nextLine();
            System.out.println("Podaj cene");
            BigDecimal cena=wejscie.nextBigDecimal();
            wejscie.nextLine();
            System.out.println("Podaj litraż");
            String litraz=wejscie.nextLine();
            System.out.println("Podaj procent");
            String procent=wejscie.nextLine();

            Alkohol alkohol = new Alkohol (nazwa, cena, litraz, procent);
            sklep.dodajAlkohol(alkohol);


            break;
        case "2":
            System.out.println("Usunięcie pozycji");
            break;

        case "3":
            System.out.println("Wyświetl stan");
            sklep.wyswietl();
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
