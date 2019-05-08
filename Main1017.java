import java.util.Locale;
import java.util.Scanner;

public class Main1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double tempo = sc.nextDouble();
		double vMedia = sc.nextDouble();

		double litrosTotal = tempo * (vMedia / 12);

		System.out.printf("%.3f%n", litrosTotal);

		sc.close();

	}

}