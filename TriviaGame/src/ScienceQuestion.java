
public class ScienceQuestion extends Question{
	
	private int QuestionNumber;
	private String[] ScienceQList= new String[15];
	private String[] ScienceAList= new String[15];
	public ScienceQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 16);
		ScienceQList[0]="What is the sympol for the element Tin?";
		ScienceAList[0]="Sn";
		ScienceQList[1]="Besides Mercury, what is the name of the only other element that is naturally a liquid?";
		ScienceAList[1]="Bromine";
		ScienceQList[2]="Gravity on the Earth's surface pulls with an acceleration of ______ meters per second squared.";
		ScienceAList[2]="9.8";
		ScienceQList[3]="How many elements are there in the Periodic Table?";
		ScienceAList[3]="118";
		ScienceQList[4]="What is the most common element in the human body?";
		ScienceAList[4]="Oxygen";
		ScienceQList[5]="What is the scientific term for the production of light by living organisms?";
		ScienceAList[5]="Bioluminescence";
		ScienceQList[6]="Gravitational _________ energy is determined by the equation mgh.";
		ScienceAList[6]="Potential";
		ScienceQList[7]="An Ammonium ion has how many hydrogen atoms in it?";
		ScienceAList[7]="4";
		ScienceQList[8]="What is the on";
		ScienceAList[8]="";
		ScienceQList[9]="";
		ScienceAList[9]="";
		ScienceQList[10]="";
		ScienceAList[10]="";
		ScienceQList[11]="";
		ScienceAList[11]="";
		ScienceQList[12]="";
		ScienceAList[12]="";
		ScienceQList[13]="";
		ScienceAList[13]="";
		ScienceQList[14]="";
		ScienceAList[14]="";
	}
	
	public String askQuestion(){
		return ScienceQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, ScienceAList[QuestionNumber]);
	}
	public String getAnswer(){
		return ScienceAList[QuestionNumber];
	}
}
