package sese;

import java.util.Date;

public class Reparatur extends Mitarbeiter.Auftrag {
	String beschreibung;

	public Reparatur(Date datum, int preis, String beschreibung) {
		super(datum, preis);
		this.beschreibung = beschreibung;
	}
}
