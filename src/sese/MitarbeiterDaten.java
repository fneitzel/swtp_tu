package sese;

import java.util.ArrayList;
import java.util.List;

public class MitarbeiterDaten {
    List<Mitarbeiter.Auftrag> beendeteAuftraege;

    String id;
    String passwort;

    public MitarbeiterDaten(String id, String passwort) {
        this.beendeteAuftraege = new ArrayList<>();
        this.id = id;
        this.passwort = passwort;
    }

}
