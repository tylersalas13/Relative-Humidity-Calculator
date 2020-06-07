import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a temperature: ");
		int temp = sc.nextInt();
		System.out.println("Enter a dewpoint: ");
		int dp = sc.nextInt();
		
		AirParcel ap = new AirParcel (temp,dp);
		String response = ap.toString();
		
		System.out.println(response);
		
	}
}
