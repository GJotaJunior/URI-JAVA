import java.util.Locale;
import java.util.Scanner;

public class Main1050 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int ddd = sc.nextInt();
		if (ddd == 61 || ddd == 71 || ddd == 11 || ddd == 21 || ddd == 32 || ddd == 19 || ddd == 27 || ddd == 31) {
			if (ddd == 61)
				System.out.println("Brasilia");
			if (ddd == 71)
				System.out.println("Salvador");
			if (ddd == 11)
				System.out.println("Sao Paulo");
			if (ddd == 21)
				System.out.println("Rio de Janeiro");
			if (ddd == 32)
				System.out.println("Juiz de Fora");
			if (ddd == 19)
				System.out.println("Campinas");
			if (ddd == 27)
				System.out.println("Vitoria");
			if (ddd == 31)
				System.out.println("Belo Horizonte");
		} else
			System.out.println("DDD nao cadastrado");

		sc.close();

	}

}