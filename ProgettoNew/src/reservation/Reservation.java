package reservation;

public class Reservation {
	
	private int number;
	private String groupName;
	private String checkin;
	private String checkout;
	private float deposit=0;
	private float totcost=0;
	
	public Reservation(){
		
	}
	
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
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupname(String groupname) {
		this.groupName = groupname;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	public float getTotcost() {
		return totcost;
	}
	public void setTotcost(float totcost) {
		this.totcost = totcost;
	}
	
	
	@Override
	public String toString() {
		return "Reservation [number=" + number + ", groupname=" + groupName
				+ ", checkin=" + checkin + ", checkout=" + checkout
				+ ", deposit=" + deposit + ", totcost=" + totcost + "]";
	}

}
