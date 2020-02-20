/**
 * 
 */
package no.hvl.dat109;

/**
 * @author Vilde Fossum
 *
 */
public class Adresse {
	private String gateAdresse;
	private int postNr;
	private String sted;
	/**
	 * @param gateAdresse
	 * @param postNr
	 * @param sted
	 */
	public Adresse(String gateAdresse, int postNr, String sted) {
		super();
		this.gateAdresse = gateAdresse;
		this.postNr = postNr;
		this.sted = sted;
	}
	
	public Adresse() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return gateAdresse + ", " + postNr + " " + sted;
	}

	public String getSted() {
		// TODO Auto-generated method stub
		return this.sted;
	}

	public String getGateAdresse() {
		return gateAdresse;
	}

	public void setGateAdresse(String gateAdresse) {
		this.gateAdresse = gateAdresse;
	}

	public int getPostNr() {
		return postNr;
	}

	public void setPostNr(int postNr) {
		this.postNr = postNr;
	}

	public void setSted(String sted) {
		this.sted = sted;
	}
	
}
