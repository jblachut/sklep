package io;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import model.Sklep;

import java.io.*;
import java.math.BigDecimal;

public class PlikiBinarne {
    public Sklep odczyt () throws Exception {
        Sklep sklep = null;

        FileInputStream fileInputStream = new FileInputStream("sklep.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        sklep = (Sklep) objectInputStream.readObject(); // rzutowanie

        objectInputStream.close();
        fileInputStream.close();
        return sklep;
    }



    public void zapis(Sklep sklep){

        //zapisanie zamowienia binarnie
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("sklep.bin"); // stworzenie nowej klasy Ttworzący plik
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); //dodanie dekoratora - tzn klasy która dodaje nowe właśicowśi poprzedniej klasy
            objectOutputStream.writeObject(sklep); // zapisanie zamówienia w pliku
            objectOutputStream.close(); // zamknięcie strumienia
            fileOutputStream.close();
        } catch(IOException e){ // jeśli się nie uda to:
            System.out.println("brak dostępu do pliku zamówienie.bin");
            e.printStackTrace(); //wyświetl wyjątek i co poszło nie tak
        }
    }}

