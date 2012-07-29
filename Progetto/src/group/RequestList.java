package group;


import java.util.*;

public class RequestList {
		
	private ArrayList<Request> requestReg=new ArrayList<Request>();
	
	

	public ArrayList<Request> getRequestReg() {
		return requestReg;
	}

	public void setRequestReg(ArrayList<Request> requestReg) {
		this.requestReg = requestReg;
	}
	
	

		public RequestList(ArrayList<Request> requestReg) {
		super();
		this.requestReg = requestReg;
	}

		public RequestList(){
			requestReg.clear();
		}
		
		public ArrayList<Request> getExtraList(){
			return this.requestReg;
		}


		public void addRequest(Request request){
			for(int i=0;i<requestReg.size();i++){
				if((requestReg.get(i)).equals(request)){
					System.out.println("La richiesta è già presente nella lista, quindi non la inserisco");
				}
			}
			requestReg.add(request);

			System.out.println("Richiesta inserita nella lista delle richieste");
		}



		@Override
		public String toString() {
			return "RequestList [requestReg=" + requestReg + "]";
		}


}