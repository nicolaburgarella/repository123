package org.koushik.javabrains.service;

public class TutorialFinderService {
	//metodo business service che la classe action chiamer�, qui � semplicissimo ma pu� avere varia complessit�
	public String getBestTutorialSite(String language){
		if(language.equals("java")){
		return "java brains";
		}
		else {
			return "Language not supported yet!";
		}
	}

}
