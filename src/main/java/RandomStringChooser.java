import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String>words;
  public RandomStringChooser(String[] wordList){
    words = new ArrayList <String>();
    for(int i = 0; i < wordList.length; i++){
      words.add(wordList[i]);
    }
  }
  public String getNext(){
    if(words.size() == 0){
      return "NONE";
    } 
    int i = (int)(Math.random() * words.size());
    return words.remove(i);

  }
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
