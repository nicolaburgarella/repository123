
public class Prova {
	
	public Prova(){
		
	}
	

	public static String WrapWords(String text, int maxLength)
	{
	    String[] words = text.split(regex)     //(' ');
	    for (int i = 0; i < words.length(); i++)
	    {
	        if (words[i].length() > maxLength) //long word
	        {
	            words[i] = words[i].insert(maxLength, " ");
	            //still long ?
	            words[i]=WrapWords(words[i], maxLength);
	        }
	    }
	    text = string.Join(" ", words);
	    return (text);
	}

}
