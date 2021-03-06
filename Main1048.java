import java.util.Locale;
import java.util.Scanner;

public class Main1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		if (salario <= 400) {
			double reajuste = salario * 0.15;
			double aumento = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", aumento);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");
		} else if (salario >= 400.01 && salario <= 800) {
			double reajuste = salario * 0.12;
			double aumento = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", aumento);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
		} else if (salario >= 800.01 && salario <= 1200) {
			double reajuste = salario * 0.10;
			double aumento = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", aumento);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
		} else if (salario >= 1200.01 && salario <= 2000) {
			double reajuste = salario * 0.07;
			double aumento = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", aumento);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		} else {
			double reajuste = salario * 0.04;
			double aumento = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", aumento);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");
		}

		sc.close();

	}

}