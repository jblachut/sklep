package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Sklep implements Serializable {

    private  String nazwa;
    private List<Produkt> produkty;

    public Sklep(String nazwa){
        this.nazwa=nazwa;
        this.produkty= new ArrayList<>();

    }



    public void dodaj(Produkt produkt){
            produkty.add(produkt);
}

    public void usun(int id){
        //for(Alkohol alkohol : alkohole){
       //     if (alkohol.id == id) {
       //         alkohole.remove(alkohol);
         //   }
  //  }
        Iterator<Produkt> iterator=produkty.iterator();
        while (iterator.hasNext()){
            Produkt produkt = iterator.next();
            if (produkt.getId() == id) {
                iterator.remove();
            }
        }

    }

 //   public void wyswietl() {                    // pierwszy sposób na wyswietlenie danych

   //     for (Alkohol alkohol : alkohole){
    //        System.out.println(alkohol);
   // }

  //  }
    public String toString() {
        String rezultat = "id\ttyp\tNazwa\tcena\tinne\n";
        for (Produkt produkt : produkty){
            rezultat +=produkt + "\n";

    }

    return  rezultat;

    }

}
