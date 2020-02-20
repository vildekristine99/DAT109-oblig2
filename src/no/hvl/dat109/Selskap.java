/**
 * 
 */
package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vilde Fossum
 *
 */
public class Selskap {
	private String navn;
	private String telefonNr;
	private Adresse firmaAdresse;
	private List<Kontor> kontorer;
	private List<Reservasjon> reservasjoner;
	
	/**
	 * 
	 * @param navn
	 * @param telefonNr
	 * @param firmaAdresse
	 */
	public Selskap(String navn, String telefonNr, Adresse firmaAdresse) {
		this.navn = navn;
		this.telefonNr = telefonNr;
		this.firmaAdresse = firmaAdresse;
		this.reservasjoner = new ArrayList<Reservasjon>();
		this.kontorer = addKontor();
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Kontor> addKontor() {
		List<Kontor> kontorer = new ArrayList<Kontor>();
		kontorer.add(new Kontor(new Adresse("Hunstadsvingen 11G", 5053, "Bergen"), "98422251"));
		kontorer.add(new Kontor(new Adresse("Port Arthur 7", 7014, "Trondheim"), "45225163"));
		return kontorer;
		
		//this.kontorer.add(kontor);
		
	}
	
	public Kontor finnKontor(int kontorNr) {
		return this.kontorer.get(kontorNr-1);
	}
	
	public Reservasjon finnReservasjon(String telefon) {
		return this.reservasjoner.stream()
				.filter(r -> r.getKunde().getTelefonNr().contentEquals(telefon))
				.collect(Collectors.toList()).get(0);
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getTelefonNr() {
		return telefonNr;
	}

	public void setTelefonNr(String telefonNr) {
		this.telefonNr = telefonNr;
	}

	public Adresse getFirmaAdresse() {
		return firmaAdresse;
	}

	public void setFirmaAdresse(Adresse firmaAdresse) {
		this.firmaAdresse = firmaAdresse;
	}

	public List<Kontor> getKontorer() {
		return kontorer;
	}

	public void setKontorer(List<Kontor> kontorer) {
		this.kontorer = kontorer;
	}

	public List<Reservasjon> getReservasjoner() {
		return reservasjoner;
	}

	public void setReservasjoner(List<Reservasjon> reservasjoner) {
		this.reservasjoner = reservasjoner;
	}
	
	
}
