import java.util.Locale;
import java.util.Scanner;

public class Main1072 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroN = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; i < numeroN; i++) {

			int outrosNumeros = sc.nextInt();

			if (outrosNumeros >= 10 && outrosNumeros <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}