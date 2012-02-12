/**
 *Interazione tra thread:produttore e consumatore
 */

import java.util.*;
public class Buffer {
	int size;
	ArrayList list=new ArrayList();

	public Buffer(int size){
		this.size=size;
	}

	public synchronized void add(Object obj){
		try{
			while(list.size()==size){
				wait();
			}
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		list.add(obj);
		notify();
	}

	public synchronized Object remove(){
		try{
			while(list.size()==0){
				wait();
			}
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		Object obj=list.remove(list.size()-1);
		notify();
		return obj;
	}
}
