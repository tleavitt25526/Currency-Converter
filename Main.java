import java.io.*;
import java.util.*;

public class Main
{
    // main method
	public static void main(String[] args) {
	    // set up a list full of the Currency class
		ArrayList<Currency> classList = new ArrayList<>();
		setup(classList, "currencyFile.txt");
		//printFile("currencyFile.txt");
		
		// loop until input ends asking user for conversions
		Scanner scan = new Scanner(System.in);
		while (true) {
		    String input = scan.nextLine();
		    System.out.println(input);
		}
	}
	
	// method to convert US dollars to a given currencyFile
	public static double convert(String currencyName, ArrayList<Currency> classList, int amount) {
	    // find the right class in the class list
	    for (int i = 0; i < classList.size(); i++) {
	        if (classList.get(i).getName() == currencyName) {
	            // convert based on the given amount and exchange
	            return classList.get(i).convert(amount);
	        }
	    }
	    System.out.println("Invalid currencyName, classList, or amount");
	    return amount;
	}
	
	// method to read a given file and print each line in the console
	public static void printFile(String fileName) {
	    // try opening the file and reading it
	    try {
	        File textFile = new File(fileName);
	        Scanner scan = new Scanner(textFile);
	        // loop through the lines of file
	        while (scan.hasNextLine()) {
	            // print each line
	            System.out.println(scan.nextLine());
	        }
	    } catch (FileNotFoundException e) {
	        // if the file name was not found
	        System.out.println("Invalid File.");
	    }
	}
	
	// method to read a given file and fill a given class list
	public static void setup(ArrayList<Currency> classList, String fileName) {
	    // try opening file and reading it
	   try {
    	   File textFile = new File(fileName);
    	   Scanner scan = new Scanner(textFile);
    	   // loop through lines of file
    	   while (scan.hasNextLine()) {
    	       // seperate lines into name and exhange and add them as a class into the class list
    	       String line = scan.nextLine();
    	       String[] data = line.split(",");
    	       classList.add(new Currency(data[0], Double.parseDouble(data[1]) ));
    	   }
	   } catch (FileNotFoundException e) {
	       // if the file name was not found
	       System.out.println("Invalid File.");
	   }
	}
	
}
