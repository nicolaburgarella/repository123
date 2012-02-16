import java.util.ArrayList;


public class RegistroCamere {
	private ArrayList<Camera> registroCamere=new ArrayList<Camera>();


	public RegistroCamere(){
			//Removes all of the elements from this list.
			registroCamere.clear();

		}

		public boolean inserisci(Camera camera){
			for(int i=0;i<registroCamere.size()-1;i++){
				if((registroCamere.get(i)).equals(camera)){
					return false;
				}
			}
			registroCamere.add(camera);
			camera.setIncrId();
			return true;
		}

		public Camera getCamera(int posizione){
			return registroCamere.get(posizione);
		}

		public void cerca(Extra extra){
			boolean flag=false;
			for(int i=0;i<registroCamere.size();i++){
				if((registroCamere.get(i).getExtra())==extra){
					System.out.println(extra);
				}
			}
			if(!flag){
				System.out.println("Non è stato trovato alcuna camera con quell' extra");
			}
		}


		public void cerca(Gruppo gruppo){
			boolean flag=false;
			int[] vComp=new int[3];
			vComp=gruppo.getRichiestaComposizione();
			if(vComp[0]<=Gruppo.MaxSingole && vComp[1]<=Gruppo.MaxDoppie && vComp[2]<=Gruppo.MaxMatrimoniali){
				System.out.println("La richiesta delle camere soddisfa la capacità dell'albergo");
				flag=true;
			}
			if(!flag){
			System.out.println("La richiesta delle camere non rispetta i limiti di capacità dell'albergo");
			}
		}


		public int cercaIdCamera(int id){
			for(int i=0;i<registroCamere.size();i++){
				if(((registroCamere.get(i)).getId())==id && ((registroCamere.get(i)).isDisponibile()==true)){
					return i;
				}
				if(((registroCamere.get(i)).getId())==id && ((registroCamere.get(i)).isDisponibile()==false)){
				return -1;
				}
			}
			return -2;
		}

		public ArrayList<Camera> getRegistroCamere(){
			return registroCamere;
		}

}
