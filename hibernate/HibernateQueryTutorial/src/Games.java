import java.io.Serializable;


public class Games implements Serializable {
	
	private int id;
	private String name;
	private String type;
	private long space;
	public Games(){}
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getSpace() {
		return space;
	}
	public void setSpace(long space) {
		this.space = space;
	}
	
	
	

}
