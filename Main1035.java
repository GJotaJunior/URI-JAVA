import java.util.Scanner;

public class Main1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorA, valorB, valorC, valorD;

		valorA = sc.nextInt();
		valorB = sc.nextInt();
		valorC = sc.nextInt();
		valorD = sc.nextInt();

		int valorCD = valorC + valorD;
		int valorAB = valorA + valorB;

		if (valorB > valorC && valorD > valorA && valorCD > valorAB && valorC > 0 && valorD > 0 && (valorA % 2) == 0)
			System.out.println("Valores aceitos");
		else
			System.out.println("Valores nao aceitos");

		sc.close();

	}
}