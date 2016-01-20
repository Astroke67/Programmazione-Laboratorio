import java.io.*;
import java.util.*;

class LeggiFile{

  public static String riga;

/*legge dal file nomeFile una riga alla volta e
  la stampa (la visualizza sul terminale).*/
  static void leggiRighe(File inFile,Scanner in){
    while(in.hasNextLine()){
      riga=in.nextLine();
      System.out.println(riga);
    }
  }

/*legge dal file nomeFile una stringa alla volta e la stampa.*/
  static void leggiParole(File inFile,Scanner in){
    while(in.hasNext()){
      riga=in.next();
      System.out.println(riga);
    }
  }

/*legge dal file nomeFile un numero alla volta, ne calcola la somma
e la stampa.*/
  static void leggiNumeri(File inFile,Scanner in){
    int n=0;
    int somma=0;
    while(in.hasNextInt()){
      n=in.nextInt();
      somma=somma+n;
    }
    System.out.println(somma);
  }
/*estrae dal file nomeFile stringhe separate da '-' e le stampa.*/
  static void estraiParole(File inFile,Scanner in){

    while(in.hasNext()){
      riga=in.next();
      riga=riga.replaceAll("-", " ");
      System.out.println(riga);
    }
  }

  public static void main(String[] args) throws IOException {
    char scelta =' ';
    Scanner input = new Scanner(System.in);

    File inFile = new File("righe.txt");
    Scanner in = new Scanner(inFile);

    System.out.println("Cosa vuoi fare?");
    System.out.println("r) Leggi Righe.");
    System.out.println("p) Leggi Parole.");
    System.out.println("n) Leggi Numeri.");
    System.out.println("e) Estrai Parole.");
    System.out.println("u) ESCI.\n");
    scelta=input.next().charAt(0);


    switch(scelta){
        case 'r':
          inFile = new File("righe.txt");
          in = new Scanner(inFile);
          leggiRighe(inFile,in);
          break;
        case 'p':
          inFile = new File ("parole.txt");
          in = new Scanner(inFile);
          leggiParole(inFile,in);
          break;
        case 'n':
          inFile = new File ("numeri.txt");
          in = new Scanner(inFile);
          leggiNumeri(inFile,in);
          break;
        case 'e':
          inFile = new File ("testo.txt");
          in = new Scanner(inFile);
          estraiParole(inFile,in);
          break;
        case 'u':
            System.out.println("\n ARRIVEDERCI \n");
          break;
    }
  }
}
