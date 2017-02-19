import java.util.Scanner;
public class Player {
	
	private int points;
	private String currentAnswer; 
	private String name;
  
  public Player(){
	  this.points=0;
	  this.name=null;
  }
  
  public String getInput(){
	  Scanner console = new Scanner(System.in); 
	  currentAnswer = console.nextLine().toString();
	  return currentAnswer; 
  }
  
  public void incrementPoints(){
		  points++; 
  }
  public int getPoints(){
	  return points;
  }
  public void setName(String Name){
	  this.name=Name;
  }
  public String getName(){
	  return this.name;
  }


}
 
