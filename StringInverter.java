import java.io.*;
import java.util.*; 

/* Il programma prende una stringa inserita tramite Scanner dall'utente e 
la visualizza al contrario ribaltando lettere per lettera */

class StringInverter {
	public static void main (String [] args) throws IOException {

		Scanner in = new Scanner(System.in);
 
		int lunga = 0; 
		char frase2; 

		System.out.println("Inserisci la frase da visualizzare al contrario:");
		String frase = in.nextLine();
		lunga = frase.length();
		System.out.println("La frase è lunga " + lunga + " caratteri! \n"); 

		for (int i = lunga - 1; i >= 0; i--) {
			frase2 = frase.charAt(i);
			System.out.print(frase2);
		} 
		System.out.println("\n");
	}
}
