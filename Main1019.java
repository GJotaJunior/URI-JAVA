import java.util.Locale;
import java.util.Scanner;

public class Main1019 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int xSeg = sc.nextInt();

		int horas = xSeg / 3600;
		int restant = xSeg % 3600;

		int minutos = restant / 60;
		int segundos = restant % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();

	}

}