package org.example;

import java.util.HashMap;
import java.util.Map;

public class Scoala {
    Map<String, Clasa> clase = new HashMap<>();

    void adaugaClasa(String s, Clasa c){
        if(!clase.containsKey(s)){
            clase.put(s, c);
            System.out.println("Clasa "+s+" a fost adaugata cu succes");
        }
        else{
            System.out.println("Clasa "+s+" este deja adaugata");
        }
    }

    void eliminaClasa(String s){
        if(clase.containsKey(s)){
            clase.remove(s);
        }
        System.out.println("Clasa "+s+" a fost eliminata cu succes");
    }

    void adaugaElevInClasa(String s, Elev e){
        if(clase.containsKey(s)){
            Clasa aux=clase.get(s);
            if(!aux.elevi.contains(e)){
                aux.elevi.add(e);
                System.out.println("Elevul "+e.nume+" a fost agaugat cu succes in clasa "+s);
            }
            else {
                System.out.println("Elevul " + e.nume + " face deja parte din clasa " + s);
            }
        }
        else{
            System.out.println("Clasa "+s+" nu exista");
        }
    }

    void eliminaElevDupaNume(String numeElev) {
        boolean elevGasit = false;

        // Iterăm prin toate clasele
        for (Clasa clasa : clase.values()) {
            // Căutăm și eliminăm elevul din lista de elevi
            for (int i = 0; i < clasa.elevi.size(); i++) {
                if (clasa.elevi.get(i).getNume().equals(numeElev)) {
                    clasa.elevi.remove(i);
                    System.out.println("Elevul " + numeElev + " a fost eliminat din clasa " + clasa.numar+clasa.litera);
                    elevGasit = true;
                    break; // Ieșim din buclă după ce am eliminat elevul
                }
            }
        }
        if (!elevGasit) {
            System.out.println("Elevul " + numeElev + " nu a fost găsit în nicio clasă.");
        }
    }

    int getNumarClase(){
        return clase.size();
    }

    int getTotalEleviScoala(){
        int total=0;
        for (Map.Entry<String, Clasa> entry : clase.entrySet()) {
            Clasa aux = entry.getValue(); // valoarea (obiectul Clasa)
           total+= aux.getTotalElevi();
        }
        System.out.println("Numarul total de elevi ai scolii este "+total);
        return total;
    }

}
