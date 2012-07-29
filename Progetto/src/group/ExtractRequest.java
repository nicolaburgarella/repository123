package group;

import java.io.*; 
import java.util.*; 

import org.jdom.*; 
import org.jdom.input.*; 

public class ExtractRequest { 
	public ExtractRequest(){
		
	}

  public Request ExtractRequestbyGroupName(String groupname) { 
	  Request r=null;
	  
	  if(groupname.equals(null)){
		  System.out.println("E' stato inserito un valore nullo");
		  return null;
	  }
	  
    try { 
      //Creo un SAXBuilder e con esco costruisco un document 
      SAXBuilder builder = new SAXBuilder(); 
      Document document = builder.build(new File("groups.xml")); 
      
       //Prendo la radice 
      Element root = document.getRootElement(); 
      //Estraggo i figli dalla radice 
      List children = root.getChildren(); 
      Iterator iterator = children.iterator(); 
      
       //Per ogni figlio 
      while(iterator.hasNext()){ 
         //Mostro il valore dell'elemento figlio "DESCR" e degli 
         //attributi "importanza", "perc_completamento", e "completata" 
         //sullo standard output 
         Element item = (Element)iterator.next();
         
         if(item.getAttributeValue("name").equalsIgnoreCase(groupname)){
    
         List richiesta = item.getChildren("RICHIESTA"); 
         for(int i=0;i<(richiesta.size());i++){
        	
        	 int singole=Integer.parseInt(((Element) richiesta.get(i)).getAttributeValue("singole"));
             int doppie=Integer.parseInt(((Element) richiesta.get(i)).getAttributeValue("doppie"));
             int matrimoniali=Integer.parseInt(((Element) richiesta.get(i)).getAttributeValue("matrimoniali"));
             String flag=((Element) richiesta.get(i)).getText();
             r=new Request(singole, doppie, matrimoniali, flag);
		     
        	//System.out.println(r.toString()+"\n");
         }
         return r;
         }
         else{
        	 //System.out.println("Non ho trovato nella struttura dati il "+groupname);
         }
         
         }

    }  
    catch (Exception e) { 
      System.err.println("Errore durante la lettura dal file"); 
      e.printStackTrace(); 
    }
	return r; 

}
  
}