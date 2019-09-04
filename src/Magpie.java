/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
    // instance variables
    private boolean knowsAboutPets = false;
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
            statement = statement.trim().toLowerCase();
            if (statement.length() == 0) return "I don't want to talk to you anyways.";
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Stop being so negative.";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Your family is probably dissapointed in you.";
		}
                else if (statement.indexOf("dog") >= 0
                        || statement.indexOf("cat") >= 0){
                    if(!knowsAboutPets){
                        response = "I bet you're bad at taking care of pets.";
                        knowsAboutPets = true;
                    }
                    else 
                        response = "Please stop talking about your pets.";
                    // TODO: prevent repeat comment with a toggle
                }
                else if (statement.indexOf("adiletta") >= 0
                        || statement.indexOf("mr. adiletta") >= 0
                        || statement.indexOf("mr. a") >= 0){
                    response = "He sounds cool, cooler than you.";
                }
                else if (statement.indexOf("mean") >= 0)
		{
			response = "Why don't you go and cry about it.";
		}
                else if (statement.indexOf("who is joe?") >= 0
                        || statement.indexOf("who's joe?") >= 0)
		{
			response = "Joe Mama.";
		}
                else if (statement.indexOf("joe") >= 0)
		{
			response = "Don't ask who Joe is.";
		}
                else if (statement.indexOf("fight") >= 0)
		{
			response = "Let's fight today at 5:00";
		}
                else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 10;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "You talk a lot.";
		}
		else if (whichResponse == 1)
		{
			response = "You're dumb";
		}
		else if (whichResponse == 2)
		{
			response = "You must really like the sound of your voice.";
		}
		else if (whichResponse == 3)
		{
			response = "I don't want to hear more.";
		}
                else if (whichResponse == 4)
		{
			response = "I stopped paying attention a while ago.";
		}
                else if (whichResponse == 5)
		{
			response = "This is a very boring conversation.";
		}
                else if (whichResponse == 6)
		{
			response = "I'm bored of talking to you.";
		}
                else if (whichResponse == 7)
		{
			response = "Please stop talking to me.";
		}
                else if (whichResponse == 8)
		{
			response = "I have more interesting conversations with your grandma.";
		}
                else if (whichResponse == 9)
		{
			response = "I'd rather talk to a trash can than talk to you..";
		}
		
		return response;
	}
}
