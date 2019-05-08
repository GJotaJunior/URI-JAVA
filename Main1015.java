import java.util.Locale;
import java.util.Scanner;

public class Main1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double px1, py1, px2, py2, resol, distan;

		px1 = sc.nextDouble();
		py1 = sc.nextDouble();
		px2 = sc.nextDouble();
		py2 = sc.nextDouble();

		resol = ((px2 - px1) * (px2 - px1)) + ((py2 - py1) * (py2 - py1));

		distan = Math.sqrt(resol);

		System.out.printf("%.4f%n", distan);

		sc.close();

	}

}