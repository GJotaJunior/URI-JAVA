import java.util.Scanner;

public class Main1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int combust = sc.nextInt();

		while ((combust >= 1 && combust < 4) || (combust > 4)) {
			combust = sc.nextInt();
			while (combust >= 1 && combust < 4) {
				if (combust == 1) {
					alcool = alcool + 1;
					combust = sc.nextInt();
				}
				if (combust == 2) {
					gasolina = gasolina + 1;
					combust = sc.nextInt();
				}
				if (combust == 3) {
					diesel = diesel + 1;
					combust = sc.nextInt();
				}
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}