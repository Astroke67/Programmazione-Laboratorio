import java.io.*;
import java.util.*;

/*
Dopo aver inserito una stringa, visualizzare quante lettere maiuscole, quante minuscole, quanti numeri.
*/

public class Stringhe{
	public static void main (String [] args ){
		String frase;
		int lMai = 0, lMin = 0, num = 0, lung = 0;

		int i=0;
		char carattere;

		Scanner in = new Scanner(System.in);

		//inserire frase nella variabile
		System.out.println("Inserisci una frase: ");
		frase = in.nextLine();

		//conto lunghezza frase
		lung = frase.length();

		while(i<lung){			
			carattere = frase.charAt(i);

			if(Character.isUpperCase(carattere)){
				lMai=lMai+1;
			}else if(Character.isLowerCase(carattere)){
				lMin=lMin+1;
			}else if(carattere>47 && carattere<58){
				num=num+1;
			}

			i ++;
		}

		System.out.println("La frase: " + frase + " e' lunga " + lung +"caratteri");
		System.out.println("Sono presenti: \n" + lMin + "Lettere minuscole\n" + lMai + " lettere maiuscole\n" + num + " numeri." );
	}
}
