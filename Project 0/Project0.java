import javax.swing.*;

public class Project0 
{
	public static void main (String[] args)
	{
		while (true)//program will run infinitely 
		{
		String userSentence = JOptionPane.showInputDialog(null, "Please enter a sentence:");//stores sentence
																							//input by user
																							//into string called
																							//userSentence
		if (userSentence.equalsIgnoreCase("stop"))//program terminates if user types in stop,  
		{										 //regardless of case
			System.exit(0);
		}
		
		int lowerCase = 0;//counter for lowercase E
		int upperCase = 0;//counter for uppercase E
		for (int i = 0; i < userSentence.length(); i++)//for loop that searches for upper and lower case
		{											  //e from first to last character of userSentence
			
			if (userSentence.charAt(i) == 'e')//increase lowercase E's counter when lowercase E found
			{
				lowerCase++;
			}
			
			if (userSentence.charAt(i) == 'E')//increase uppercase E's counter when uppercase E found
				upperCase++;
		}
		JOptionPane.showMessageDialog(null, "The number of lowercase e's: " + lowerCase + "\nThe number of"
				+ " uppercase e's: " + upperCase);//outputs the # of times upper and lower case appears in
		}										  //userSentence
	}
}
