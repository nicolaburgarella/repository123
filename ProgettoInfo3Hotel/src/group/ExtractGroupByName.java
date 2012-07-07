package group;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class ExtractGroupByName {
	
	public ExtractGroupByName(){
		
	}
	
	public Group extractGroupByName(String name) {
		  
		  Group g=null;
		  	  SAXBuilder builder = new SAXBuilder(); 
		        Document document = null;
		  	try {
		  		document = builder.build(new File("groups.xml"));
		  	} catch (JDOMException e1) {
		  		// TODO Auto-generated catch block
		  		e1.printStackTrace();
		  	} catch (IOException e1) {
		  		// TODO Auto-generated catch block
		  		e1.printStackTrace();
		  	} 

		      try {
		      	 //Prendo la radice 
		          Element root = document.getRootElement(); 
		          //Estraggo i figli dalla radice 
		          List children = root.getChildren("GROUP"); 
		          for(int i=0;i<(children.size());i++){
		          	if(((Element)children.get(i)).getAttributeValue("name").equalsIgnoreCase(name)){
		          		System.out.println("Group details:");
		                  int number=Integer.parseInt(((Element)children.get(i)).getAttributeValue("number")); 
		                  name=((Element)children.get(i)).getAttributeValue("name");
		                  String checkin=((Element)children.get(i)).getAttributeValue("checkin"); 
		                  String checkout=((Element)children.get(i)).getAttributeValue("checkout");
		                  float deposit=Float.parseFloat(((Element)children.get(i)).getAttributeValue("deposit"));
		                  g=new Group(number, name, checkin, checkout, deposit);
		          	}
		          	/*else{
		         			System.out.println("Gruppo da estrarre non trovato");
		         		}*/
		          	
		          }
		             
		  		/*
		  		//Creazione dell'oggetto XMLOutputter 
		  	      XMLOutputter outputter = new XMLOutputter(); 
		  	      //Imposto il formato dell'outputter come "bel formato" 
		  	      outputter.setFormat(Format.getPrettyFormat()); 
		  	      //Produco l'output sul file xml.foo 
		  	      outputter.output(document, new FileOutputStream("groups.xml")); 
		  	      //System.out.println("File creato:"); 
		  	      //Stampo l'output anche sullo standard output 
		  	      //outputter.output(document, System.out); 
		        */
		     
		      } catch (Exception e) {
		        System.out.println(e);
		      }
			return g;
		    }

	 
	

}
