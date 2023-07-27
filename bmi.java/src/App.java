import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
	// Weight (lb) / Height (in) ^2 * 703
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble();
		
		System.out.println("Enter height feet, inches:");
		
		
		// System.out.println("Enter height inches:");
        int heightFeet = input.nextInt();
		int heightInches = input.nextInt();
		
		int totalHeightInInches = (heightFeet * 12) + heightInches;
		input.close();
		
		double bmi = weight / Math.pow(totalHeightInInches, 2) * 703;
		
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println("Your BMI is: " + df.format(bmi));
        if(bmi>25 && bmi<30){
            System.out.println("You need to work out a little.");
        }
        if(bmi<25 && bmi>=19){
            System.out.println("You need to gain a little.");
        }
        if(bmi<19){
            System.out.println("You need to gain a lot.");
        }
        if(bmi>30){
            System.out.println("You need to work out hardly.");
        }
	}
}
