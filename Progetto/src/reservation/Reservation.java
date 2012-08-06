package reservation;

// TODO: Auto-generated Javadoc
/**
 * The model Class Reservation.
 */
public class Reservation {
	
	/** The reservation ID. */
	private int number;
	
	/** The group name. */
	private String groupName;
	
	/** The checkin. */
	private String checkin;
	
	/** The checkout. */
	private String checkout;
	
	/** The deposit. */
	private float deposit=0;
	
	/** The total cost. */
	private float totcost=0;
	
	/**
	 * Instantiates a new reservation.
	 */
	public Reservation(){
		
	}
	
	/**
	 * Instantiates a new reservation.
	 *
	 * @param number the reservation ID
	 * @param groupname the group name
	 * @param checkin the checkin
	 * @param checkout the checkout
	 * @param deposit the deposit
	 * @param totcost the total cost
	 */
	public Reservation(int number, String groupname, String checkin,
			String checkout, float deposit, float totcost) {
		super();
		this.number = number;
		this.groupName = groupname;
		this.checkin = checkin;
		this.checkout = checkout;
		this.deposit = deposit;
		this.totcost = totcost;
	}
	
	/**
	 * Gets the reservation ID.
	 *
	 * @return number the reservation ID
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * Sets the reservation ID.
	 *
	 * @param number the reservation ID
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * Gets the group name.
	 *
	 * @return the group name
	 */
	public String getGroupName() {
		return groupName;
	}
	
	/**
	 * Sets the group name.
	 *
	 * @param groupname the new groupname
	 */
	public void setGroupname(String groupname) {
		this.groupName = groupname;
	}
	
	/**
	 * Gets the checkin.
	 *
	 * @return the checkin
	 */
	public String getCheckin() {
		return checkin;
	}
	
	/**
	 * Sets the checkin.
	 *
	 * @param checkin the new checkin
	 */
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	
	/**
	 * Gets the checkout.
	 *
	 * @return the checkout
	 */
	public String getCheckout() {
		return checkout;
	}
	
	/**
	 * Sets the checkout.
	 *
	 * @param checkout the new checkout
	 */
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	
	/**
	 * Gets the deposit.
	 *
	 * @return the deposit
	 */
	public float getDeposit() {
		return deposit;
	}
	
	/**
	 * Sets the deposit.
	 *
	 * @param deposit the new deposit
	 */
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	
	/**
	 * Gets the total cost.
	 *
	 * @return the total cost
	 */
	public float getTotcost() {
		return totcost;
	}
	
	/**
	 * Sets the total cost.
	 *
	 * @param totcost the new total cost
	 */
	public void setTotcost(float totcost) {
		this.totcost = totcost;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Reservation [number=" + number + ", groupname=" + groupName
				+ ", checkin=" + checkin + ", checkout=" + checkout
				+ ", deposit=" + deposit + ", totcost=" + totcost + "]";
	}

}
