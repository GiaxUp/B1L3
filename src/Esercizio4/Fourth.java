package Esercizio4;
import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci un numero intero: ");
		int numero = input.nextInt();

		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
