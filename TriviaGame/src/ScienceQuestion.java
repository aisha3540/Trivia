
public class ScienceQuestion extends Question{
	
	private int QuestionNumber;
	private String[] ScienceQList= new String[15];
	private String[] ScienceAList= new String[15];
	public ScienceQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
	}
	
	public String askQuestion(){
		return ScienceQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, ScienceAList[QuestionNumber]);
	}

}
