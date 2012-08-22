package group;

// TODO: Auto-generated Javadoc
/**
 * The model Class Request deals with the request needed by the group before being accepted and doing the checkin.
 */
public class Request {
	
	/** The single rooms. */
	private int singole=0;
	
	/** The double rooms. */
	private int doppie=0;
	
	/** The wedding rooms. */
	private int matrimoniali=0;
	
	/** The flag setting the request as not executed. */
	private String flag="non eseguita";
	
	
	/**
	 * Instantiates a new request.
	 */
	public Request(){
		
	}
	
	/**
	 * Instantiates a new request.
	 *
	 * @param singole the single rooms
	 * @param doppie the double rooms
	 * @param matrimoniali the wedding rooms
	 * @param flag the flag setting of the request(as executed or not)
	 */
	public Request(int singole, int doppie, int matrimoniali, String flag) {
		super();
		this.singole = singole;
		this.doppie = doppie;
		this.matrimoniali = matrimoniali;
		this.flag = flag;
	}
	
	/**
	 * Gets the single rooms.
	 *
	 * @return the singole
	 */
	public int getSingole() {
		return singole;
	}
	
	/**
	 * Sets the singole.
	 *
	 * @param singole the new single rooms
	 */
	public void setSingole(int singole) {
		this.singole = singole;
	}
	
	/**
	 * Gets the doppie.
	 *
	 * @return the double rooms
	 */
	public int getDoppie() {
		return doppie;
	}
	
	/**
	 * Sets the double rooms.
	 *
	 * @param doppie the new double rooms
	 */
	public void setDoppie(int doppie) {
		this.doppie = doppie;
	}
	
	/**
	 * Gets the wedding rooms.
	 *
	 * @return the wedding rooms
	 */
	public int getMatrimoniali() {
		return matrimoniali;
	}
	
	/**
	 * Sets the wedding rooms.
	 *
	 * @param matrimoniali the new wedding rooms
	 */
	public void setMatrimoniali(int matrimoniali) {
		this.matrimoniali = matrimoniali;
	}
	
	/**
	 * Gets the request flag.
	 *
	 * @return the request flag
	 */
	public String getFlag() {
		return flag;
	}
	
	/**
	 * Sets the request flag.
	 *
	 * @param flag the new request flag
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Request [singole=" + singole + ", doppie=" + doppie
				+ ", matrimoniali=" + matrimoniali + ", flag=" + flag + "]";
	}

}
