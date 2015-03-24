/**
 * reference: http://stackoverflow.com/questions/19108902/java-how-to-ask-user-if-he-she-wants-to-continue-program
 */

import java.util.*;

public class PrimeKey {
	public static void main(String[] args) {
		int num, count = 0;
		String answer="";
		Scanner scan = new Scanner(System.in); // scanner for input

		do {
			System.out.print("Enter any number: ");
			num = scan.nextInt();
			for (int i = 2; i <= (num / 2); i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0 && (num != 1))
				System.out.println(num + " is a prime number.");
			else
				System.out.println(num + " is not a prime number.");
			System.out.print("Continue(Y/N) ");
			answer = scan.next();
		} while (answer.equals("Y")||answer.equals("y"));
		
		do
		{
			if(!answer.equals("n")&&!answer.equals("N"))
			{
				System.out.println("Program does not recognize "+"'"+answer+"'");
				System.out.print("Continue(Y/N) ");
				answer = scan.next();
			}
			
			while (answer.equals("Y")||answer.equals("y")) {
				System.out.print("Enter any number: ");
				num = scan.nextInt();
				for (int i = 2; i <= (num / 2); i++) {
					if (num % i == 0) {
						count++;
						break;
					}
				}
				if (count == 0 && (num != 1))
					System.out.println(num + " is a prime number.");
				else
					System.out.println(num + " is not a prime number.");
				System.out.print("Continue(Y/N) ");
				answer = scan.next();
			}
		} while(!answer.equals("n")||answer.equals("N"));
		
		
		System.out.println("Good Bye!");
	}

}
