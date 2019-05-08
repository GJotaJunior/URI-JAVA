import java.util.Locale;
import java.util.Scanner;

public class Main1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int peca1 = sc.nextInt();
		int num1 = sc.nextInt();
		double unit1 = sc.nextDouble();

		int peca2 = sc.nextInt();
		int num2 = sc.nextInt();
		double unit2 = sc.nextDouble();

		double aPagar = (num1 * unit1) + (num2 * unit2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", aPagar);

		sc.close();

	}

}