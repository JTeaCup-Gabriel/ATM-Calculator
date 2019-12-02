/**
 * 
 */
package application;

import java.io.IOException;
import java.text.DecimalFormat;
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
		DecimalFormat dff = new DecimalFormat("0.00");
		int N = 0;
		int cem = 0, cinq = 0, vint = 0, dez = 0, cinc = 0, dois = 0, hum = 0;
		// ------------------------------------------------------------------- >
		N = sc.nextInt();
		// ------------------------------------------------------------------- >
		cem = N / 100;
		N %= 100;
		// ------------ >
		cinq = N / 50;
		N %= 50;

		// ------------------------------------------------------------------- >
		System.out.println(dff.format(N));
		// ------------------------------------------------------------------- >
		System.out.println(cem);
		System.out.println(cinq);
		System.out.println(vint);
		System.out.println(dez);
		System.out.println(cinc);
		System.out.println(dois);
		System.out.println(hum);
		sc.close();
	}

}
