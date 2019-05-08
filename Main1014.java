import java.util.Locale;
import java.util.Scanner;

public class Main1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valorX;
		double valorY, valorXY;

		valorX = sc.nextInt();
		valorY = sc.nextDouble();
		valorXY = (double) valorX / valorY;

		System.out.printf("%.3f km/l%n", valorXY);

		sc.close();

	}

}