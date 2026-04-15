import java.util.Scanner;

public class Exam {
	
	private Questions[] questions;
	private int score;
	private long endTime;
	
	Scanner sc = new Scanner(System.in);
	
	public Exam() {
		
		 questions = new Questions[] {
				 
				 new Questions("Java is __________ language?", 
						 new String[] {"1.Programming", "2.Cooking", "3.Dancing", "4.Singing"},1),
				 
				 new Questions("Which is not a datatype?",
						 new String[] {"1.int", "2.float", "3.String", "4.print"},4),
				 
				 new Questions("OOP stands for?",
						 new String[] {"1.Object Oriented Programming", "2.Only One Program", "3. open office", "4. None"},1)
				 };
		 }
	
	public void startExam() {
		
		score = 0;
		
		endTime = System.currentTimeMillis() + 60000;
		System.out.println("\nExam Started! You Have 60 seconds.");
		
		for(int i = 0; i<questions.length; i++) {
			
			if(System.currentTimeMillis() > endTime) {
				System.out.println("\n Time's up! Auto Submitting....");
				break;
			}
			
			System.out.println("\nQ" + (i+1) + ":" + questions[i].question);
			
			for(String opt : questions[i].options) {
				System.out.println(opt);
			}
			
			System.out.println("Your answer:");
			
			
			if(!sc.hasNextInt()) {
				System.out.println("Invalid input! skipping question.");
				sc.next(); 
				continue;
			}
			int ans = sc.nextInt();
			
			if(ans == questions[i].correctAnswer) {
				score++;
			}
		}
		System.out.println("\n==== RESULT ====");
		System.out.println("Score:" + score + "/" + questions.length);
	}

}
