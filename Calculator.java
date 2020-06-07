import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		
		while (true) {
		
			Scanner input = new Scanner (System.in);
		
			System.out.println("Enter a temperature: ");
			int temp = input.nextInt();
			System.out.println("Enter a dewpoint: ");
			int dp = input.nextInt();
		
			AirParcel ap = new AirParcel (temp,dp);
			String response = ap.toString();
		
			System.out.println(response + '\n'); 
	
		}
		
		
	}
}
