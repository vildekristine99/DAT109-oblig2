/**
 * 
 */
package no.hvl.dat109;

/**
 * @author Vilde Fossum
 *
 */
public class Bil {
	private String regnr;
	private String bilmerke;
	private String modell;
	private String farge;
	private UtleieGruppe utleiegruppe;
	private String kmAvstand;
	private boolean ledig;
	
	/**
	 * @param regnr
	 * @param bilmerke
	 * @param modell
	 * @param farge
	 * @param utleiegruppe
	 * @param ledig
	 */
	public Bil(String regnr, String bilmerke, String modell, String farge, UtleieGruppe utleiegruppe, String kmAvstand, boolean ledig) {
		super();
		this.regnr = regnr;
		this.bilmerke = bilmerke;
		this.modell = modell;
		this.farge = farge;
		this.utleiegruppe = utleiegruppe;
		this.kmAvstand = kmAvstand;
		this.ledig = ledig;
	}
	
	
	
	@Override
	public String toString() {
		return "Registreringsnummer: " + regnr + ", Bilmerke: " + bilmerke + ", Modell: " + modell + ", Farge: " + farge
					+ ", utleiegruppe: " + utleiegruppe + ", kmAvstand: " + kmAvstand + "km";
	}



	public String getKmAvstand() {
		return kmAvstand;
	}

	public void setKmAvstand(String kmAvstand) {
		this.kmAvstand = kmAvstand;
	}

	public String getRegnr() {
		return regnr;
	}
	
	public void setRegnr(String regnr) {
		this.regnr = regnr;
	}
	
	public String getBilmerke() {
		return bilmerke;
	}
	
	public void setBilmerke(String bilmerke) {
		this.bilmerke = bilmerke;
	}
	
	public String getModell() {
		return modell;
	}
	
	public void setModell(String modell) {
		this.modell = modell;
	}
	
	public String getFarge() {
		return farge;
	}
	
	public void setFarge(String farge) {
		this.farge = farge;
	}
	
	public UtleieGruppe getUtleiegruppe() {
		return utleiegruppe;
	}
	
	public void setUtleiegruppe(UtleieGruppe utleiegruppe) {
		this.utleiegruppe = utleiegruppe;
	}
	
	public boolean isLedig() {
		return ledig;
	}
	
	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}
	
	
	
}
