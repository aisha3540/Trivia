
public abstract class Question {
	
	public String response;
	
	public final int numQuestions=5;
	public abstract String askQuestion();
	public boolean isCorrect(String playerResponse, String answer){
		if(playerResponse.equalsIgnoreCase(answer)){
			return true;}
		else{return false;}
	}
	
	public abstract boolean isCorrect(String playerResponse);
}


