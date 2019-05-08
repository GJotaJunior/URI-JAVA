import java.util.Locale;
import java.util.Scanner;

public class Main1006 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorA = sc.nextDouble();
		double valorB = sc.nextDouble();
		double valorC = sc.nextDouble();
		double media = ((valorA * 2) + (valorB * 3) + (valorC * 5)) / 10;

		System.out.printf("MEDIA = %.1f%n", media);

		sc.close();

	}

}