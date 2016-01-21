import java.io.*;
import java.util.*;

class Persona{
  public static void main(String[] args){
    String nome,cognome,id;
    char scelta=' ';
    int soldi;
    Scanner in = new Scanner (System.in);

    System.out.println("Inserisci Nome: ");
    nome= in.nextLine();
    System.out.println("Inserisci Cognome: ");
    cognome= in.nextLine();
    System.out.println("Inserisci Codice Cliente: ");
    id= in.nextLine();

    Bancomat b= new Bancomat(nome,cognome,id);

    //System.out.println(b.stampa());
    while(scelta!='4'){

      System.out.println("\n\n\n**************\n     Menu\n**************");
      System.out.println("1) Visualizza saldo.");
      System.out.println("2) Deposita denaro.");
      System.out.println("3) Ritira denaro.");
      System.out.println("4) Esci");

      scelta=in.next().charAt(0);
      switch(scelta){
        case '1':
          //Visualizzare saldo.
          b.getOperazione(scelta);
          System.out.println("\n\nSaldo attuale: " + b.visualizzaSaldo()+" euro");
          break;
        case '2':
          //Depositare denaro
          System.out.println("Quanto vuoi depositare?");
          soldi=in.nextInt();
          b.depositaDenaro(soldi);
          b.getOperazione(scelta);
          System.out.println("\n\nSaldo attuale: " + b.visualizzaSaldo()+" euro");

          break;
        case '3':
          //Ritirare denaro
          System.out.println("Quanto vuoi ritirare?");
          soldi=in.nextInt();
          b.ritiraDenaro(soldi);
          b.getOperazione(scelta);
          System.out.println("\n\nSaldo attuale: " + b.visualizzaSaldo()+" euro");
          break;
        case '4':
          System.out.println(b.stampa());
          System.out.println("\n\nSaldo finale: " + b.visualizzaSaldo()+" euro");
          System.out.println("Arrivederci!");
          break;
        default:
          System.out.println("SCELTA NON VALIDA!");
          break;
      }
    }


  }

}
