import java.util.Locale;
import java.util.Scanner;

public class Main1067 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valorX = sc.nextInt();

		for (int i = 1; i <= valorX; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}