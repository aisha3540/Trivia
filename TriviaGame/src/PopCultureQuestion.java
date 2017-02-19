
public class PopCultureQuestion extends Question{
	
	private int QuestionNumber;
	private String[] PCQList= new String[15];
	private String[] PCAList= new String[15];
	public PopCultureQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
		
		PCQList[0]=
		PCAList[0]=
		PCQList[1]=
		PCAList[1]=
		PCQList[2]=
		PCAList[2]=
		PCQList[3]=
		PCAList[3]=
		PCQList[4]=
		PCAList[4]=
		PCQList[5]=
		PCAList[5]=
		PCQList[6]=
		PCAList[6]=
		PCQList[7]=
		PCAList[7]=
		PCQList[8]=
		PCAList[8]=
		PCQList[9]=
		PCAList[9]=
		PCQList[10]=
		PCAList[10]=
		PCQList[11]=
		PCAList[11]=
		PCQList[12]=
		PCAList[12]=
		PCQList[13]=
		PCAList[13]=
		PCQList[14]=
		PCAList[14]=
	}
	
	public String askQuestion(){
		return PCQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, PCAList[QuestionNumber]);
	}

}
