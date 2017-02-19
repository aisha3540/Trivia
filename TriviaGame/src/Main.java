
public class Main {
private int pointsPlayer1;
private int pointsPlayer2; 
private static Players player1; 
private static Players player2; 
private static int playerNumber; 
public Main(){
	player1 = new Players();
	player2 = new Players();
	playerNumeber = 1; 
}

public int getPoints(){
	if (playerNumber == 1){
		if(Question.isCorrect(playerResponse, answer)) {
		player1.incrementPoints();
	}
	}
	else{
		if(Question.isCorrect(playerResponse, answer)) {
			player2.incrementPoints();
		}
	}
}

public static void Main(String args[]){
	while (playerNumber <= 2){	
	Question MathQ = new MathQuestion();
	System.out.println(MathQ.askQuestion()); 
	String currentAnswer = player1.getInput();
	if (MathQ.isCorrect(currentAnswer)){
		player1.incrementPoints();}
	Question HistoryQ = new HistoryQuestion();
	System.out.println(HistoryQ.askQuestion()); 
	currentAnswer = player1.getInput();
	if (HistoryQ.isCorrect(currentAnswer)){
		player1.incrementPoints();}
	Question PopCultureQ = new PopCultureQuestion();
	PopCultureQ.askQuestion(); 
	 currentAnswer = player1.getInput();
	if (HistoryQ.isCorrect(currentAnswer)){
		player1.incrementPoints();}
	Question ScienceQ = new ScienceQuestion();
	ScienceQ.askQuestion(); 
	 currentAnswer = player1.getInput();
	if (ScienceQ.isCorrect(currentAnswer)){
		player1.incrementPoints();}
	
	
	playerNumber++; 
}

}
	
	




}

