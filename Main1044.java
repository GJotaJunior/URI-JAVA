import java.util.Locale;
import java.util.Scanner;

public class Main1044 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valorA, valorB;
		valorA = sc.nextInt();
		valorB = sc.nextInt();

		if (valorA % valorB == 0 || valorB % valorA == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();
	}
}