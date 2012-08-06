package room;

// TODO: Auto-generated Javadoc
/**
 * The Class Extra.
 */
public class Extra{
	
	/** The cost. */
	private float cost;
	
	/** The date. */
	private String date;
	
	/** The type. */
	private String type;
	
	/**
	 * Instantiates a new extra.
	 */
	public Extra(){
		
	}
	
	/**
	 * Instantiates a new extra.
	 *
	 * @param cost the cost
	 * @param date the date
	 * @param type the type
	 */
	public Extra(float cost, String date, String type) {
		super();
		this.cost = cost;
		this.date = date;
		this.type = type;
	}
	
	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 */
	public float getCost() {
		return cost;
	}
	
	/**
	 * Sets the cost.
	 *
	 * @param cost the new cost
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Extra [cost=" + cost + ", date=" + date + ", type=" + type
				+ "]";
	}
	
	

}
