import java.io.*;
import java.util.*;

/*
Esercizio: menu
Testo:
Scrivere un programma che implementi un menu con le seguenti opzioni:

a) Inserire una nuova figura
b) Calcolare l'area della figura corrente
c) Esaminare la figura corrente
e) Uscire dal programma

L'utente sceglie un'opzione digitando il carattere corrispondente.
Se l'utente sceglie una fra le opzioni a - c, il programma visualizza
un messaggio opportuno, ad esempio per l'opzione a.:

Sara` possibile inserire una nuova figura

e poi ripresenta il menu all'utente. Se l'utente sceglie l'opzione e,
il programma termina dopo aver visualizzato un messaggio di saluti.
Se l'utente digita un carattere non presente nel menu, il programma
visualizza un messaggio appropriato, ripresenta il menu, e prosegue.

se l'utente sceglie l'opzione a)
il programma presenta un sottomenu dal quale l'utente sceglie se inserire

c) un cerchio,
q) un quadrato o
r) un rettangolo,
m) oppure se tornare al menu principale.

Nel primo caso, il programma chiede all'utente di inserire il raggio del
cerchio; nel secondo, di inserire il lato del quadrato; nel terzo, di inserire
la base e l'altezza del rettangolo.
*/

class Geometria{

  static float pigreco= 3.14f;

  public static void main (String [] args){
    char scelta;
    char sceltac=' ';//condizione per continuare a far apparire il menu
    char sceltaf=' '; //scelta sotto-menu figura

    float area = 0;
    float raggio=0;
    float lato=0;
    float altezza=0;
    float base=0;

    Scanner in = new Scanner(System.in);
    System.out.println("Benvenuto, cosa vuoi fare?");

    while(sceltac!='x'){

      System.out.println("a - Inserire una nuova figura");
      System.out.println("b - Calcolare l'area della figura corrente");
      System.out.println("c - Esaminare la figura corrente");
      System.out.println("e - Uscire dal programma");

      scelta = in. next().charAt(0);

      switch(scelta){
        case 'a':
          System.out.println("Quale figura vuoi inserire?\n");
          System.out.println("a - cerchio");
          System.out.println("b - quadrato");
          System.out.println("c - rettangolo");
          System.out.println("e - Torna al menu principale");
          sceltaf = in. next().charAt(0);

          switch(sceltaf){
            case 'a':
              System.out.println("***CERCHIO***");
              System.out.println("Inserisci raggio: ");
              raggio = in.nextFloat();
              area= raggio*raggio*pigreco;
              break;

            case 'b':
              System.out.println("***QUADRATO***");
              System.out.println("Inserisci lato: ");
              lato = in.nextFloat();
              area= lato*lato;
              break;

            case 'c':
              System.out.println("***RETTANGOLO***");
              System.out.println("Inserisci base: ");
              base = in.nextFloat();
              System.out.println("Inserisci altezza: ");
              altezza = in.nextFloat();
              area= base*altezza;
              break;

            default:
              System.out.println("Scelta non valida!");
              break;


          }

          break;
        case 'b':
          System.out.println("\nL'area della figura e'"+ area + "\n");
          break;

        case 'c':
          if(sceltaf=='a'){
            System.out.println("Raggio = " + raggio);
          }else if (sceltaf=='b'){
            System.out.println("Lato = " + lato);
          }else if (sceltaf=='c'){
            System.out.println("Base = "+base+" Altezza: "+altezza);
          }else{
            System.out.println("Dati non disponibili.");
          }

          break;

        case 'e':
          System.out.println("\nArrivederci!");
          sceltac='x';
          break;

        default:
          System.out.println("\nScelta non valida!\n");
          break;
      }
    }
  }
}
