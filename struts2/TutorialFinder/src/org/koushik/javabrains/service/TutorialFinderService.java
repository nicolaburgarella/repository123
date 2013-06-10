package org.koushik.javabrains.service;

public class TutorialFinderService {
	//metodo business service che la classe action chiamerà, qui è semplicissimo ma può avere varia complessità
	public String getBestTutorialSite(String language){
		if(language.equals("java")){
		return "java brains";
		}
		else {
			return "Language not supported yet!";
		}
	}

}
