import java.util.Locale;
import java.util.Scanner;

public class Main1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorA = sc.nextDouble();
		double valorB = sc.nextDouble();
		double valorC = sc.nextDouble();
		double pi = 3.14159;
		double areaTR = ((valorA * valorC) / 2);
		double areaCR = pi * (Math.pow(valorC, 2));
		double areaT = ((valorA + valorB) * valorC) / 2;
		double areaQ = (Math.pow(valorB, 2));
		double areaR = valorA * valorB;

		System.out.printf("TRIANGULO: %.3f%n", areaTR);
		System.out.printf("CIRCULO: %.3f%n", areaCR);
		System.out.printf("TRAPEZIO: %.3f%n", areaT);
		System.out.printf("QUADRADO: %.3f%n", areaQ);
		System.out.printf("RETANGULO: %.3f%n", areaR);

		sc.close();

	}

}