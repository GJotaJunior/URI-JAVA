import java.util.Locale;
import java.util.Scanner;

public class Main1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidade = sc.nextInt();

		for (int i = 0; i < quantidade; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double resultado = (double) x / y;
				System.out.printf("%.1f%n", resultado);
			}
		}

		sc.close();

	}

}