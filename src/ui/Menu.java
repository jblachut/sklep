package ui;

import io.PlikiBinarne;
import model.Alkohol;
import model.Papierosy;
import model.Sklep;

import java.math.BigDecimal;
import java.util.Scanner;


public class Menu {
    public void wyświetl (){

        PlikiBinarne pliki = new PlikiBinarne();
        Sklep sklep;
        try {
            sklep = pliki.odczyt();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Nie udało się wczytać sklepu");
            sklep = new Sklep("Alkohole");
        }

        System.out.println("1 - dodaj alkohol");
        System.out.println("2 - usuń alkohol");
        System.out.println("3 - dodaj papierosy");
        System.out.println("4 - usuń papierosy");
        System.out.println("5 - wyświetl stan");
        System.out.println("q - wyjscie");
        String wybor;
do {
    System.out.println("podaj wybór");
    Scanner wejscie = new Scanner(System.in);



    wybor = wejscie.nextLine();

    switch (wybor) {
        case "1":{
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
            sklep.dodaj(alkohol);


            break;}
        case "2":{
            System.out.println("Usunięcie pozycji");
            System.out.println("Podaj id produktu");
            int id =wejscie.nextInt();
            sklep.usun(id);
            break;}


        case "3":{
            System.out.println("Dodanie papierosów");
            System.out.println("Podaj nazwę");
            String nazwa=wejscie.nextLine();
            System.out.println("Podaj cene");
            BigDecimal cena=wejscie.nextBigDecimal();
            wejscie.nextLine();
            System.out.println("Podaj ilosc");
            String ilosc=wejscie.nextLine();
            System.out.println("Podaj procent");
            String rodzaj=wejscie.nextLine();

            Papierosy papierosy = new Papierosy (nazwa, cena, ilosc, rodzaj);
            sklep.dodaj(papierosy);


            break;}
        case "4":{
            System.out.println("Usunięcie pozycji papierosów");
            System.out.println("Podaj id produktu");
            int id =wejscie.nextInt();
            sklep.usun(id);
            break;}

        case "5":{
            System.out.println("Wyświetl wszystkie produkty");
            System.out.println(sklep);
            break;}

        case "q":{
            pliki.zapis(sklep);
            System.out.println("Wyjscie z programu");

            break;}
            default:{
                System.out.println("Błędna opcja, spróbuj jeszcze raz");
            }


    }

} while (!wybor.equals("q"));


    }
}
