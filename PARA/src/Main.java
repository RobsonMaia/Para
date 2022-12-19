import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c1, c2;

		System.out.print("conte de: ");
		c1 = sc.nextInt();
		System.out.print("Até: ");
		c2 = sc.nextInt();
		System.out.println("   ");
		if (c1 < c2) {
			for (int cont = c1; cont <= c2; cont++) {
				System.out.println(cont);
			}
		}
		if (c1 > c2) {
			for (int cont = c1; cont >= c2; cont--) {
				System.out.println(cont);
			}
		}
		System.out.println("   ");
		System.out.println("PRONTO");

		sc.close();
	}

}