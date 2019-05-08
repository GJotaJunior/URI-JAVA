import java.util.Locale;
import java.util.Scanner;

public class Main1047 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int hI = 60 * sc.nextInt();
		int mI = sc.nextInt();
		int hF = 60 * sc.nextInt();
		int mF = sc.nextInt();
		int mIT = hI + mI;
		int mFT = hF + mF;
		int duracao;

		if (mIT < mFT) {
			duracao = mFT - mIT;
		} else {
			duracao = (60 * 24 - mIT) + mFT;
		}

		int duracaoH = duracao / 60;
		int duracaoM = duracao % 60;

		System.out.println("O JOGO DUROU " + duracaoH + " HORA(S) E " + duracaoM + " MINUTO(S)");

		sc.close();

	}

}