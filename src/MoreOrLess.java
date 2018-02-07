import java.util.Random;
import java.util.Scanner;

public class MoreOrLess {
	
	// CONFIGURE THE NUMBER MAX
	public static final int NUMBERMAX = 100;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		// Init. status and other variables
		char status = ' ';
		int numberToFind = random.nextInt(NUMBERMAX) + 1;
		int numberTry = 1;
		
		// Title
		System.out.println("-----------------------------------------------------");
		System.out.println("\t\tTHE MORE OR LESS GAME");
		System.out.println("-----------------------------------------------------");
		System.out.println("Chose a number:");
		
		do { // IF "status == 0"
			int number = sc.nextInt();
			
			if (number > numberToFind) {
				// IT'S LESS
				status = '0';
				numberTry++;
				System.out.println("It's less, chose a new number!");
			}
			else if (number < numberToFind) {
				// IT'S MORE
				status = '0';
				numberTry++;
				System.out.println("It's more, chose a new number!");
			}
			else if (number == numberToFind) {
				// IT'S WIN
				status = '1';
				System.out.println("-----------------------------------------------------");
				System.out.println(".. !!\t\tY O U\tW I N\t\t!! ..");
				System.out.print("The number was: " + numberToFind);
				System.out.println(" and ou found it with " + numberTry + " tries");
				System.out.println("-----------------------------------------------------");
			}
			else {
				System.out.println("ERROR");
			}
		} while (status == '0');
	}
}
