
public class GeographyQuestion extends Question{
	
	private int QuestionNumber;
	private String[] GeographyQList= new String[15];
	private String[] GeographyAList= new String[15];
	
	public GeographyQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 15);
		
		GeographyQList[0]="What Country is North of the United States of America?";
		GeographyAList[0]="Canada";
		GeographyQList[1]="What Country produces the most Oxygen?";
		GeographyAList[1]="Russia";
		GeographyQList[2]="What is the Capital of El Salvador?";
		GeographyAList[2]="San Salvador";
		GeographyQList[3]="What is the Capital of Pakistan?";
		GeographyAList[3]="Islamabad";
		GeographyQList[4]="What is the Capital of Ireland?";
		GeographyAList[4]="Dublin";
		GeographyQList[5]="What is the largest state in the continental United States?";
		GeographyAList[5]="Texas";
		GeographyQList[6]="The tallest mountain in the world is Mount _________.";
		GeographyAList[6]="Everest";
		GeographyQList[7]="How many countries are there?";
		GeographyAList[7]="195";
		GeographyQList[8]="What country completely surrounds Lesotho?";
		GeographyAList[8]="South Africa";
		GeographyQList[9]="What is the largest country in the world?";
		GeographyAList[9]="Russia";
		GeographyQList[10]="What is the smallest country in the world?";
		GeographyAList[10]="Vatican City";
		GeographyQList[11]="The _______ Ocean is the northernmost ocean in the world.";
		GeographyAList[11]="Arctic";
		GeographyQList[12]="What country lies on the Southwest coast of Latin America?";
		GeographyAList[12]="Chile";
		GeographyQList[13]="What is the capital of Canada?";
		GeographyAList[13]="Ottawa";
		GeographyQList[14]="What is the smallest state (by land area) in the US?";
		GeographyAList[14]="Rhode Island";
	}
	
	public String askQuestion(){
		return GeographyQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, GeographyAList[QuestionNumber]);
	}
	public String getAnswer(){
		return GeographyAList[QuestionNumber];
	}

}
