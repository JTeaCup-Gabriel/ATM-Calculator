package application;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Gabriel Basic algorithm to calculate the quantity of notes
 */
public class Program {

	public static void main(String[] args) throws IOException {
		// ------------------------------------------------------------------- >
		Scanner sc = new Scanner(System.in);
		int N = 0, cem = 0, cinq = 0, vint = 0, dez = 0, cinc = 0, dois = 0, hum = 0;
		// ------------------------------------------------------------------- >
		N = sc.nextInt();
		System.out.println(N);
		// ------------------------------------------------------------------- >
		// ------------ >
		cem = N / 100;
		N %= 100;
		// ------------ >
		cinq = N / 50;
		N %= 50;
		// ------------ >
		vint = N / 20;
		N %= 20;
		// ------------ >
		dez = N / 10;
		N %= 10;
		// ------------ >
		cinc = N / 5;
		N %= 5;
		// ------------ >
		dois = N / 2;
		N %= 2;
		// ------------ >
		hum = N / 1;
		N %= 1;
		// ------------------------------------------------------------------- >
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinq + " nota(s) de R$ 50,00");
		System.out.println(vint + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinc + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(hum + " nota(s) de R$ 1,00");
		// ------------------------------------------------------------------- >
		sc.close();
	}

}
