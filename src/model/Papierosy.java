package model;

import java.math.BigDecimal;

public class Papierosy extends Produkt {


        private String rodzaj;
        private String ilosc;


        public Papierosy (String nazwa, BigDecimal cena, String rodzaj, String ilosc) {
           super(nazwa,cena);
            this.rodzaj=rodzaj;
            this.ilosc=ilosc;
        }
    public String getTyp() {
        return "papieros" ;

    }
    public String toString() {//BY PO WYSWIETLENIU TABLIC NIE WYSWIETLAŁO ADRESU TABLICY A DANE
        return super.toString()+"\t"+this.rodzaj+"\t"+this.ilosc;
    }
}



