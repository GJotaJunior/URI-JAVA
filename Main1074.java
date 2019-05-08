import java.util.Locale;
import java.util.Scanner;

public class Main1074 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valorN = sc.nextInt();

		for (int i = 0; i < valorN; i++) {
			int valorX = sc.nextInt();
			if (valorX > 0 && valorX % 2 == 0) {
				System.out.println("EVEN POSITIVE");
			} else if (valorX > 0 && valorX % 2 != 0) {
				System.out.println("ODD POSITIVE");
			} else if (valorX < 0 && valorX % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (valorX < 0 && valorX % 2 != 0) {
				System.out.println("ODD NEGATIVE");
			} else {
				System.out.println("NULL");
			}
		}

		sc.close();

	}

}