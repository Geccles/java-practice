import java.util.Scanner;
/**
 * Class to print out a name
 */
public class printName {

	public static void main(String[] args) {
		/**
		 * Write a Java Program to print "Hello" on
		 * a screen and then print your name on a separate line
		 */

		//my idea
		System.out.printf("Hello" + "%n" + "Galina Eccles" + "%n");
		
		//solution offered by course: I prefer this, cleaner and less to write
		System.out.println("\nHello\nGalina Eccles!");
		
		//Lets get fancy and have some fun with this
		System.out.println("\n \nEnter your Name and press the Enter Key ");
		Scanner input = new Scanner(System.in);
		
		try{
			String name = input.nextLine();
			System.out.println("Hello \n" + name);
		}finally{
			//close the scanner
			input.close();
		}
	}

}
