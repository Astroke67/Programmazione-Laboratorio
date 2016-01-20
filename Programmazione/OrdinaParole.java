import java.io.*;
import java.util.*;

/*
Esercizio:Parole ordinate
Specifica:
Scrivere un programma che inserisce man mano parole in un ArrayList
in modo che siano sempre in ordine alfabetico. Il programma legge
le parole ridirigendo l'input da un file (java Programma < file).
La parola "quit" indica dove terminare la lettura. Dopo ogni inserimento
il programma stampa il contenuto dell'ArrayList.
*/
class OrdinaParole{
  public static void main (String args[]) throws IOException{

    ArrayList <String> parole = new ArrayList <String> ();

    BufferedReader br = new BufferedReader(new FileReader("parole.txt"));
    StringBuilder sb = new StringBuilder();
    String line = br.readLine();

    while (!line.equals("quit")) {
      parole.add(line);
      line = br.readLine();
    }
  }
}
