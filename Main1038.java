import java.util.Locale;
import java.util.Scanner;

public class Main1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double total;

		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {
			total = quantidade * 4;
		} else if (codigo == 2) {
			total = quantidade * 4.5;
		} else if (codigo == 3) {
			total = quantidade * 5;
		} else if (codigo == 4) {
			total = quantidade * 2;
		} else if (codigo == 5) {
			total = quantidade * 1.5;
		} else {
			total = quantidade * 0;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();

	}

}