import java.util.Scanner;
public class Players {
	
	private int points;
	private String currentAnswer; 
  
  public Players(){
	  
  }
  
  public String getInput(){
	  Scanner console = new Scanner(System.in); 
	  currentAnswer = console.nextLine();
	  return currentAnswer; 
  }
  
  public void incrementPoints(){
		  points++; 
  }
  


}
 
