
public class PopCultureQuestion extends Question{
	
	private int QuestionNumber;
	private String[] PCQList= new String[15];
	private String[] PCAList= new String[15];
	public PopCultureQuestion(){
		this.QuestionNumber= (int) Math.floor(Math.random() * 15);
		
		PCQList[0]="What movie released in 2016 was the second most successful movie of the year?";
		PCAList[0]="Finding Dory";
		PCQList[1]="Finish the title to this March 2016 film release - Batman v ?????";
		PCAList[1]="Superman";
		PCQList[2]="What is the name of the mammoth in the Ice Age movies?";
		PCAList[2]="Manny";
		PCQList[3]="Who does Johnny Depp play in the Pirates of the Caribbean films?";
		PCAList[3]="captain jack sparrow";
		PCQList[4]="Who is Prince William married to?";
		PCAList[4]="Kate";
		PCQList[5]="In which country did Manga originate?";
		PCAList[5]="Japan";
		PCQList[6]="Which country in the world has made the most movies?";
		PCAList[6]="India";
		PCQList[7]="What is the most popular instrument in the world?";
		PCAList[7]="piano";
		PCQList[8]="Which movie franchise has made more money: Harry Potter or Marvel?";
		PCAList[8]="Marvel";
		PCQList[9]="Which musical released in 2015 holds the record as the most-nominated production in Tony Awards history?";
		PCAList[9]="Hamilton";
		PCQList[10]="In what year did Leonardo Di Caprio finally win an Oscar?";
		PCAList[10]="2016";
		PCQList[11]="How many years did it take Lin Manuel Miranda to write the musical Hamilton?";
		PCAList[11]="6";
		PCQList[12]="What is the first name of the Male lead character in La La Land?";
		PCAList[12]="Sebastian";
		PCQList[13]="How many times has someone in the Star Wars movies lost thier hand/arm?";
		PCAList[13]="13";
		PCQList[14]="What is the most popular social media platform in the world?";
		PCAList[14]="Facebook";
	}
	
	public String askQuestion(){ 
		return PCQList[QuestionNumber];
	}
	
	public boolean isCorrect(String response){
		return super.isCorrect(response, PCAList[QuestionNumber]);
	}
	public String getAnswer(){
		return PCAList[QuestionNumber];
	}

}
