import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class Camera {

	private int id=0;;
	private String descrizione="";
	Extra extra;
	static boolean disponibile=true;
	private String flagDisp="";

	public Camera(){

	}

	public Camera(int id,Extra extra,String descrizione,boolean disp){
		this.id=id;
		this.extra=extra;
		this.descrizione=descrizione;
		this.disponibile=disponibile;
	}

	public Camera(int id, String descrizione,boolean disp){
		this.id=id;
		this.descrizione=descrizione;
		this.disponibile=disponibile;
	}

	public Camera(RegistroExtra re){
		RegistroExtra registroExtra=re;
		}

	public void setId(int id){
		this.id=id;
	}


	public int getId(){
		return this.id;
	}

	public void setIncrId(){
		this.id++;
	}


	public void setExtra(Extra extra){
		this.extra=extra;
	}

	public Extra getExtra(){
		return this.extra;
	}

	public String isExtra(){
		if(this.extra!=null){
			return "SI";
		}
		else{
			return "NO";
		}
	}

	public void setDescrizione(String altro){
		this.descrizione=altro;
	}

	public String getDescrizione(){
		return this.descrizione;

	}


	public void setDisponibile(boolean d){
		this.disponibile=d;
	}

	public boolean isDisponibile(){
		return disponibile;
	}


	public String flagToDisp(){
		if(disponibile=true){
			flagDisp="SI";
		}
		else{
			flagDisp="NO";
		}
		return flagDisp;
	}


	public String toString(){
		return "Codice Camera :"+this.id+"\n"+"Extra da addebitare: \t"+this.isExtra()+"\n"+"Descrizione stanza: \t"+this.descrizione+"\n"+"Disponibile ora: \t"+this.flagToDisp()+"\n";
		}

	public void InserisciCamera(){
		try{
            BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
            boolean continua=true;
            extra=null;
            disponibile=true;
            while(continua){
                    System.out.println("Inserisci l'id della camera:(END per terminare)");
                    this.id=Integer.parseInt(promptLine.readLine());
                    if(promptLine.readLine().equals("END")){
                            break;
                    }

                    System.out.println("Inserisci una descrizione della stanza:(END per terminare)");
                    this.descrizione=promptLine.readLine();
                    if(descrizione.equals("END")){
                            break;
                    }
                    else {
                        System.out.println("descrizione inserita correttamente");
                    }
                    this.setDisponibile(true);
            }
            //Camera camera = new Camera(id,descrizione,disponibile);
            }catch(IOException ioe){
                    ioe.printStackTrace();
            }
            finally{
            	    System.out.println("Il gruppo è stato inserito correttamente.");
            }
	}


}
