package org.koushik.javabrains.action;

import org.koushik.javabrains.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	private String language;
	
	//il metodo execute chiama il metodo deel business service
	//in realtà non si dovrebbe chiamare una istanza di tutorialfinderservice nella classe action,
	//è meglio utilizzare una interfaccia con la sua implementazione, e la classe action chiamerebbe il metodo della interfaccia
	//e non l'implementazione della action, come usato regolarmente con Spring Dependency Injection per esempio
	//dove dichiaro una interfaccia all'interno di execute come variabile membro, e viene injected che l'istanza della implmentazione di Spring
	// aggiungo all'url /tutorial/getTutorials.action
	//http://localhost:8080/TutorialFinder/tutorials/getTutorial.action?language=dotnet per richiamare la variabile membro language definita nell'url
	
	//ho rinominato il metodo execute con gettutorial
	/*public String execute(){
		
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		//System.out.println(getLanguage());
		setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		//scrivi sysout e control+spazio
		//System.out.println(bestTutorialSite);
		return "success";

	}
	*/
	
public String getTutorial(){
		
		//TutorialFinderService tutorialFinderService = new TutorialFinderService();
		//System.out.println(getLanguage());
		//setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		//scrivi sysout e control+spazio
		//System.out.println(bestTutorialSite);
	System.out.println("Get Tutorial method called");
		return "success";

	}
	
public String addTutorial(){
		
		//TutorialFinderService tutorialFinderService = new TutorialFinderService();
		//System.out.println(getLanguage());
		//setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		//scrivi sysout e control+spazio
		//System.out.println(bestTutorialSite);
	System.out.println("Add Tutorial method called");
		return "success";

	}
	
/*	
	public String someOtherMethod(){
		System.out.println("Some other method executed.");
		return "success";
	}
	*/

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	

}
