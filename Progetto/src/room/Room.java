package room;

// TODO: Auto-generated Javadoc
/**
 * The model Class Room deals with each room available in the hotel.
 */
public class Room {
	
	/** The room number. */
	private int number;
	
	/** The fee. */
	private float fee;
	
	/** The free. */
	private String free="yes";
	
	/** The composition. */
	private String composition;
	
	/** The description. */
	private String description;
	

	
	/**
	 * Instantiates a new room.
	 *
	 * @param number the room number
	 * @param fee the fee
	 * @param free the free
	 * @param composition the composition
	 * @param description the description
	 */
	public Room(int number, float fee, String free, String composition,
			String description) {
		super();
		this.number = number;
		this.fee = fee;
		this.free = free;
		this.composition = composition;
		this.description = description;
	}


	/**
	 * Gets the room number.
	 *
	 * @return the room number
	 */
	public int getNumber() {
		return number;
	}


	/**
	 * Sets the room number.
	 *
	 * @param number the new room number
	 */
	public void setNumber(int number) {
		this.number = number;
	}



	/**
	 * Gets the fee.
	 *
	 * @return the fee
	 */
	public float getFee() {
		return fee;
	}



	/**
	 * Sets the fee.
	 *
	 * @param f the new fee
	 */
	public void setFee(float f) {
		this.fee = f;
	}



	/**
	 * Gets the free.
	 *
	 * @return the free
	 */
	public String getFree() {
		return free;
	}



	/**
	 * Sets the free.
	 *
	 * @param free the new free
	 */
	public void setFree(String free) {
		this.free = free;
	}



	/**
	 * Gets the composition.
	 *
	 * @return the composition
	 */
	public String getComposition() {
		return composition;
	}



	/**
	 * Sets the composition.
	 *
	 * @param composition the new composition
	 */
	public void setComposition(String composition) {
		this.composition = composition;
	}



	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Room [number=" + number + ", fee=" + fee + ", free=" + free
				+ ", composition=" + composition + ", description="
				+ description + "]";
	}

}
