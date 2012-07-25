package group;

public class Request {
	
	private int singole=0;
	private int doppie=0;
	private int matrimoniali=0;
	private String flag="non eseguita";
	
	
	public Request(){
		
	}
	
	public Request(int singole, int doppie, int matrimoniali, String flag) {
		super();
		this.singole = singole;
		this.doppie = doppie;
		this.matrimoniali = matrimoniali;
		this.flag = flag;
	}
	
	public int getSingole() {
		return singole;
	}
	public void setSingole(int singole) {
		this.singole = singole;
	}
	public int getDoppie() {
		return doppie;
	}
	public void setDoppie(int doppie) {
		this.doppie = doppie;
	}
	public int getMatrimoniali() {
		return matrimoniali;
	}
	public void setMatrimoniali(int matrimoniali) {
		this.matrimoniali = matrimoniali;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

	
	
	@Override
	public String toString() {
		return "Request [singole=" + singole + ", doppie=" + doppie
				+ ", matrimoniali=" + matrimoniali + ", flag=" + flag + "]";
	}

}
