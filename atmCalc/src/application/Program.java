/**
 * 
 */
package application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Gabriel Basic algorithm to calculate the quantity of notes
 *
 */
public class Program {

	public static void main(String[] args) throws IOException {
		// ------------------------------------------------------------------- >
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		// ------------------------------------------------------------------- >
		System.out.println(N);
		// ------------------------------------------------------------------- >
		sc.close();
	}

}
