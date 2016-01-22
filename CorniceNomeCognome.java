import java.io.*;
import java.util.*;

class CorniceNomeCognome{

	public static void main (String [] args){
	
	Scanner in = new Scanner (System.in);
	
	String asterischi, spazi, nome, cognome;
	int lungn;
	int lungc;
	
	System.out.println ("Inserisci il nome: ");
	nome = in.nextLine();
	lungn = nome.length();
	System.out.println ("Inserisci il cognome: ");
	cognome = in.nextLine();
	lungc = cognome.length();
	
	asterischi = "********************" + "********************" + "********************" + "********************";
	spazi = "                    " + "                    " + "                    " + "                    ";
	

	
	System.out.println (asterischi.substring(0, lungn + lungc + 6));
	System.out.println ("*" + spazi.substring(0, lungn + lungc + 4) + "*");
	System.out.println ("*  " + nome + " " + cognome + "  *");
	System.out.println ("*" + spazi.substring(0, lungn + lungc + 4) + "*");
	System.out.println (asterischi.substring(0, lungn + lungc + 6));
	}
}
