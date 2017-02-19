
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
		ScienceQList[8]="What is the only common positive polyatomic ion?";
		ScienceAList[8]="Ammonium";
		ScienceQList[9]="When left in the sun, what will a jellyfish do?";
		ScienceAList[9]="Evaporate";
		ScienceQList[10]="The electrons on the outer shell of an aton are called the _______ electrons.";
		ScienceAList[10]="Valence";
		ScienceQList[11]="The equation for kinetic energy is KE= 1/2___v^2.";
		ScienceAList[11]="m";
		ScienceQList[12]="What is the symbol of the 77th element on the periodic table?";
		ScienceAList[12]="Ir";
		ScienceQList[13]="The number 6.022*10^23 is one ________.";
		ScienceAList[13]="Mole";
		ScienceQList[14]="What is the term used to desbribe the is the vertical stretching and horizontal compression of objects into long thin shapes in a very strong non-homogeneous gravitational field?";
		ScienceAList[14]="Spaghettification";
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
