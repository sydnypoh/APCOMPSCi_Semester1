public class Magpie2
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.toLowerCase().trim();

		if (findKeyword(statement,"no") >= 0)
		{
			response = "Why so negative?";
		}
		
		else if(statement.length() == 0)
		{
			response = "Say something please.";
		}

		else if (findKeyword(statement,"mother") >= 0
				|| findKeyword(statement,"father") >= 0
				|| findKeyword(statement,"sister") >= 0
				|| findKeyword(statement,"brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		else if (findKeyword(statement,"dog") >= 0
				|| findKeyword(statement,"cat") >= 0
				|| findKeyword(statement,"turtle") >= 0
				|| findKeyword(statement,"fish") >= 0)
		{
			response = "Tell me more about your pet.";
		}
		
		else if (findKeyword(statement,"robinette") >= 0)
		{
			response = "He sounds like a pretty dank teacher.";
		}
		
		else if (findKeyword(statement, "i want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}

		
		else{

			int psn = findKeyword(statement, "you", 0);
			int pos = findKeyword(statement, "i", 0);
			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			
			else if (pos >= 0 && findKeyword(statement, "you", pos) >= 0)
			{
				response = transformIYouStatement(statement);
			}
			
			else
			{
				response = getRandomResponse();
			}
		}
		return response;
	}

	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = "  " + statement.toLowerCase().trim() + "  ";
		int psn = phrase.indexOf(goal, startPos);
		String before = "";
		String after = "";

		if(psn >= 0)
		{
			before = phrase.substring(psn - 1, psn);
			after = phrase.substring(goal.length() + psn, goal.length() + psn + 1);
				
			if((before.compareTo("a") >= 0 && before.compareTo("z") <= 0) || (after.compareTo("a") >= 0 && after.compareTo("z") <= 0))
			{
				return phrase.indexOf(goal, psn+1);
			}
			return psn - 1;			
		}
		return -1;
		
	}

	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
	
	private String transformIWantToStatement(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement.length()-1);
		
		if(lastChar.equals("."))
		{
			statement = statement.replace(lastChar,"");
		}
		
		int psn = findKeyword(statement, "i want to");
		String restOfStatement = statement.substring(psn + 9, statement.length());
		
		return "What would it mean to " + restOfStatement + "?";
	}
	
	private String transformYouMeStatement(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement.length()-1);
		
		if(lastChar.equals("."))
		{
			statement = statement.replace(lastChar,"");
		}
		
		int psnOfYou = findKeyword(statement, "you");
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe -1);
		
		return "What makes you think that I " + restOfStatement + "you?";
	}
	
	private String transformIYouStatement(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement.length()-1);
		
		if(lastChar.equals("."))
		{
			statement = statement.replace(lastChar,"");
		}
		
		int psnOfI = findKeyword(statement, "i");
		int psnOfU = findKeyword(statement, "you");
		String restOfStatement = statement.substring(psnOfI + 1, psnOfU-1);
		
		return "Why do you " + restOfStatement + "me?";
	}
	
}
