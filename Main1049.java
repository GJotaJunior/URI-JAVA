import java.util.Scanner;

public class Main1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String c1 = sc.next();

		if (c1.equals("vertebrado")) {
			String c2 = sc.next();
			if (c2.equals("ave")) {
				String c3 = sc.next();
				if (c3.equals("carnivoro")) {
					System.out.println("aguia");
				} else if (c3.equals("onivoro")) {
					System.out.println("pomba");
				}
			} else if (c2.equals("mamifero")) {
				String c3 = sc.next();
				if (c3.equals("onivoro")) {
					System.out.println("homem");
				} else if (c3.equals("herbivoro")) {
					System.out.println("vaca");
				}
			}
		} else if (c1.equals("invertebrado")) {
			String c2 = sc.next();
			if (c2.equals("inseto")) {
				String c3 = sc.next();
				if (c3.equals("hematofago")) {
					System.out.println("pulga");
				} else if (c3.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			} else if (c2.equals("anelideo")) {
				String c3 = sc.next();
				if (c3.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else if (c3.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}

		sc.close();
	}

}