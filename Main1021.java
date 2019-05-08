import java.util.Locale;
import java.util.Scanner;

public class Main1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero = 100 * sc.nextDouble();
		System.out.println("NOTAS:");
		double nota100 = (int) numero / 10000;
		System.out.printf("%.0f nota(s) de R$ 100.00%n", nota100);
		double resto100 = (int) numero % 10000;
		double nota50 = (int) resto100 / 5000;
		System.out.printf("%.0f nota(s) de R$ 50.00%n", nota50);
		double resto50 = (int) resto100 % 5000;
		double nota20 = (int) resto50 / 2000;
		System.out.printf("%.0f nota(s) de R$ 20.00%n", nota20);
		double resto20 = (int) resto50 % 2000;
		double nota10 = (int) resto20 / 1000;
		System.out.printf("%.0f nota(s) de R$ 10.00%n", nota10);
		double resto10 = (int) resto20 % 1000;
		double nota5 = (int) resto10 / 500;
		System.out.printf("%.0f nota(s) de R$ 5.00%n", nota5);
		double resto5 = (int) resto10 % 500;
		double nota2 = (int) resto5 / 200;
		System.out.printf("%.0f nota(s) de R$ 2.00%n", nota2);
		double resto2 = (int) resto5 % 200;
		System.out.println("MOEDAS:");
		double moeda1 = (int) resto2 / 100;
		System.out.printf("%.0f moeda(s) de R$ 1.00%n", moeda1);
		double resto1 = (int) resto2 % 100;
		double moeda050 = (int) resto1 / 50;
		System.out.printf("%.0f moeda(s) de R$ 0.50%n", moeda050);
		double resto050 = (int) resto1 % 50;
		double moeda025 = (int) resto050 / 25;
		System.out.printf("%.0f moeda(s) de R$ 0.25%n", moeda025);
		double resto025 = (int) resto050 % 25;
		double moeda010 = (int) resto025 / 10;
		System.out.printf("%.0f moeda(s) de R$ 0.10%n", moeda010);
		double resto010 = (int) resto025 % 10;
		double moeda005 = (int) resto010 / 5;
		System.out.printf("%.0f moeda(s) de R$ 0.05%n", moeda005);
		double resto005 = (int) resto010 % 5;
		double moeda001 = (int) resto005 / 1;
		System.out.printf("%.0f moeda(s) de R$ 0.01%n", moeda001);

		sc.close();

	}

}