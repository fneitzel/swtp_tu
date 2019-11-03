package sese;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mitarbeiter {

    List<Kunde> kunden = new ArrayList<>();
    List<Fahrzeug> fahrzeuge = new ArrayList<>();
    List<Auftrag> auftraege = new ArrayList<>();
    List<MitarbeiterDaten> mitarbeiter = new ArrayList<>();


    public void fahrzeugErstellen(String kunde, Fahrzeug.FZTYP typ, String kennz) {
        // TODO:implement

        Kunde k = this.findeKunde(kunde);
        if(k != null) {
            Fahrzeug f = new Fahrzeug(kennz, typ, k);
            this.fahrzeuge.add(f);
        }
    }

    public void kundeErstellen(String name, String tel, String adresse) {
        // TODO:implement
        this.kunden.add(new Kunde(name, tel, adresse));
    }

    public void auftragErstellen(int fzID, Auftrag.AUFTRAGTYP typ, String beschreibung) {
        // TODO:implement
        Auftrag a = null;
        Date date = new Date();
        switch (typ) {
            case REIFENWECHSEL:
                a = new Reifenwechsel(date, 5);
                break;
            case INSPEKTION:
                a = new Inspektion(date, 20);
                break;
            case REPARATUR:
                a = new Reparatur(date, 30, beschreibung);
                break;
        }

        Fahrzeug f = this.findFahrzeug(fzID);
        if( f != null) {
            f.addAuftrag(a);
            this.auftraege.add(a);
        }

    }

    public void auftragBeenden(String user, int aID) {
        // TODO:implement

        for (Auftrag a:auftraege) {
            if (a.id == aID) {

                for (MitarbeiterDaten m:mitarbeiter) {

                    if(m.id.equals(user)) {
                        a.setBeendet(true);
                        a.setBeendetVon(m);
                        break;
                    }

                }

            }
        }
    }

    private Kunde findeKunde(String kunde) {
        for (Kunde k:kunden) {
            if (k.name.equals(kunde)) return k;
        }
        return null;
    }

    private Fahrzeug findFahrzeug(int fzID) {
        for (Fahrzeug f:fahrzeuge) {
            if (f.id == fzID) return f;
        }
        return null;
    }

    public abstract static class Auftrag {

        private static int nextId = 0;

        int id;
        Date datum;
        int preis;

        boolean beendet;
        MitarbeiterDaten beendetVon;

        public enum AUFTRAGTYP {REPARATUR, REIFENWECHSEL, INSPEKTION}

        public Auftrag(Date datum, int preis) {
            this.datum = datum;
            this.preis = preis;
            this.id = nextId++;
        }

        public void setBeendet(boolean beendet) {
            this.beendet = beendet;
        }

        public void setBeendetVon(MitarbeiterDaten beendetVon) {
            this.beendetVon = beendetVon;
        }
    }
}
