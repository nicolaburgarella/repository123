package reservation;

// TODO: Auto-generated Javadoc
/**
 * The Class Reservation.
 */
public class Reservation {
	
	/** The number. */
	private int number;
	
	/** The group name. */
	private String groupName;
	
	/** The checkin. */
	private String checkin;
	
	/** The checkout. */
	private String checkout;
	
	/** The deposit. */
	private float deposit=0;
	
	/** The totcost. */
	private float totcost=0;
	
	/**
	 * Instantiates a new reservation.
	 */
	public Reservation(){
		
	}
	
	/**
	 * Instantiates a new reservation.
	 *
	 * @param number the number
	 * @param groupname the groupname
	 * @param checkin the checkin
	 * @param checkout the checkout
	 * @param deposit the deposit
	 * @param totcost the totcost
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
	 * Gets the number.
	 *
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * Sets the number.
	 *
	 * @param number the new number
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
	 * Sets the groupname.
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
	 * Gets the totcost.
	 *
	 * @return the totcost
	 */
	public float getTotcost() {
		return totcost;
	}
	
	/**
	 * Sets the totcost.
	 *
	 * @param totcost the new totcost
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
