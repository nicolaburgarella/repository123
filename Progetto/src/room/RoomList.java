package room;

import java.util.ArrayList;
import java.util.Arrays;

public class RoomList {

private ArrayList<Room> roomReg=new ArrayList<Room>();

		@Override
		public String toString() {
			return "RoomList [registroCamere=" + roomReg + "]\n";
		}
		
		public ArrayList<Room> getRoomReg(){
			return roomReg;
		}

		public void setRoomReg(ArrayList<Room> roomReg) {
			this.roomReg = roomReg;
		}


		public RoomList(){
				//Removes all of the elements from this list.
				roomReg.clear();

			}

		public boolean isRoomListEmpty(){
			return roomReg.isEmpty();
		}

	
			public void addRoom(Room room){
				for(int i=0;i<roomReg.size();i++){
					if((roomReg.get(i)).equals(room)){
						System.out.println("Stanza non inserita perchè già presente nella lista elle stanze");
					}
				}
				roomReg.add(room);
				System.out.println("Stanza inserita nella lista delle stanze");
			}

	//Ritorna la camera in base all'indice della lista passato come parametro
			public Room getRoomByPos(int posizione){
				return roomReg.get(posizione);
			}
			
			public int getFreeRoomsCountByComp(String flagcomp) {
				int count = 0;
				if(flagcomp=="singole"){
					System.out.println("Ecco l'elenco delle camere singole disponibili :");
					for(int i=0;i<roomReg.size();i++){
						if((roomReg.get(i).getComposition()).equalsIgnoreCase("1") && (roomReg.get(i).getFree()).equalsIgnoreCase("yes")){
							++count;
							System.out.println(roomReg.get(i));						}
					}
					System.out.println("Per un totale di "+count+" camere singole disponibili");
					return count;
					
				}
				
				if(flagcomp=="doppie"){
					System.out.println("Ecco l'elenco delle  elenco di camere doppie disponibili :");
					for(int i=0;i<roomReg.size();i++){
						if((roomReg.get(i).getComposition()).equalsIgnoreCase("1+1") && (roomReg.get(i).getFree()).equalsIgnoreCase("yes")){
							++count;
							System.out.println(roomReg.get(i));
						}
					}
					System.out.println("Per un totale di "+count+" camere doppie disponibili");
					return count;
					
				}
				
				if(flagcomp=="matrimoniali"){
					System.out.println("Ecco l'elenco delle  elenco di camere matrimoniali disponibili :");
					for(int i=0;i<roomReg.size();i++){
						if((roomReg.get(i).getComposition()).equalsIgnoreCase("2") && (roomReg.get(i).getFree()).equalsIgnoreCase("yes")){
							++count;
							System.out.println(roomReg.get(i));
						}
					}
					System.out.println("Per un totale di "+count+" camere matrimoniali disponibili");
					return count;
					
				}
				System.out.println("Non esistono tipologie di composizione selezionate");
				return count=0;
				
				
			}


			public int [] getFreeSingleRooms() {
				System.out.print("Ora salvo in array l'elenco del numero di camera di quelle singole disponibili :\t");
				int count = 0;
				int [] singleArray=new int[roomReg.size()];
				for(int i=0;i<roomReg.size();i++){
					
					if((roomReg.get(i).getComposition()).equalsIgnoreCase("1") && (roomReg.get(i).getFree()).equalsIgnoreCase("yes")){
						//++count;
						//System.out.println(roomReg.get(i)+"\nper un totale di "+count+" camere singole disponibili");
						singleArray[i]=roomReg.get(i).getNumber();
					}
					
				}
				singleArray=removeZerosFromIntArray(singleArray);
				return singleArray; 
			}

			public int [] getFreeDoubleRooms() {
				System.out.print("Ora salvo in array l'elenco del numero di camera di quelle doppie disponibili :\t");
				int count=0;
				int [] doubleArray=new int[roomReg.size()];
				for(int i=0;i<roomReg.size();i++){
					if((roomReg.get(i).getComposition()).equalsIgnoreCase("1+1") && (roomReg.get(i).getFree()).equalsIgnoreCase("yes")){
						//++count;
						//System.out.println(roomReg.get(i)+"\nper un totale di "+count+" camere doppie disponibili");
						doubleArray[i]=roomReg.get(i).getNumber();
					}
				}
				doubleArray=removeZerosFromIntArray(doubleArray);
				return doubleArray;
			}

			public int [] getFreeWeddingRooms() {
				System.out.print("Ora salvo in array l'elenco del numero di camera di quelle matrimoniali disponibili :\t");
				int count=0;
				int [] weddingArray=new int[roomReg.size()];
				for(int i=0;i<roomReg.size();i++){
					if((roomReg.get(i).getComposition()).equalsIgnoreCase("2") && (roomReg.get(i).getFree()).equalsIgnoreCase("yes")){
						//++count;
						//System.out.println(roomReg.get(i)+"\nper un totale di "+count+" camere matrimoniali disponibili");
						weddingArray[i]=roomReg.get(i).getNumber();
					}
				}
				weddingArray=removeZerosFromIntArray(weddingArray);
				return weddingArray;
			}
			

			public int[] removeZerosFromIntArray(int[] arr) {
				// TODO Auto-generated method stub
				
				   // int[] arr = new int[]{0,1,1,0,2,1};
				    int[] nonZeroArr = arr;

				    Arrays.sort(nonZeroArr);
				    int index = -1;
				    while((index = Arrays.binarySearch(nonZeroArr, 0)) > -1){
				        int[] newArr = new int[nonZeroArr.length-index-1];
				        System.arraycopy(nonZeroArr, index+1, newArr, 0, newArr.length);
				        nonZeroArr = newArr;
				    }
				   /* for (int d : arr) {
				        System.out.print(d +",");
				    }
				    System.out.println();
				    for (int d : nonZeroArr) {
				        System.out.print(d + ",");
				    }*/
					return nonZeroArr;
				}


	}


