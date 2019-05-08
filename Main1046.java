import java.util.Locale;
import java.util.Scanner;

public class Main1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int hInicial, hFinal, duracao;

		hInicial = sc.nextInt();
		hFinal = sc.nextInt();

		if (hInicial < hFinal) {
			duracao = hFinal - hInicial;
		} else {
			duracao = 24 - hInicial + hFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();

	}

}