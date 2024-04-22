import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> theList;
  public RandomStringChooser(string[] wordList){
    theList = new ArrayList <String>();
    for(int i = 0; i < wordList.length; i++){
      theList.add(wordList[i]);
    }
  }
  public String getNext(){
    if(theList.size() == 0){
      return "NONE";
    } 
    int i = (int)(math.Random() * theList.size());
    return words.remove(i);

  }
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
