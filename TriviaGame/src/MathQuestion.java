
public class MathQuestion extends Question{
	
	private int QuestionNumber;
	private String[] MathQList= new String[15];
	private String[] MathAList= new String[15];
	public MathQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
		MathQList[0]=
		MathAList[0]=
		MathQList[1]=
		MathAList[1]=
		MathQList[2]=
		MathAList[2]=
		MathQList[3]=
		MathAList[3]=
		MathQList[4]=
		MathAList[4]=
		MathQList[5]=
		MathAList[5]=
		MathQList[6]=
		MathAList[6]=
		MathQList[7]=
		MathAList[7]=
		MathQList[8]=
		MathAList[8]=
		MathQList[9]=
		MathAList[9]=
		MathQList[10]=
		MathAList[10]=
		MathQList[11]=
		MathAList[11]=
		MathQList[12]=
		MathAList[12]=
		MathQList[13]=
		MathAList[13]=
		MathQList[14]=
		MathAList[14]=
	}
	
	public String askQuestion(){
		return MathQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, MathAList[QuestionNumber]);
	}

}
