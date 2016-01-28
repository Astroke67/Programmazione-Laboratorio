import java.io.*;
import java.util.*;

class Banca{
  private int soldi;
  private int saldo=0;
  private String no;
  private String codice;
  private File file;

  //COSTRUTTORE
  public Banca(String co){
    this.codice=co;

  }

  public int visualizzaSaldoBanca(File input){
    String stringa;
    try {
      PrintWriter writer = new PrintWriter(input);
      writer.print("");
      writer.close();
      BufferedWriter out = new BufferedWriter(new FileWriter(input, true));
      stringa=String.valueOf(saldo);
      out.write(stringa);
      out.close();
    } catch (IOException e) {
      System.out.println("ERRORE!" + e);
    }
    return saldo;

  }

  public void  depositaDenaroBanca(int deposito){
    this.soldi=deposito;
    String stringa=" ";
    saldo+=soldi;
  }

  public void  ritiraDenaroBanca(int prelievo,File file){

    this.soldi=prelievo;
    String stringa=" ";
    if((saldo-soldi)<0){
        System.out.println("IMPOSSIBILE COMPLETARE LA RICHIESTA:\nSALDO INSUFFICIENTE!");
    }else{
        saldo-=soldi;
    }
  }


  public void leggiFileBanca(File file,Scanner scanner,String nome,String cognome,String id){
      String stringa=" ";
      while(scanner.hasNextLine()){
          stringa=scanner.nextLine();
          int saldod=Integer.parseInt(stringa);
          this.saldo=saldod;
      }


  }
}
