import java.io.*;
import java.util.*;

class Persona{
  public static void main(String[] args){

    String nome=" ", cognome=" ",cod_fiscale=" ";

    char sesso;

    Scanner in= new Scanner(System.in);
    System.out.println("Inserisci nome: ");
    nome = in.nextLine();
    System.out.println("Inserisci cognome: ");
    cognome=in.nextLine();
    System.out.println("Inserisce codice fiscali: ");
    cod_fiscale=in.nextLine();

    Documenti d= new Documenti(nome,cognome,cod_fiscale);

    System.out.println("Sei maschio o femmina? m - f");
    sesso=in.next().charAt(0);


    if(sesso=='m'||sesso=='M'){
      d.maschio();
    }else if(sesso=='f'||sesso=='F'){
      d.femmina();
    }else{
      System.out.println("Scelta non valida!");
    }

    System.out.println(d.stampa());
  }
}
