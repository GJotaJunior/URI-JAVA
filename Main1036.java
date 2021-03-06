import java.util.Locale;
import java.util.Scanner;

public class Main1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorA = sc.nextDouble();
		double valorB = sc.nextDouble();
		double valorC = sc.nextDouble();

		double del = (Math.pow(valorB, 2)) - (4 * valorA * valorC);
		double x1 = (-valorB + Math.sqrt(del)) / (2 * valorA);
		double x2 = (-valorB - Math.sqrt(del)) / (2 * valorA);

		if (valorA <= 0 || del < 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f%n", x1);
			System.out.printf("R2 = %.5f%n", x2);
		}
		sc.close();

	}

}