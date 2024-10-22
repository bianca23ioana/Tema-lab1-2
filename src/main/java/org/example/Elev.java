package org.example;

public class Elev {
    String nume;
    Gen gen;

     Elev(String nume, Gen gen) {
        this.nume=nume;
        this.gen=gen;
    }

    public String getNume() {
        System.out.println("Pe elev il cheama "+nume);
        return nume;
    }
}
