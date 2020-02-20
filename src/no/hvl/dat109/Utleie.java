/**
 * 
 */
package no.hvl.dat109;

import java.time.LocalDate;

/**
 * @author Vilde Kristine Fossum;
 *
 */

public class Utleie {
	
	private String kredittkortnr;
	private String regnr;
	private String kilometerstand;
	private LocalDate datoUtleie;
	private LocalDate datoRetur;
	/**
	 * @param kredittkortnr
	 * @param regnr
	 * @param kilometerstand
	 * @param datoUtleie
	 * @param datoRetur
	 */
	public Utleie(String kredittkortnr, String regnr, String kilometerstand, LocalDate datoUtleie,
			LocalDate datoRetur) {
		this.kredittkortnr = kredittkortnr;
		this.regnr = regnr;
		this.kilometerstand = kilometerstand;
		this.datoUtleie = datoUtleie;
		this.datoRetur = datoRetur;
	}
	
	/**
	 * 
	 * @param kontor
	 */
	public void returnerBil(Kontor kontor) {
		Bil bil = kontor.finnBil(this.regnr);
		bil.setKmAvstand(bil.getKmAvstand()+this.kilometerstand);
		bil.setLedig(true);
		
		/**
		 * TODO: add bil til nytt kontor
		 */
	}
	
	public String getKredittkortnr() {
		return kredittkortnr;
	}
	public void setKredittkortnr(String kredittkortnr) {
		this.kredittkortnr = kredittkortnr;
	}
	public String getRegnr() {
		return regnr;
	}
	public void setRegnr(String regnr) {
		this.regnr = regnr;
	}
	public String getKilometerstand() {
		return kilometerstand;
	}
	public void setKilometerstand(String kilometerstand) {
		this.kilometerstand = kilometerstand;
	}
	public LocalDate getDatoUtleie() {
		return datoUtleie;
	}
	public void setDatoUtleie(LocalDate datoUtleie) {
		this.datoUtleie = datoUtleie;
	}
	public LocalDate getDatoRetur() {
		return datoRetur;
	}
	public void setDatoRetur(LocalDate datoRetur) {
		this.datoRetur = datoRetur;
	}
	
}
