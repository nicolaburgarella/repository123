package group;


import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The model Class RequestList lists all the group request instances inserted into application.
 */
public class RequestList {
		
	/** The request register list . */
	private ArrayList<Request> requestReg=new ArrayList<Request>();
	
	

	/**
	 * Gets the request register list.
	 *
	 * @return the request register list
	 */
	public ArrayList<Request> getRequestReg() {
		return requestReg;
	}

	/**
	 * Sets the request register list.
	 *
	 * @param requestReg the new request register list
	 */
	public void setRequestReg(ArrayList<Request> requestReg) {
		this.requestReg = requestReg;
	}
	
	

		/**
		 * Instantiates a new request list.
		 *
		 * @param requestReg the request register list
		 */
		public RequestList(ArrayList<Request> requestReg) {
		super();
		this.requestReg = requestReg;
	}

		/**
		 * Instantiates a new request list and inizialize the requestList register list.
		 */
		public RequestList(){
			requestReg.clear();
		}
		
		/**
		 * Gets the extra list.
		 *
		 * @return the extra list
		 */
		public ArrayList<Request> getExtraList(){
			return this.requestReg;
		}


		/**
		 * Adds the request into the request register.
		 *
		 * @param request the request entity
		 */
		public void addRequest(Request request){
			for(int i=0;i<requestReg.size();i++){
				if((requestReg.get(i)).equals(request)){
					System.out.println("La richiesta � gi� presente nella lista, quindi non la inserisco");
				}
			}
			requestReg.add(request);

			System.out.println("Richiesta inserita nella lista delle richieste");
		}



		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "RequestList [requestReg=" + requestReg + "]";
		}


}