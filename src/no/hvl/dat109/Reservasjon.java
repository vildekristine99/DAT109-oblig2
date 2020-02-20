/**
 * 
 */
package no.hvl.dat109;

import java.time.LocalDate;

/**
 * @author Vilde Kristine Fossum
 *
 */
public class Reservasjon {
	private Kunde kunde;
	private Bil bil;
	private LocalDate datoUtleie;
	private Kontor uleieSted;
	private Kontor returSted;
	private int antallDager;
	
	/**
	 * @param kunde
	 * @param bil
	 * @param datoLeie
	 * @param uleieSted
	 * @param returSted
	 * @param klokkeslett
	 * @param antallDager
	 */
	public Reservasjon(Kunde kunde, Bil bil, LocalDate datoUtleie, Kontor uleieSted, Kontor returSted, int antallDager) {
		super();
		this.kunde = kunde;
		this.bil = bil;
		this.datoUtleie = datoUtleie;
		this.uleieSted = uleieSted;
		this.returSted = returSted;
		this.antallDager = antallDager;
		reserverBil(bil);
	}
	public Reservasjon() {
		
	}
	/**
	 * 
	 * @param bil
	 */
	public void reserverBil(Bil bil) {
		bil.setLedig(false);
	}
	

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public Bil getBil() {
		return bil;
	}

	public void setBil(Bil bil) {
		this.bil = bil;
	}

	public LocalDate getDatoUtleie() {
		return datoUtleie;
	}

	public void setDatoUtleie(LocalDate datoUtleie) {
		this.datoUtleie = datoUtleie;
	}

	public Kontor getUleieSted() {
		return uleieSted;
	}

	public void setUleieSted(Kontor uleieSted) {
		this.uleieSted = uleieSted;
	}

	public Kontor getReturSted() {
		return returSted;
	}

	public void setReturSted(Kontor returSted) {
		this.returSted = returSted;
	}

	public int getAntallDager() {
		return antallDager;
	}

	public void setAntallDager(int antallDager) {
		this.antallDager = antallDager;
	}
	
	
	
	
	

	
}
