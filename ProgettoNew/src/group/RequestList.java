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
			//Removes all of the elements from this list.
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


/*
		public int searchExtraById(int number){
			for(int i=0;i<extraReg.size();i++){
				if((extraReg.get(i)).getNumber()==number){
					return i;
				}
			}
			return -1;
		}
		*/


		public Request getRequestByPos(int posizione){
			return requestReg.get(posizione);
		}
		

		@Override
		public String toString() {
			return "RequestList [requestReg=" + requestReg + "]";
		}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * salva va reso un file xml <GRUPPO id="" nome="" dataArrivo="" anticipo="" richiestaComposizione=""/>
		 * */
		/*
		public void salvaInXML(){
			try{
				File file =new File("extra");
				FileOutputStream outStream= new FileOutputStream(file);
		        BufferedWriter lineWriter= new BufferedWriter(new OutputStreamWriter(outStream));
		        for(int i=0;i<extraReg.size();i++){
		            String LineaTesto="";
		            int index=0;
		            	if((rc.cercaIdCamera((extraReg.get(i)).getCodiceCamera())>0)){
		            		for(int j=0;j<(rc.getRegistroCamere()).size();j++){
		            			LineaTesto="<EXTRA id="+(extraReg.get(i)).getId()+" tipo="+(extraReg.get(i)).getTipo()+" idCamera="+(rc.getRegistroCamere().get(i)).getId()+" dataExtra="+
		            			((extraReg.get(i)).getDataExtra())+" />";
		            			lineWriter.write(LineaTesto);
		            			lineWriter.newLine();
		            			}
		            	}
		            	else{
		            		//System.out.println("Non ci sono extra per questa camera");
		            		break;
		            	}

				}
		        outStream.close();
		        lineWriter.close();
			}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		}

*/

		


}