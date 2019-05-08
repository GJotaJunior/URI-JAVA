import java.util.Locale;
import java.util.Scanner;

public class Main1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = sc.nextLine();
		double fixo = sc.nextDouble();
		double montante = sc.nextDouble();
		double total = fixo + (montante * 0.1500);
		System.out.printf("TOTAL = R$ %.2f%n", total);

		sc.close();
	}

}