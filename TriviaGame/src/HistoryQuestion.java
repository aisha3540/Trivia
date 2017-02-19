
public class HistoryQuestion extends Question{
	
	private int QuestionNumber;
	private String[] HistoryQList= new String[15];
	private String[] HistoryAList= new String[15];
	public HistoryQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
	}
	
	public String askQuestion(){
		return HistoryQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, HistoryAList[QuestionNumber]);
	}

}
