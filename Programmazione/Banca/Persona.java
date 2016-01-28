import java.io.*;
import java.util.*;

class Persona{
  public static void main(String[] args) throws IOException{
    String nome,cognome,id,codseg;
    char scelta=' ';
    int soldi;
    Scanner in = new Scanner (System.in);



    System.out.println("Inserisci Nome: ");
    nome= in.nextLine();
    System.out.println("Inserisci Cognome: ");
    cognome= in.nextLine();
    System.out.println("Inserisci Codice Cliente: ");
    id= in.nextLine();
    System.out.println("Inserisci Codice Segreto (6 cifre): ");
    codseg= in.nextLine();

    File input = new File(id+codseg+".txt");
    Scanner inputFile = new Scanner(input);


    Bancomat b= new Bancomat(nome,cognome,id);

    b.leggiFile(input,inputFile,nome,cognome,id);


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
          System.out.println("\n\nSaldo attuale: " + b.visualizzaSaldo(input)+" euro");
          break;
        case '2':
          //Depositare denaro
          System.out.println("Quanto vuoi depositare?");
          soldi=in.nextInt();
          b.depositaDenaro(soldi);
          System.out.println("\n\nSaldo attuale: " + b.visualizzaSaldo(input)+" euro");

          break;
        case '3':
          //Ritirare denaro
          System.out.println("Quanto vuoi ritirare?");
          soldi=in.nextInt();
          b.ritiraDenaro(soldi,input);
          System.out.println("\n\nSaldo attuale: " + b.visualizzaSaldo(input)+" euro");
          break;
        case '4':
          System.out.println(b.stampa());
          System.out.println("\n\nSaldo finale: " + b.visualizzaSaldo(input)+" euro");
          System.out.println("Arrivederci!");

          break;
        default:
          System.out.println("SCELTA NON VALIDA!");
          break;
      }
    }


  }

}
