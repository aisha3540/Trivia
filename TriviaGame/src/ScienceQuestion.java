
public class ScienceQuestion extends Question{
	
	private int QuestionNumber;
	private String[] ScienceQList= new String[15];
	private String[] ScienceAList= new String[15];
	public ScienceQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
		ScienceQList[0]=
		ScienceAList[0]=
		ScienceQList[1]=
		ScienceAList[1]=
		ScienceQList[2]=
		ScienceAList[2]=
		ScienceQList[3]=
		ScienceAList[3]=
		ScienceQList[4]=
		ScienceAList[4]=
		ScienceQList[5]=
		ScienceAList[5]=
		ScienceQList[6]=
		ScienceAList[6]=
		ScienceQList[7]=
		ScienceAList[7]=
		ScienceQList[8]=
		ScienceAList[8]=
		ScienceQList[9]=
		ScienceAList[9]=
		ScienceQList[10]=
		ScienceAList[10]=
		ScienceQList[11]=
		ScienceAList[11]=
		ScienceQList[12]=
		ScienceAList[12]=
		ScienceQList[13]=
		ScienceAList[13]=
		ScienceQList[14]=
		ScienceAList[14]=
	}
	
	public String askQuestion(){
		return ScienceQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, ScienceAList[QuestionNumber]);
	}

}
