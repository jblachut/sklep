package model;

import java.math.BigDecimal;

public class Alkohol extends Produkt { //klasa Alkohol dziedziczy z klasy produktu


    private String litraz;
    private String procent;


    public Alkohol(String nazwa, BigDecimal cena, String litraz, String procent) {
        super(nazwa, cena); // super - klasa z której dziedziczymy
        this.litraz=litraz;
        this.procent=procent;
    }
    public String getTyp() {
        return "alko" ;
    }
    public String toString() {//BY PO WYSWIETLENIU TABLIC NIE WYSWIETLAŁO ADRESU TABLICY A DANE
return super.toString()+"\t"+this.litraz+"\t"+this.procent;
    }
    }

