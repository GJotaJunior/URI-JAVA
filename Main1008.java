import java.util.Scanner;

public class Main1008 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		double hors = sc.nextDouble();
		double salario = sc.nextDouble();
		double total = hors * salario;

		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f\n", total);

		sc.close();

	}

}