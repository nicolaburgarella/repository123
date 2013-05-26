import java.io.Serializable;


public class Cities implements Serializable {
	
	private int id;
	private String name;
	// i don't have to write states as variable member i'll use main class and index column
	public Cities(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
