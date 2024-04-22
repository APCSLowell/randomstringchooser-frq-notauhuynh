public class RandomLetterChooser extends RandomStringChooser
{
	private ArrayList <String> letters;
	public RandomLetterChooser(String str)
	{ 
		letters = new ArrayList<Strings>();
		for(int i = 0; i < str.length - 1; i++){
		  letters.add(str.substring(i, i + 1));
		}
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
