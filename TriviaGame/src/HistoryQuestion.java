
public class HistoryQuestion extends Question{
	
	private int QuestionNumber;
	private String[] HistoryQList= new String[15];
	private String[] HistoryAList= new String[15];
	public HistoryQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 15);
		HistoryQList[0]="What was Alexander Hamilton's first son's first name?";
		HistoryAList[0]="Philip";
		HistoryQList[1]="In what coninent did the Industrial Revolution first take place?";
		HistoryAList[1]="Europe";
		HistoryQList[2]="In what year did man first walk on the moon?";
		HistoryAList[2]="1969";
		HistoryQList[3]="Who killed Alexander Hamilton?";
		HistoryAList[3]="Aaron Burr";
		HistoryQList[4]="What year was Thomas Jefferson elected president of the United States?";
		HistoryAList[4]="1800";
		HistoryQList[5]="In what country was the first female elected president?";
		HistoryAList[5]="Argentina";
		HistoryQList[6]="What is the term which refers to the notion of European exceptionalism, a worldview centered on Western civilization.";
		HistoryAList[6]="Eurocentrism";
		HistoryQList[7]="The flag of what country is green with a yellow diamond in the middle and a blue circle inside the diamond?";
		HistoryAList[7]="Brazil";
		HistoryQList[8]="In what year did World War II end?";
		HistoryAList[8]="1945";
		HistoryQList[9]="What year was the Coca-Cola Company founded?";
		HistoryAList[9]="1892";
		HistoryQList[10]="What year was the US Declaration of Independence written?";
		HistoryAList[10]="1776";
		HistoryQList[11]="In what country was Buddhism originally founded?";
		HistoryAList[11]="India";
		HistoryQList[12]="Genghis Kahn founded the ______ Empire.";
		HistoryAList[12]="Mongol";
		HistoryQList[13]="What ancient river valley civilization settled between the Tigris and Euphrates rivers?";
		HistoryAList[13]="Mesopotamia";
		HistoryQList[14]="What is the indigenous faith of the Japanese people?";
		HistoryAList[14]="Shinto";
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
