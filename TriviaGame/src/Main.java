
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
	for(int i = 0; i < 5; i++){
	//call questions array to get first question
	String currentAnswer = player1.getInput();
	if (Question.isCorrect(currentAnswer, answer)){
		player1.incrementPoints();
	}
	playerNumber++; 
}

}
	
	




}

