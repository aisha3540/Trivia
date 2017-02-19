
public abstract class Question {
	
	public String response;
	public abstract String askQuestion();
	public boolean isCorrect(String playerResponse, String answer){
		if(playerResponse.equalsIgnoreCase(answer)){
			return true;}
		else{return false;}
	}
	public abstract String getAnswer();
	public abstract boolean isCorrect(String playerResponse);
}


