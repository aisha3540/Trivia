
public class HistoryQuestion extends Question{
	
	private int QuestionNumber;
	private String[] HistoryQList= new String[15];
	private String[] HistoryAList= new String[15];
	public HistoryQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
		HistoryQList[0]="";
		HistoryAList[0]="";
		HistoryQList[1]="";
		HistoryAList[1]="";
		HistoryQList[2]="";
		HistoryAList[2]="";
		HistoryQList[3]="";
		HistoryAList[3]="";
		HistoryQList[4]="";
		HistoryAList[4]="";
		HistoryQList[5]="";
		HistoryAList[5]="";
		HistoryQList[6]="";
		HistoryAList[6]="";
		HistoryQList[7]="";
		HistoryAList[7]="";
		HistoryQList[8]="";
		HistoryAList[8]="";
		HistoryQList[9]="";
		HistoryAList[9]="";
		HistoryQList[10]="";
		HistoryAList[10]="";
		HistoryQList[11]="";
		HistoryAList[11]="";
		HistoryQList[12]="";
		HistoryAList[12]="";
		HistoryQList[13]="";
		HistoryAList[13]="";
		HistoryQList[14]="";
		HistoryAList[14]="";
	}
	
	public String askQuestion(){
		return HistoryQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, HistoryAList[QuestionNumber]);
	}
	public String getAnswer(){
		return HistoryAList[QuestionNumber];
	}
}
