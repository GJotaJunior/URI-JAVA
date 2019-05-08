import java.util.Locale;
import java.util.Scanner;

public class Main1159 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valorX = sc.nextInt();

		while (valorX != 0) {
			if (valorX % 2 != 0) {
				valorX = valorX + 1;
			}
			int soma = valorX + (valorX + 2) + (valorX + 4) + (valorX + 6) + (valorX + 8);
			System.out.println(soma);
			valorX = sc.nextInt();
		}

		sc.close();

	}

}