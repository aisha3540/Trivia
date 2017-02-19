import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Player> sortScores(Player[] gameplayers){
		
		ArrayList<Player> sortedPlayers= new ArrayList<Player>();
		for(int i=0; i<gameplayers.length; i++){
			int highscore=0;
			for (int j=i; j<gameplayers.length; j++){
				if(gameplayers[j].getPoints()>highscore){
					sortedPlayers.set(i, gameplayers[j]);
					highscore=gameplayers[j].getPoints();
				}
			}
		}
		return sortedPlayers;
	}


public static void Main(String args[]){
	System.out.println("Welcome to (Name TBD)!");
	Scanner scan=new Scanner(System.in);
	System.out.println("How many players do you want to play?");
	int numPlayers=scan.nextInt();
	Player[] gamePlayers= new Player[numPlayers];
	ArrayList<Player> PlayersSortedByScore= new ArrayList<Player>();
	
	for(int m=1; m>0; m++){
		
	for(int i=0; i<numPlayers; i++){
		System.out.println("It is player "+(i+1)+"'s turn!");
		System.out.println("What is your name?");
		Player currentPlayer= gamePlayers[i];
		currentPlayer.setName(scan.next());
		
		Question PCQ = new PopCultureQuestion();
		System.out.println("Question 1: Pop Culture:"+ PCQ.askQuestion()); 
		String currentAnswer1 = currentPlayer.getInput();
		if (PCQ.isCorrect(currentAnswer1)){
			currentPlayer.incrementPoints();
			System.out.println("Correct!");}
		else{System.out.println("Incorrect. The correct answer is: "+ PCQ.getAnswer());}
		
		Question MathQ = new MathQuestion();
		System.out.println("Question 1:Math:"+ MathQ.askQuestion()); 
		String currentAnswer2 = currentPlayer.getInput();
		if (MathQ.isCorrect(currentAnswer2)){
			currentPlayer.incrementPoints();
			System.out.println("Correct!");}
		else{System.out.println("Incorrect. The correct answer is: "+ MathQ.getAnswer());}
		
		Question HistoryQ = new HistoryQuestion();
		System.out.println("Question 2:History:"+ HistoryQ.askQuestion()); 
		String currentAnswer3 = currentPlayer.getInput();
		if (HistoryQ.isCorrect(currentAnswer3)){
			currentPlayer.incrementPoints();
			System.out.println("Correct!");}
		else{System.out.println("Incorrect. The correct answer is: "+ HistoryQ.getAnswer());}
		
		Question ScienceQ = new ScienceQuestion();
		System.out.println("Question 1:Math:"+ ScienceQ.askQuestion()); 
		String currentAnswer4 = currentPlayer.getInput();
		if (ScienceQ.isCorrect(currentAnswer4)){
			currentPlayer.incrementPoints();
			System.out.println("Correct!");}
		else{System.out.println("Incorrect. The correct answer is: "+ ScienceQ.getAnswer());}
		
		Question GeographyQ = new GeographyQuestion();
		System.out.println("Question 1:Math:"+ GeographyQ.askQuestion()); 
		String currentAnswer5 = currentPlayer.getInput();
		if (GeographyQ.isCorrect(currentAnswer5)){
			currentPlayer.incrementPoints();
			System.out.println("Correct!");}
		else{System.out.println("Incorrect. The correct answer is: "+ GeographyQ.getAnswer());}
		
		gamePlayers[i]=currentPlayer;
		}
		System.out.println("Round "+m+" complete! Here are the current rankings:");
		
	}
	PlayersSortedByScore= sortScores(gamePlayers);
	
	System.out.println("The Winner is: "+PlayersSortedByScore.get(0).getName()+"!");
	System.out.println();
	System.out.println("Here are the rankings:");
	for(Player g:PlayersSortedByScore){
		System.out.println((PlayersSortedByScore.indexOf(g)+1)+". "+g.getName()+" ----- "+g.getPoints()+" points.");
	}

	}
	
}

