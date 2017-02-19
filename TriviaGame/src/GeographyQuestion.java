
public class GeographyQuestion extends Question{
	
	private int QuestionNumber;
	private String[] GeographyQList= new String[15];
	private String[] GeographyAList= new String[15];
	
	public GeographyQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
		
		GeographyQList[0]="What Country is North of the United States of America?";
		GeographyAList[0]="Canada";
		GeographyQList[1]="";
		GeographyAList[1]="";
		GeographyQList[2]="";
		GeographyAList[2]="";
		GeographyQList[3]="";
		GeographyAList[3]="";
		GeographyQList[4]="";
		GeographyAList[4]="";
		GeographyQList[5]="";
		GeographyAList[5]="";
		GeographyQList[6]="";
		GeographyAList[6]="";
		GeographyQList[7]="";
		GeographyAList[7]="";
		GeographyQList[8]="";
		GeographyAList[8]="";
		GeographyQList[9]="";
		GeographyAList[9]="";
		GeographyQList[10]="";
		GeographyAList[10]="";
		GeographyQList[11]="";
		GeographyAList[11]="";
		GeographyQList[12]="";
		GeographyAList[12]="";
		GeographyQList[13]="";
		GeographyAList[13]="";
		GeographyQList[14]="";
		GeographyAList[14]="";
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
