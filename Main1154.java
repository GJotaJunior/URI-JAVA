import java.util.Locale;
import java.util.Scanner;

public class Main1154 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double idade = sc.nextDouble();
		double media = 0;
		double idade2 = 0;

		while (idade >= 0) {
			idade2 = idade2 + idade;
			idade = 0;
			media = media + 1;
			idade = sc.nextDouble();
		}
		System.out.printf("%.2f%n", (idade2 / media));

		sc.close();

	}

}