/**
 * 
 */
package no.hvl.dat109;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Vilde Kristine Fossum
 *
 */
public class Brukergrensesnitt {
	private Selskap selskap;
	private Scanner sc = new Scanner(System.in);

	/**
	 * @param selskap
	 */
	public Brukergrensesnitt(Selskap selskap) {
		this.selskap = selskap;
	}
	
	public void run() {
		System.out.println("Skal du reservere, leie eller returnere?");
		System.out.println("Trykk 1:reservere, 2:leie, 3:returnere");
		int svar = sc.nextInt();
		switch(svar) {
		case 1:
			startReservasjon();
			break;
		case 2:
			startLeie();
			break;
		case 3:
			startRetur();
			break;
		default:
			System.out.println("Ikke gyldig svar");
			run();
		}
		sc.close();
	}
	private void startRetur() {
		// TODO Auto-generated method stub
		//utleie.returnerBil(kontor)
		
		run();
		
	}

	private void startLeie() {
		//Ved faktisk utleie til kunde skal det registreres kredittkort med nummer,
		//registreringsnummer på bil som leies, dennes kilometerstand, dato og klokkeslett for utleie,
		//og dato og klokkeslett for forventet retur. 
		System.out.println("Lei bil her");
		System.out.println("Hent ut din reservasjon ved å oppgi ditt telefonnummer:");
		sc.nextLine();
		String telefon = sc.nextLine();
		Reservasjon res = selskap.finnReservasjon(telefon);
		System.out.println("Velkommen " + res.getKunde().getFornavn() + " " + res.getKunde().getEtternavn());
		//her skjer resten i skranken
		System.out.println("Vennligs oppgi ditt kredittkortnummer for å få bilen");
		String kred = sc.nextLine();
		Utleie utleie = new Utleie(kred, res.getBil().getRegnr(), res.getBil().getKmAvstand(), 
				res.getDatoUtleie(), res.getDatoUtleie().plusDays(res.getAntallDager()));
		//TODO: lagre utleie i database eller en liste et sted
		System.out.println("Du har når leid bilen");
		run();
	}

	private void startReservasjon() {
		System.out.println("Reserver bil her");
		System.out.println("Velg et utleiested:");
		selskap.getKontorer().stream().forEach(System.out::println);
		int utleie = sc.nextInt();
		sc.nextLine();
		Kontor utleieSted = selskap.finnKontor(utleie);
		System.out.println("Takk for at du valgte kontor: " + utleieSted.getAdresse().getSted());
		
		System.out.println("Hvor ønsker du å returnere bilen?");
		int retur = sc.nextInt();
		sc.nextLine();
		Kontor returSted = selskap.finnKontor(retur);
		System.out.println("Du valgte kontor: " + returSted.getAdresse().getSted());
		System.out.println();
		
		System.out.println("Skrive inn ønsket dato for reservasjon: (åååå-mm-dd)");
		String datoLeie = sc.nextLine();
		LocalDate leieDato = LocalDate.parse(datoLeie);
		
		System.out.println("Skriv inn antall dager for reservasjon: ");
		int dager = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Her er en oversikt over bilene ved dette kontoret");
		utleieSted.leidigeBiler().forEach(System.out::println);
		System.out.println();
		System.out.println("Hvilken bil ønsker du? Skriv inn registreringnummeret");
		String regnr = sc.nextLine();
		Bil bil = utleieSted.finnBil(regnr);
		System.out.println("Du har valgt: " + bil.getBilmerke() + " " + bil.getModell());
				
		Kunde kunde = hentKundeinformasjon();
		
		Reservasjon reservasjon = new Reservasjon(kunde, bil, leieDato, utleieSted, returSted, dager);
		selskap.getReservasjoner().add(reservasjon);
		
		run();
	}
	
	private Kunde hentKundeinformasjon() {
		Kunde kunde = new Kunde();
		
		System.out.println("Opprett kundeinformasjon for å fullføre reservasjon:");
		System.out.println("Fornavn");
		kunde.setFornavn(sc.nextLine());
		System.out.println("Etternavn");
		kunde.setEtternavn(sc.nextLine());
		System.out.println("Telefonnummer");
		kunde.setTelefonNr(sc.nextLine());
		System.out.println("Adresse:");
		Adresse adresse = new Adresse();
		System.out.println("Gate");
		adresse.setGateAdresse(sc.nextLine());
		System.out.println("Postnummer");
		adresse.setPostNr(sc.nextInt());
		sc.nextLine();
		System.out.println("Sted");
		adresse.setSted(sc.nextLine());
		kunde.setAdresse(adresse);
		System.out.println("Vi har registert dette:\n " + kunde.toString());
		
		return kunde;
	}
	
}
