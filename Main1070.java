import java.util.Locale;
import java.util.Scanner;

public class Main1070 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valorX = sc.nextInt();

		if ((valorX % 2) != 0) {
			System.out.println(valorX + 2);
			System.out.println(valorX + 4);
			System.out.println(valorX + 6);
			System.out.println(valorX + 8);
			System.out.println(valorX + 10);
			System.out.println(valorX + 12);
		} else {
			System.out.println(valorX + 1);
			System.out.println(valorX + 3);
			System.out.println(valorX + 5);
			System.out.println(valorX + 7);
			System.out.println(valorX + 9);
			System.out.println(valorX + 11);

		}

		sc.close();
	}

}