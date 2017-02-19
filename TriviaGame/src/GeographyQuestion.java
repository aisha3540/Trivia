
public class GeographyQuestion extends Question{
	
	private int QuestionNumber;
	private String[] GeographyQList= new String[15];
	private String[] GeographyAList= new String[15];
	public GeographyQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
	}
	
	public String askQuestion(){
		return GeographyQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, GeographyAList[QuestionNumber]);
	}

}
