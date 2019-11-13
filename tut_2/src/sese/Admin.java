package sese;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    List<MitarbeiterDaten> alleMitarbeiter = new ArrayList<>();

    public void mitarbeiterAnlegen(String user, String pwd) {
        this.alleMitarbeiter.add(new MitarbeiterDaten(user, pwd));
    }

    public void mitarbeiterEnfernen(String user) {
        for (MitarbeiterDaten m : this.alleMitarbeiter) {
            if (m.id.equals(user)) {
                this.alleMitarbeiter.remove(m);
            }
        }
    }
}
