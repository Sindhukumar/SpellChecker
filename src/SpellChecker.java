import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpellChecker {

	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Check check = new Check();
		//check.displayDict();
		while(true){
			System.out.println("Enter a word or phrase");
			boolean hasError = check.checking(sc.nextLine());
			if(!hasError){
				System.out.println("No error found");
			}
			System.out.println("do you want to see most miss-spelled word? (Yes/No)");
			if(sc.nextLine().equalsIgnoreCase("Yes")){
				check.displayMostMiss();
			}
			System.out.println("More to check? (Yes/No)");
			if(!sc.nextLine().equalsIgnoreCase("Yes")){
				break;
			}
		}
	}
}
