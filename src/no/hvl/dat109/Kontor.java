/**
 * 
 */
package no.hvl.dat109;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Vilde Kristine Fossum
 *
 */
public class Kontor {
	private int kontorId;
	private Adresse adresse;
	private String telefonNr;
	private static final AtomicInteger teller = new AtomicInteger(0);
	private List<Bil> biler;
	
	/**
	 * 
	 * @param adresse
	 * @param telefonNr
	 */
	public Kontor(Adresse adresse, String telefonNr) {
		this.kontorId = teller.incrementAndGet();
		this.adresse = adresse;
		this.telefonNr = telefonNr;
		this.biler = addBiler();
	}
	private List<Bil> addBiler() {
		List<Bil> biler = new ArrayList<Bil>();
		biler.add(new Bil("AZ1234", "VW", "Up", "Hvit", UtleieGruppe.LITEN_BIL, "10000", true));
		biler.add(new Bil("BR1234", "VW", "Golf", "Grå", UtleieGruppe.MELLOMSTOR_BIL, "30000", true));
		biler.add(new Bil("GR1234", "Ford", "S-Max", "Blå", UtleieGruppe.STOR_BIL, "40000", true));
		biler.add(new Bil("PP1234", "Ford", "Focus", "Svart", UtleieGruppe.STASJONSVOGN, "2000", true));
		return biler;
	}
	/**
	 * 
	 * @param bil
	 */
	public void addBil(Bil bil) {
		this.biler.add(bil);
	}
	
	public Bil finnBil(String regnr) {
		return biler.stream().filter(b -> b.getRegnr().equals(regnr)).collect(Collectors.toList()).get(0);
	}

	@Override
	public String toString() {
		return kontorId + ": Adresse: " + adresse + " Telefon: " + telefonNr;
	}
	
	public List<Bil> leidigeBiler(){
		return biler.stream().filter(b -> b.isLedig() == true).collect(Collectors.toList());
		
		//TODO
		//finne biler som er ledige for gitt dato og antall dager
		//LocalDate utleie, int dager
	}
	
	public int getKontorId() {
		return kontorId;
	}

	public void setKontorId(int kontorId) {
		this.kontorId = kontorId;
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


	public List<Bil> getBiler() {
		return biler;
	}

	public void setBiler(List<Bil> biler) {
		this.biler = biler;
	}
	
	
}
