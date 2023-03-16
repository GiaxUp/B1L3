package Esercizio1;

public class First {

	public static boolean stringaPariDispari(String str) {
		return str.length() % 2 == 0;
	}

	public static boolean annoBisestile(int anno) {
		return anno % 4 == 0;
	}

	public static void main(String[] args) {
		String str1 = "ciao";
		String str2 = "hello";
		int anno1 = 2020;
		int anno2 = 2021;

		System.out.println("La stringa '" + str1 + "' ha una lunghezza pari? " + stringaPariDispari(str1));
		System.out.println("La stringa '" + str2 + "' ha una lunghezza pari? " + stringaPariDispari(str2));
		System.out.println("L'anno " + anno1 + " è bisestile? " + annoBisestile(anno1));
		System.out.println("L'anno " + anno2 + " è bisestile? " + annoBisestile(anno2));
	}
}
