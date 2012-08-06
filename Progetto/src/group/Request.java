package group;

// TODO: Auto-generated Javadoc
/**
 * The Class Request.
 */
public class Request {
	
	/** The singole. */
	private int singole=0;
	
	/** The doppie. */
	private int doppie=0;
	
	/** The matrimoniali. */
	private int matrimoniali=0;
	
	/** The flag. */
	private String flag="non eseguita";
	
	
	/**
	 * Instantiates a new request.
	 */
	public Request(){
		
	}
	
	/**
	 * Instantiates a new request.
	 *
	 * @param singole the singole
	 * @param doppie the doppie
	 * @param matrimoniali the matrimoniali
	 * @param flag the flag
	 */
	public Request(int singole, int doppie, int matrimoniali, String flag) {
		super();
		this.singole = singole;
		this.doppie = doppie;
		this.matrimoniali = matrimoniali;
		this.flag = flag;
	}
	
	/**
	 * Gets the singole.
	 *
	 * @return the singole
	 */
	public int getSingole() {
		return singole;
	}
	
	/**
	 * Sets the singole.
	 *
	 * @param singole the new singole
	 */
	public void setSingole(int singole) {
		this.singole = singole;
	}
	
	/**
	 * Gets the doppie.
	 *
	 * @return the doppie
	 */
	public int getDoppie() {
		return doppie;
	}
	
	/**
	 * Sets the doppie.
	 *
	 * @param doppie the new doppie
	 */
	public void setDoppie(int doppie) {
		this.doppie = doppie;
	}
	
	/**
	 * Gets the matrimoniali.
	 *
	 * @return the matrimoniali
	 */
	public int getMatrimoniali() {
		return matrimoniali;
	}
	
	/**
	 * Sets the matrimoniali.
	 *
	 * @param matrimoniali the new matrimoniali
	 */
	public void setMatrimoniali(int matrimoniali) {
		this.matrimoniali = matrimoniali;
	}
	
	/**
	 * Gets the flag.
	 *
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}
	
	/**
	 * Sets the flag.
	 *
	 * @param flag the new flag
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
