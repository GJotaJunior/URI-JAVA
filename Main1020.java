import java.util.Locale;
import java.util.Scanner;

public class Main1020 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int pessoa = sc.nextInt();

		int anos = pessoa / 365;
		int rAnos = pessoa % 365;
		int meses = rAnos / 30;
		int rMeses = rAnos % 30;

		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(rMeses + " dia(s)");

		sc.close();

	}

}