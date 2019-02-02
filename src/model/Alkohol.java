package model;

import java.math.BigDecimal;

public class Alkohol {
    private static  int generator =1;

    private int id;
    private String nazwa;
    private BigDecimal cena;
    private String litraz;
    private String procent;

    public Alkohol(String nazwa, BigDecimal cena, String litraz, String procent) {
        this.id=generator; // mozna tez od razu generator ++
        generator++;
        this.nazwa=nazwa;
        this.cena=cena;
        this.litraz=litraz;
        this.procent=procent;
    }
    public int getId(){              //możemy odwoływać się do danego pola mimo że jest prywatne
        return id;
    }
    @Override
    public String toString() { //BY PO WYSWIETLENIU TABLIC NIE WYSWIETLAŁO ADRESU TABLICY A DANE
        return this.nazwa + " - " + String.valueOf(this.cena) + "PLN";
    }
    }

