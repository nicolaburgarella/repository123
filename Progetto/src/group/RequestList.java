package group;


import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class RequestList.
 */
public class RequestList {
		
	/** The request reg. */
	private ArrayList<Request> requestReg=new ArrayList<Request>();
	
	

	/**
	 * Gets the request reg.
	 *
	 * @return the request reg
	 */
	public ArrayList<Request> getRequestReg() {
		return requestReg;
	}

	/**
	 * Sets the request reg.
	 *
	 * @param requestReg the new request reg
	 */
	public void setRequestReg(ArrayList<Request> requestReg) {
		this.requestReg = requestReg;
	}
	
	

		/**
		 * Instantiates a new request list.
		 *
		 * @param requestReg the request reg
		 */
		public RequestList(ArrayList<Request> requestReg) {
		super();
		this.requestReg = requestReg;
	}

		/**
		 * Instantiates a new request list.
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
		 * Adds the request.
		 *
		 * @param request the request
		 */
		public void addRequest(Request request){
			for(int i=0;i<requestReg.size();i++){
				if((requestReg.get(i)).equals(request)){
					System.out.println("La richiesta è già presente nella lista, quindi non la inserisco");
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