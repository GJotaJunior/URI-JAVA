import java.util.Locale;
import java.util.Scanner;

public class Main1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valorA = sc.nextInt();
		int valorB = sc.nextInt();
		int valorC = sc.nextInt();
		int maiorAB = (valorA + valorB + (Math.abs(valorA - valorB))) / 2;
		int maiorBC = (valorB + valorC + (Math.abs(valorB - valorC))) / 2;
		int maiorTotal = (maiorAB + maiorBC + (Math.abs(maiorAB - maiorBC))) / 2;

		System.out.println(maiorTotal + " eh o maior");

		sc.close();

	}

}