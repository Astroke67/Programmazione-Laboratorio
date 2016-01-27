import java.io.*;
import java.util.*;
/*Scrivere un programma che analizza l'equita` di un dado contando la 
frequenza di apparizione dei suoi valori (1, 2, 3, 4, 5, 6). Il 
programma chiede all'utente quanti lanci fare. La sequenza dei lanci 
deve essere generata utilizzando la classe Random.*/

public class Dado2{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int l;
        int uno=0;
        int due=0;
        int tre=0;
        int quattro=0;
        int cinque=0;
        int sei=0;
        int lanci;
        Random casuale = new Random();
        System.out.println("Quanti lanci vuoi fare?");
        lanci=in.nextInt();
        
        for (int i=0;i<lanci; i++){
            l=casuale.nextInt(6)+1;
            if (l==1){
                uno++;
            } else if (l==2){
                due++;
            } else if (l==3){
                tre++;
            } else if (l==4){
                quattro++;
            } else if (l==5){
                cinque++;
            } else if (l==6){
                sei++;
            }
        }
        System.out.println("uno è uscito "+uno+" volte");
        System.out.println("due è uscito "+due+" volte");
        System.out.println("tre è uscito "+tre+" volte");
        System.out.println("quattro è uscito "+quattro+" volte");
        System.out.println("cinque è uscito "+cinque+" volte");
        System.out.println("sei è uscito "+sei+" volte");
    }
}  
