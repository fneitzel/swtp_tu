package sese;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fahrzeug {

    private static int nextId = 0;
	String Kennzeichen;

    FZTYP typ;

    int id;

    Kunde kunde;

    List<Mitarbeiter.Auftrag> auftrag = new ArrayList<>();

    public enum FZTYP {Mazda, Volvo, VW}

    public Fahrzeug(String kennzeichen, FZTYP typ, Kunde kunde) {
        this.Kennzeichen = kennzeichen;
        this.typ = typ;
        this.kunde = kunde;
        this.id = nextId++;
    }

    void addAuftrag(Mitarbeiter.Auftrag m) {
        this.auftrag.add(m);
    }
}
