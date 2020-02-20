/**
 * 
 */
package no.hvl.dat109;

/**
 * @author Vilde Kristine Fossum
 *
 */
public class Main {
	public static void main(String[] args) {
		Selskap TheRide = new Selskap("TheRide", "98989898", new Adresse("Furuveuen 1", 3300, "Hokksund"));
		Brukergrensesnitt bg = new Brukergrensesnitt(TheRide);
		bg.run();
	}
}
