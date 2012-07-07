package group;

import java.util.ArrayList;


public class GroupList {
	
	private ArrayList<Group> groupReg=new ArrayList<Group>();



	public ArrayList<Group> getGroupReg() {
		return groupReg;
	}

	public void setGroupReg(ArrayList<Group> groupReg) {
		this.groupReg = groupReg;
	}


			@Override
			public String toString() {
				return "GroupList [registroGruppi=" + groupReg + "]\n";
			}
			
			

			public GroupList(){
					//Removes all of the elements from this list.
					groupReg.clear();

				}

			public boolean isGroupListEmpty(){
				return groupReg.isEmpty();
			}

		
				public void addGroup(Group group){
					for(int i=0;i<groupReg.size();i++){
						if((groupReg.get(i)).equals(group)){
							System.out.println("Gruppo non inserito nella lista dei gruppi perchè già presente");
						}
					}
					groupReg.add(group);
					//room.setIncrId();
					System.out.println("Gruppo inserito nella lista dei gruppi");
				}
				

		//Ritorna la camera in base all'indice della lista passato come parametro
				public Group getGroupByPos(int posizione){
					return groupReg.get(posizione);
				}



		//Ricerca tramite l'id della camera passato come parametro se la camera è presente nella lista e disponibile
				public int searchGroupPosById(int number){
					for(int i=0;i<groupReg.size();i++){
						if(((groupReg.get(i)).getNumber())==number){
							return i;
						}
						if(((groupReg.get(i)).getNumber())==number){
						return -1;
						}
					}
					return -2;
				}







		
		
				/*
				 * salva va reso un file xml <GRUPPO id="" nome="" dataArrivo="" anticipo="" singole="" doppie="" matrimoniali="" />
				 * */
				/*
				public void salvaInXML(){
					try{
						File file =new File("RegistroCamere.txt");
						FileOutputStream outStream= new FileOutputStream(file);
				        BufferedWriter lineWriter= new BufferedWriter(new OutputStreamWriter(outStream));
				        for(int i=0;i<roomReg.size();i++){
				            String LineaTesto;
				            LineaTesto="<CAMERA id="+(roomReg.get(i)).getId()+" descrizione="+(roomReg.get(i)).getDescrizione()+" extra="+
				            ((roomReg.get(i)).isExtras())+" disponibile="+((roomReg.get(i)).isDisponibile())+" />";
				            lineWriter.write(LineaTesto);
				        	//lineWriter.newLine();
						}
				        outStream.close();
				        lineWriter.close();
					}
					catch(IOException ioe){
						ioe.printStackTrace();
					}
				}




				public void caricaDaXML(){
					try{
			            File fileTesto =new File("RegistroCamere.txt");
			            FileInputStream inStream= new FileInputStream(fileTesto);
			            BufferedReader lineReader= new BufferedReader(new InputStreamReader(inStream));
			            Camera camera = null;
			            String lineaTesto;
			            int indexInit,indexEnd;
			            boolean trovato=false;
			            //legge il file riga per riga
			            while((lineaTesto=lineReader.readLine())!=null){
			                    if((indexInit=lineaTesto.indexOf("<CAMERA"))>-1){
			                            //estrae i dati del gruppo
			                            int id=Integer.parseInt(estrai("id",lineaTesto));
			                            String descrizione=estrai("descrizione",lineaTesto);
			                            String extra=estrai("extra",lineaTesto);
			                            String disponibile=estrai("disponibile",lineaTesto);
			                            //Appends the specified element to the end of this list.
			                            roomReg.add(camera);
			                            trovato=true;
			                    }
			                    else if((indexInit=lineaTesto.indexOf(" />"))>-1){
			                            System.out.println("Appena caricato il gruppo");
			                    }
			                    else{
			                            continue;
			                    }
			            }
			            //chiude il file di testo
			            lineReader.close();
			            inStream.close();
			            }
			            catch(IOException ioe){
			                    ioe.printStackTrace();
			            }
				}

				static String estrai(String chiave,String riga){
					int indexInit,indexEnd;
					indexInit=riga.indexOf(chiave)+chiave.length()+2;//pos chiave+2,ovvero ="
					String valore=riga.substring(indexInit);
					indexEnd=valore.indexOf('"');
					valore=valore.substring(0,indexEnd); //il secondo parametro di substring è escluso
					return valore;
				}
				
			*/	
				
				
				
				

		}
