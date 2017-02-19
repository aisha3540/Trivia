   
public class MathQuestion extends Question{
	
	private int QuestionNumber;
	private String[] MathQList= new String[15];
	private String[] MathAList= new String[15];
	public MathQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
		MathQList[0]="What is 9*8?";
		MathAList[0]="72";
		MathQList[1]="What is 125/5?";
		MathAList[1]="25";
		MathQList[2]="What is 5926+3517";
		MathAList[2]="9443";
		MathQList[3]="What is the Square Root of 64?";
		MathAList[3]="8";
		MathQList[4]="What is log(10)?";
		MathAList[4]="1";
		MathQList[5]="What is ln(1)?";
		MathAList[5]="0";
		MathQList[6]="What is log(1000)?";
		MathAList[6]="3";
		MathQList[7]="What is sin(\u03C0/6)?(simplest fraction form)";  ///that weird thing is Java code for pi
		MathAList[7]="1/2";
		MathQList[8]="What is cos(\u03C0/3)?(simplest fraction form)";
		MathAList[8]="1/2";
		MathQList[9]="What is log base 2 of 512?";
		MathAList[9]="9";
		MathQList[10]="How many degrees is 3\u03C0/2 radians?";
		MathAList[10]="270";
		MathQList[11]="What is 64 squared?";
		MathAList[11]="4096";
		MathQList[12]="What is the cube root of 64?";
		MathAList[12]="4";
		MathQList[13]="What is 7*365?";
		MathAList[13]="2555";
		MathQList[14]="What is 2397-669?";					
		MathAList[14]="1728";					
	}
	
	public String askQuestion(){
		return MathQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, MathAList[QuestionNumber]);
	}
	public String getAnswer(){
		return MathAList[QuestionNumber];
	}

}
