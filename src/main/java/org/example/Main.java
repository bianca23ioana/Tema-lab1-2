package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("PROBE=============================");
        Elev e1=new Elev("Radu Popa", Gen.Masculin);
        e1.getNume();

        //prima clasa
        Clasa c1=new Clasa(NumarClasa.I, 30, 'A');
        c1.adaugaElev(e1);
        Elev e2=new Elev("Mihai Neag", Gen.Masculin);
        Elev e3=new Elev("Elena Leonte", Gen.Feminin);
        Elev e4=new Elev("Cristi Manea", Gen.Masculin);
        Elev e5=new Elev("Irina Tonciu", Gen.Feminin);
        c1.adaugaElev(e2);
        c1.adaugaElev(e3);
        c1.adaugaElev(e4);
        c1.adaugaElev(e5);
        c1.eliminaElev(e1);
        c1.getTotalElevi();
        //a doua clasa
        Clasa c2=new Clasa(NumarClasa.I, 25, 'B');
        Elev e6=new Elev("Iza Roman", Gen.Feminin);
        Elev e7=new Elev("Balog Paul", Gen.Nespecificat);
        Elev e8=new Elev("Julia Preda", Gen.Feminin);
        Elev e9=new Elev("John Smith", Gen.Masculin);
        Elev e10=new Elev("Lora Smith", Gen.Feminin);
        c2.adaugaElev(e6);
        c2.adaugaElev(e7);
        c2.adaugaElev(e8);
        c2.adaugaElev(e9);
        c2.adaugaElev(e10);
        System.out.println("Clasa "+c2.numar+c2.litera+" are in total "+c2.getTotalElevi()+" elevi");

        Scoala s1=new Scoala();
        String numeC1=c1.getNumeClasa();
        String numeC2=c2.getNumeClasa();
        s1.adaugaClasa(numeC1, c1);
        s1.adaugaClasa(numeC2, c2);
        s1.adaugaClasa(numeC1, c1); //este deja adaugata
        s1.eliminaClasa(numeC1);

        Elev e11=new Elev("Geacarel Alexandru", Gen.Nespecificat);
        s1.adaugaElevInClasa(numeC2, e11); //vreau sa il bag in clasa c2 adica IB
        s1.eliminaElevDupaNume("Geacarel Alexandru"); //acm vreau sa il scot
        System.out.println("Scoala noastra are "+s1.getNumarClase()+" clase"); //da, ptc una am eliminat o
        s1.adaugaClasa(numeC1, c1);

        System.out.println("INFORMATII DESPRE SCOALA====================================");
        System.out.println("Scoala noastra are "+s1.getNumarClase()+" clase"); //corect
        s1.getTotalEleviScoala();








    }
}