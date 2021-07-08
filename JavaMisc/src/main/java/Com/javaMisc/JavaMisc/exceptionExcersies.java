package Com.javaMisc.JavaMisc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class to practice with exception handling
 * 
 * @author zachary_moczygemba
 *
 */
public class exceptionExcersies {

	public static void main(String[] args) {
		exceptionExcersies test = new exceptionExcersies();
		test.fileOpener("fileNotThere2", "Text to place in file");
		test.numComputer();
	}

	/**
	 * method to practice File Not found exception
	 * 
	 * @param filename
	 * @param text
	 */
	public void fileOpener(String filename, String text) {
		try {
			FileReader fileReader = new FileReader(filename);

			int i;
			while ((i = fileReader.read()) != -1)
				System.out.print((char) i);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The file name does not exist");
		}

	}

	/*
	 * method for practicing handling exceptions by printing exception to the screen
	 */
	public void numComputer() {
		try {
			Scanner key = new Scanner(System.in);
			System.out.println("please enter a number or String to throw exception");
			int num1 = key.nextInt();
			System.out.println("please enter a number or String to throw exception");
			int num2 = key.nextInt();
			int divide = num1 / num2;
			System.out.println(divide);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	

}
