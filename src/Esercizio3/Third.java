package Esercizio3;
import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			String inputString = "";

			while (!inputString.equals(":q")) {
				System.out.print("Inserisci una stringa (:q per uscire): ");
				inputString = input.nextLine();

				if (!inputString.equals(":q")) {
					String[] caratteri = inputString.split("");
					System.out.println(String.join(",", caratteri));
				}
			}
		}
	}
}
