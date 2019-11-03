package sese;

import java.util.ArrayList;
import java.util.List;

public class Kunde {

    private static int nextId = 0;

    int id;
    String name;
    String telefon;
    String adresse;

    List<Fahrzeug> fahrzeuge;

    public Kunde(String name, String telefon, String adresse) {

        this.name = name;
        this.telefon = telefon;
        this.adresse = adresse;
        this.fahrzeuge = new ArrayList<>();
        this.id = nextId++;

    }
}
