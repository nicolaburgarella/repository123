package basistaxroom;

public class Room {
	private String number;
	private String composition;
	private String description;
	private String disponible;
	private String checkin;
	private String withextra;
	
	//<room checkin=""><comp><descr><disp><withextra>
	public String getNumber() {
		return number;
	}
	
	public String getDate(){
		return checkin;
	}
	
	public void setDate(String c){
		checkin=c;
	}
	
	public void setNumber(String n) {
		this.number = n;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String c) {
		this.composition = c;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String d) {
		this.description = d;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String d) {
		this.disponible = d;
	}
	public String getWithExtra() {
		return withextra;
	}
	public void setWithExtra(String we) {
		this.withextra = we;
	}

	@Override
	public String toString() {
		return "Item [number=" + number + ", composition=" + composition + ", description="
				+ description + ", disponible=" + disponible + ", withextra=" + withextra + "]";
	}
}
