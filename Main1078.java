import java.util.Locale;
import java.util.Scanner;

public class Main1078 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();

		for (int i = 1; i < 11; i++) {
			int tabuada = valor * i;
			System.out.println(i + " x " + valor + " = " + tabuada);
		}

		sc.close();

	}

}