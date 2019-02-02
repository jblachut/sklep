package model;

import java.math.BigDecimal;

public abstract class Produkt {  //abstraktcyjna klasa nie pozwala na odwołanie bezpośrednie - trzeba przez klasy córki
    private static int generator =1;

    protected int id;
    protected String nazwa;
    protected BigDecimal cena;

    public Produkt(String nazwa, BigDecimal cena) {
        this.id=generator++;
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public int getId(){              //możemy odwoływać się do danego pola mimo że jest prywatne
        return id;
    }

    public String getTyp() {
        return "produkt";
    }

    @Override
    public String toString() { //BY PO WYSWIETLENIU TABLIC NIE WYSWIETLAŁO ADRESU TABLICY A DANE
        return this.id + "\t" + getTyp()  + "\t"+ this.nazwa + "\t " + this.cena + "PLN" ;
    }
}
