import java.io.*;
import java.util.*;

/*
Esercizio:Dado
Specifica:
Scrivere un programma che analizza l'equita` di un dado contando la
frequenza di apparizione dei suoi valori (1, 2, 3, 4, 5, 6). Il
programma chiede all'utente quanti lanci fare. La sequenza dei lanci
deve essere generata utilizzando la classe Random.*/

class Dado{
  public static void main (String [] args ){
    Scanner in = new Scanner(System.in);

    Random casuale = new Random();

    int uno=0,due=0,tre=0,quattro=0,cinque=0,sei=0;
    int num;
    int dado;

    System.out.print("Quanti lanci vuoi fare?");
    num = in.nextInt();


    for (int i=0;i<num;i++) {
        dado=casuale.nextInt(6)+1;
        switch(dado){
          case 1:
            uno++;
            break;
          case 2:
            due++;
            break;
          case 3:
            tre++;
            break;
          case 4:
            quattro++;
            break;
          case 5:
            cinque++;
            break;
          case 6:
            sei++;
            break;
        }

    }
    System.out.println("Faccia uno: " + uno + " volte");
    System.out.println("Faccia due: " + due + " volte");
    System.out.println("Faccia tre: " + tre + " volte");
    System.out.println("Faccia quattro: " + quattro + " volte");
    System.out.println("Faccia cinque: " + cinque + " volte");
    System.out.println("Faccia sei: " + sei + " volte");
  }
}
