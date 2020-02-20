/**
 * 
 */
package no.hvl.dat109;

/**
 * @author Vilde Kristine Fossum
 *
 */
public class Kunde {
	private String fornavn;
	private String etternavn;
	private Adresse adresse;
	private String telefonNr;
	
	/**
	 * 
	 * @param fornavn
	 * @param etternavn
	 * @param adresse
	 * @param telefonNr
	 */
	public Kunde(String fornavn, String etternavn, Adresse adresse, String telefonNr) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.adresse = adresse;
		this.telefonNr = telefonNr;
	}

	@Override
	public String toString() {
		return "Navn:" + fornavn + " " + etternavn + "\n Adresse:" + adresse 
				+ "\n Telefonnummer:" + telefonNr;
	}

	public Kunde() {
		// TODO Auto-generated constructor stub
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTelefonNr() {
		return telefonNr;
	}

	public void setTelefonNr(String telefonNr) {
		this.telefonNr = telefonNr;
	}
	
	
}
