
public class MathQuestion extends Question{
	
	private int QuestionNumber;
	private String[] MathQList= new String[15];
	private String[] MathAList= new String[15];
	public MathQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
	}
	
	public String askQuestion(){
		return MathQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, MathAList[QuestionNumber]);
	}

}
