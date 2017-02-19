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


public static void main(String args[]){
	System.out.println("Welcome to PENTATRIVIA!");
	Scanner scan=new Scanner(System.in);
	System.out.println("How many players do you want to play?");
	int numPlayers=scan.nextInt();
	scan.nextLine();
	Player[] gamePlayers= new Player[numPlayers];
	for(int n=0; n<numPlayers; n++){
		gamePlayers[n]=new Player();
	}
	ArrayList<Player> PlayersSortedByScore= new ArrayList<Player>();
	int continueOrNot;
	Player currentPlayer=new Player();

	
	for(int m=1; m>0; m++){
		System.out.println();
		System.out.println("ROUND "+m);
		System.out.println();
		
		
		for(int i=0; i<numPlayers; i++){
			currentPlayer= gamePlayers[i];
			if(m==1){
				System.out.println("Player "+(i+1)+", what is your name?");
				currentPlayer.setName(scan.nextLine());
			}
			System.out.println("It is "+currentPlayer.getName()+"'s turn!");
			System.out.println();
			
			Question PCQ = new PopCultureQuestion();
			System.out.println("Question 1: Pop Culture:"+ PCQ.askQuestion()); 
			String currentAnswer1 = currentPlayer.getInput();
			if (PCQ.isCorrect(currentAnswer1)){
				currentPlayer.incrementPoints();
				System.out.println("Correct!");}
			else{System.out.println("Incorrect. The correct answer is: "+ PCQ.getAnswer());}
			System.out.println();
			
			Question MathQ = new MathQuestion();
			System.out.println("Question 1:Math:"+ MathQ.askQuestion()); 
			String currentAnswer2 = currentPlayer.getInput();
			if (MathQ.isCorrect(currentAnswer2)){
				currentPlayer.incrementPoints();
				System.out.println("Correct!");}
			else{System.out.println("Incorrect. The correct answer is: "+ MathQ.getAnswer());}
			System.out.println();
			
			Question HistoryQ = new HistoryQuestion();
			System.out.println("Question 2:History:"+ HistoryQ.askQuestion()); 
			String currentAnswer3 = currentPlayer.getInput();
			if (HistoryQ.isCorrect(currentAnswer3)){
				currentPlayer.incrementPoints();
				System.out.println("Correct!");}
			else{System.out.println("Incorrect. The correct answer is: "+ HistoryQ.getAnswer());}
			System.out.println();
			
			Question ScienceQ = new ScienceQuestion();
			System.out.println("Question 1:Math:"+ ScienceQ.askQuestion()); 
			String currentAnswer4 = currentPlayer.getInput();
			if (ScienceQ.isCorrect(currentAnswer4)){
				currentPlayer.incrementPoints();
				System.out.println("Correct!");}
			else{System.out.println("Incorrect. The correct answer is: "+ ScienceQ.getAnswer());}
			System.out.println();
			
			Question GeographyQ = new GeographyQuestion();
			System.out.println("Question 1:Math:"+ GeographyQ.askQuestion()); 
			String currentAnswer5 = currentPlayer.getInput();
			if (GeographyQ.isCorrect(currentAnswer5)){
				currentPlayer.incrementPoints();
				System.out.println("Correct!");}
			else{System.out.println("Incorrect. The correct answer is: "+ GeographyQ.getAnswer());}
			System.out.println();
			
			gamePlayers[i]=currentPlayer;
			currentPlayer=null;
		}
		System.out.println("Round "+m+" complete! Here are the current rankings:");
		PlayersSortedByScore= sortScores(gamePlayers);
		for(Player g:PlayersSortedByScore){
			System.out.println((PlayersSortedByScore.indexOf(g)+1)+". "+g.getName()+" ----- "+g.getPoints()+" points.");
			}
		System.out.println();
		System.out.println("Do you want to continue your game or end it here?");
		System.out.println("To continue you game, type '1', to end it now type '2'.");
		continueOrNot=scan.nextInt();
		if(continueOrNot==2){m=-1;}
		
	}
	PlayersSortedByScore= sortScores(gamePlayers);
	System.out.println("Game ended.");
	System.out.println();
	System.out.println("The Winner is: "+PlayersSortedByScore.get(0).getName()+"!");
	System.out.println();
	System.out.println("Here are the final rankings:");
	for(Player g:PlayersSortedByScore){
		System.out.println((PlayersSortedByScore.indexOf(g)+1)+". "+g.getName()+" ----- "+g.getPoints()+" points.");
	}

	}
	
}

