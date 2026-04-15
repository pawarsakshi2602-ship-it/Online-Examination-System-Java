import java.util.Scanner;
public class OnlineExam {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		Exam exam = new Exam();
		
		System.out.println("==== LOGIN ====");
		
		System.out.println("Username:");
		String u = sc.next();
		
		System.out.println("Password:");
		String p = sc.next();
		
		if(!user.login(u, p)) {
			System.out.println("Invalid login!");
			
		}
		
		System.out.println("Login Successfully!");
		
		boolean running = true;
		
		while(running) {
			
		System.out.println("\n1.Start Exam");
		System.out.println("\n2.Update Profile");
		System.out.println("\n3. Logout");
		System.out.println("Choose:");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			exam.startExam();
			break;
		case 2:
			System.out.println("New Username:");
			String newU = sc.next();
			 
			System.out.println("New Password:");
			String newP = sc.next();
			
			user.updateProfile(newU, newP);
			System.out.println("Profile updated!");
			break;
		
		case 3:
			System.out.println("Logged out Successfully!");
			running = false;
			break;
			
		default:
			System.out.println("Invalid choice!");
		}
	}
	sc.close();
	}
}
