import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		ArrayList<Currency> classList = new ArrayList<>();
		setup(classList);
	}
	
	public static void setup(ArrayList<Currency> classList) {
	   // eventually I want the program to read a file with really basic data.
	   // data example in a file: "US Dollar,1.00"
	   // each line would have that data for each currency.
	   classList.add(new Currency("US Dollar", 1.00));
	   classList.add(new Currency("Euro", 0.808407));
	   classList.add(new Currency("British Pound", 0.735918));
	   classList.add(new Currency("Indian Rupee", 75.094991));
	   classList.add(new Currency("Australian Dollar", 1.388115));
	   classList.add(new Currency("Canadian Dollar", 1.268464));
	   classList.add(new Currency("Singapore Dollar", 1.342711));
	   classList.add(new Currency("Swiss Franc", 0.921730	));
	   classList.add(new Currency("Malaysian Ringgit", 4.185310));
	   classList.add(new Currency("Japanese Yen", 115.426867));
	   classList.add(new Currency("Chinese Yuan Renminbi", 6.337215));
	}
}
