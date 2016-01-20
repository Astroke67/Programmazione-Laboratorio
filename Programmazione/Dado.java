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

    int faccia[] =new int[6];
    int num;
    int dado;

    System.out.print("Quanti lanci vuoi fare?");
    num = in.nextInt();

    for (int i=0;i<num;i++) {
        dado=casuale.nextInt(6)+1;

        switch(dado){
          case 1:
            faccia[0] ++;
            break;
          case 2:
            faccia[1] ++;
            break;
          case 3:
            faccia[2] ++;
            break;
          case 4:
            faccia[3] ++;
            break;
          case 5:
            faccia[4] ++;
            break;
          case 6:
            faccia[5] ++;
            break;
        }

    }
    System.out.println("Faccia uno: " + faccia[0] + " volte - " + (faccia[0]*100/num)  + " % ");
    System.out.println("Faccia due: " + faccia[1] + " volte - " + (faccia[1]*100/num)  + " % ");
    System.out.println("Faccia tre: " + faccia[2] + " volte - " + (faccia[2]*100/num)  + " % ");
    System.out.println("Faccia quattro: " + faccia[3] + " volte - " + (faccia[3]*100/num)  + " % ");
    System.out.println("Faccia cinque: " + faccia[4] + " volte - " + (faccia[4]*100/num)  + " % ");
    System.out.println("Faccia sei: " + faccia[5] + " volte - " + (faccia[5]*100/num)  + " % ");
  }
}
