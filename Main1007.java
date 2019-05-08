import java.util.Scanner;

public class Main1007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dif;

		dif = sc.nextInt() * sc.nextInt() - sc.nextInt() * sc.nextInt();

		System.out.println("DIFERENCA = " + dif + "");

		sc.close();
	}
}