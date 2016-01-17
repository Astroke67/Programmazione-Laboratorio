package pFile;

import java.io.*;
import java.util.ArrayList;
public class OrdineAlfabeticoRAF {

	public static void main(String[] args)throws IOException,FileNotFoundException {
		
		InputStreamReader inserimento=new InputStreamReader(System.in);
		BufferedReader tastiera=new BufferedReader(inserimento);
		RandomAccessFile fileAlfabetico = new RandomAccessFile("C:\\Users\\computer\\Desktop\\FileOrdineAlfabetico\\fileProva.txt", "rw");
		
		String cognome;
		int scelta;
		int lunghezza=0;
		
		fileAlfabetico.seek(0);
		do{
			System.out.println("Vuoi inserire un altro cognome? Premi 1 per confermare");
			scelta=Integer.parseInt(tastiera.readLine());
			if(scelta==1){
			System.out.println("Inserisci un cognome ");
			cognome=tastiera.readLine();
			while(cognome.length()<10){
				cognome=cognome+"*";
			}
			fileAlfabetico.writeChars(cognome);
			lunghezza++;
			}//fine if	
		}while(scelta==1);

		ArrayList <String> cognomi=new ArrayList <String>();
		int lunghCella=10;
		String appo="";
		
		
		fileAlfabetico.seek(0);
		for(int i=0;i<lunghezza;i++){
			for(int j=0;j<lunghCella;j++){
				appo=appo+fileAlfabetico.readChar();
			}//fine for scrivi cognomi
			cognomi.add(appo);
			appo="";
		}//fine for numero cognomi
		
		System.out.println("Cognomi:\n"+cognomi);
		
		int confronto;
		String string1;
		String string2;
		String appoggio;
		boolean avvenuto=false;
	
		do{
			avvenuto=false;
		for(int i=0;i<cognomi.size()-1;i++){
		string1=cognomi.get(i);
		string2=cognomi.get(i+1);
		confronto=string1.compareTo(string2);
		if(confronto>0){
			appoggio=string1;
			cognomi.set(i,string2);
			cognomi.set(i+1,string1);
			avvenuto=true;
		}//fine if confronto 
		}//fine for
		}while(avvenuto==true);
		
		System.out.println("Cognomi ordinati: \n"+cognomi);
		
	}//fine main
}//fine programma
