
public class PopCultureQuestion extends Question{
	
	private int QuestionNumber;
	private String[] PCQList= new String[15];
	private String[] PCAList= new String[15];
	public PopCultureQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
	}
	
	public String askQuestion(){
		return PCQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, PCAList[QuestionNumber]);
	}

}
