package room;

public class Room {
	
	private int number;
	private float fee;
	private String free="yes";
	private String composition;
	private String description;
	

	
	public Room(int number, float fee, String free, String composition,
			String description) {
		super();
		this.number = number;
		this.fee = fee;
		this.free = free;
		this.composition = composition;
		this.description = description;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}



	public float getFee() {
		return fee;
	}



	public void setFee(float f) {
		this.fee = f;
	}



	public String getFree() {
		return free;
	}



	public void setFree(String free) {
		this.free = free;
	}



	public String getComposition() {
		return composition;
	}



	public void setComposition(String composition) {
		this.composition = composition;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "Room [number=" + number + ", fee=" + fee + ", free=" + free
				+ ", composition=" + composition + ", description="
				+ description + "]";
	}

}
