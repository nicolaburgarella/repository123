package org.koushik.javabrains.action;

import org.apache.commons.lang.StringUtils;
import org.koushik.javabrains.model.User;
import org.koushik.javabrains.service.LoginService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class LoginAction extends ActionSupport implements ModelDriven {
	
	//private String userId;
	//private String password;
	// variabile che passo al business service e che creo quando la login action viene istanziata (e non quando viene eseguita)
	// user è variabile menbro di login action, è struts 2 che istanzia l'oggetto quando vengono settati i valori da login.jsp
	// però se utilizzo il model objects e implemento l'interfaccia ModelDriven va istanziato
	private User user = new User();
	
	private static String SUCCESS = "success";
	
	//override the method of the actionsupport to verify that there is no blank value to userid and password
	//validate è fatto per validare i parametri di ingresso, 
	//poi va utilizzato il metodo addFieldError per passare un messaggio di errore per un particolare nome di un campo
	//in struts 2 non occorre la redirection, cioè se trova che ci sono errori automaticamente viene 
	// rediretto alla pagina del sumbit, cioè la form, 
	// le convenzioni standard di struts 2 permettono che la pagina di input dove l'utente inserisce i dati di ingresso
	// è quella dove si utilizzano le strighe di input che denotano il risultato
	// definisco nel file login.xml, nel package login la pagina jsp preposta solamente all'inserimento dei parametri in ingresso alla login action <result name="input">/login.jsp</result>
	//Quindi prima di chiamare execute, chiama validate, ma prima di chiamare validate, verifica che i campi non siano vuoti
	//In caso di errori non viene invocato il metodo execute, altrimenti prende il flow chart e viene rediretto al file login.xml relativo a "input" result
	//che me lo reinderizza alla pagina login.jsp
	//addFieldError viene stampato nella pagina di login sotto il campo della form se metto l'userid qualunque e niente nel campo password e/o viceversa
	// Quindi struts 2 non solo fa la redirection ma mostra anche i campi con errore 
	public void validate(){
		if (StringUtils.isEmpty(user.getUserId())){
			// user id blank
			addFieldError("userId", "User ID cannot be blank");
			
		}
		
		if (StringUtils.isEmpty(user.getPassword())){
			//password blank
			addFieldError("password", "Password cannot be blank");
			
		}
	}
	
	/*
	public String execute(){
		
		if(getUserId().equals("userId") && getPassword().equals("password")){
			 return SUCCESS;
		}
		return LOGIN;
	}*/
	
	public String execute(){
		
		LoginService loginService = new LoginService();
		//popolo il model object poi in realtà agisco direttamente dalla form login.jsp memorizzando i valori nell'oggetto user
		//user = new User();
		//user.setUserId(userId);
		//user.setPassword(password);
		
		//user è automaticamente settato dalla form login.jsp
		if(loginService.verifyLogin(user)){
			return SUCCESS;
		}
		return LOGIN;
	}
/*
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
*/

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}


