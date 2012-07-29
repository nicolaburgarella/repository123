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


		public boolean isExtraListEmpty(){
			return extraReg.isEmpty();
		}

		@Override
		public String toString() {
			return "ExtraList [extraReg=" + extraReg + "]";
		}

}
