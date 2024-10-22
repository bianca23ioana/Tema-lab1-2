package org.example;

import java.util.ArrayList;
import java.util.List;

public class Clasa {
    int capacitate;
    NumarClasa numar;
    char litera;
    List<Elev> elevi= new ArrayList<>();
    //String NumeClasa;

    Clasa(NumarClasa numar, int capacitate, char litera) {
        this.numar = numar;
        this.capacitate = capacitate;
        this.litera = litera;
    }
    void adaugaElev(Elev e){
        elevi.add(e);
        System.out.println("Elevul "+e.nume+" a fost adaugat cu secces in clasa");
    }

    void eliminaElev(Elev e){
        elevi.remove(e);
        System.out.println("Elevul "+e.nume+" a fost eliminat din clasa");
    }

   int getTotalElevi(){
       return elevi.size();
    }

   String getNumeClasa() {
        return this.numar.toString() + this.litera;
    }
}
