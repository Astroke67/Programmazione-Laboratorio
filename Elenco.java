import java.io.*;
import java.util.*;

/*
Elenco numeri telefonici array.
*/

public class Elenco{
	public static void main (String [] args ){
			
			Scanner in = new Scanner(System.in);
			int grandezza=10;
			String [] numeri;
			numeri = new String[grandezza];
			String numero;
			int i=0;
			char scelta = ' '; //inizializzo char

		do{	

			System.out.println("Vuoi inserire o visualizzare i numeri? i - v ");
			scelta=in.next().charAt(0);
			
			if(scelta=='i' || scelta=='I' ){
				
				numeri[i] = in.nextLine();//per risolvere problema ciclo for (non permetteva di inserire nessun dato durante il primo ciclo)

				for(i=0;i<grandezza;i++){
					System.out.print("\nInserisci il " + i + " numero di telefono: ");
					numeri[i] = in.nextLine();
				
				}

			}else if(scelta=='v' || scelta=='v' ){
				for(i=0;i<grandezza;i++){
					System.out.println("Numero = " + numeri[i]);
				}
			}else{
				System.out.println("Scelta non valida!");	
			}

			System.out.println("Vuoi fare altro? S - N ");
			scelta=in.next().charAt(0);
			if(scelta=='n' || scelta=='N'){
				break;
			}

		}while(true);

	}
}
