import java.io.*;
import java.util.*;

class CalcolatriceClassi{

	public static void main (String [] args) {

		Scanner in = new Scanner(System.in);

		float num = 0;
		char scelta = ' ';
		float n1 = 0, n2 = 0;

		System.out.println("CALCOLATRICE: \n");
		System.out.println("Quale operazione vuoi eseguire?");
		System.out.println("a) Somma");
		System.out.println("b) Sottrazione");
		System.out.println("c) Divisione");
		System.out.println("d) Moltiplicazione");
		System.out.println("e) ESCI");
		scelta = in.next().charAt(0);

		System.out.println("Inserisci il primo numero: ");
		n1 = in.nextFloat();
		System.out.println("Inserisci il secondo numero: ");
		n2 = in.nextFloat();

		switch(scelta){

			case 'a':
				System.out.println("Stai eseguendo SOMMA: ");
				float somma = 0;
				somma = Calcoli.doSomma(n1, n2);
				System.out.println("La somma tra i due numeri risulta: " + somma);
			break;

			case 'b':
				System.out.println("Stai eseguendo SOTTRAZIONE:");
				float sottrazione = 0;
				sottrazione = Calcoli.doSottrazione(n1, n2);
				System.out.println("La sottrazione tra i due numeri risulta: " + sottrazione);
			break;

			case 'c':
				System.out.println("Stai eseguendo DIVISIONE:");
				float divisione = 0;
				divisione = Calcoli.doDivisione(n1, n2);
				System.out.println("La divisione tra i due numeri risulta: " + divisione);
			break;

			case 'd':
				System.out.println("Stai eseguendo MOLTIPLICAZIONE:");
				float moltiplicazione = 0;
				moltiplicazione = Calcoli.doMoltiplicazione(n1, n2);
				System.out.println("La moltiplicazione tra i due numeri risulta: " + moltiplicazione);
			break;

			case 'e':
				System.out.println("Il programa termina. Arrivederci!");
			break;

			default:
				System.out.println("Scelta non valida!");
			break;
		}

	}
}
