package room;

public class Extra{
	private float cost;
	private String date;
	private String type;
	
	public Extra(){
		
	}
	
	public Extra(float cost, String date, String type) {
		super();
		this.cost = cost;
		this.date = date;
		this.type = type;
	}
	
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Extra [cost=" + cost + ", date=" + date + ", type=" + type
				+ "]";
	}
	
	

}
