package room;


import java.util.*;
import java.io.*;

public class ExtraList {
		
	private ArrayList<Extra> extraReg=new ArrayList<Extra>();
	

		public ArrayList<Extra> getExtraReg() {
		return extraReg;
	}

	public void setExtraReg(ArrayList<Extra> extraReg) {
		this.extraReg = extraReg;
	}

		public ExtraList(){
			//Removes all of the elements from this list.
			extraReg.clear();
		}
		
		public ArrayList<Extra> getExtraList(){
			return this.extraReg;
		}


		public void addExtra(Extra extra){
			for(int i=0;i<extraReg.size();i++){
				if((extraReg.get(i)).equals(extra)){
					System.out.println("L'extra è già presente nella lista, quindi non lo inserisco");
				}
			}
			extraReg.add(extra);

			System.out.println("Extra inserito nella lista degli extra");
		}



		public Extra getExtraByPos(int posizione){
			return extraReg.get(posizione);
		}
		
		public boolean isExtraListEmpty(){
			return extraReg.isEmpty();
		}

		@Override
		public String toString() {
			return "ExtraList [extraReg=" + extraReg + "]";
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
