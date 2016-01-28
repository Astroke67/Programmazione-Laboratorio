import java.io.*;
import java.util.*;

class Bancomat{
  private String nome,cognome,id;
  private int saldo;
  private int soldiDepositati;
  private int soldiRitirati;
  private File file;
  //COSTRUTTORE
  public Bancomat(String n,String c,String cod){
    this.nome=n;
    this.cognome=c;
    this.id=cod;
  }


  public String stampa(){
    String stringa;
    stringa="\nNome: "+ nome +"\nCognome: "+cognome+"\nCodice cliente: "+id;
    return stringa;
  }


  Banca banca=new Banca(id);

  public int visualizzaSaldo(File filein){
    this.file=filein;
    saldo=banca.visualizzaSaldoBanca(file);
    return saldo;
  }

  public void depositaDenaro(int valore){
    this.soldiDepositati=valore;
    banca.depositaDenaroBanca(soldiDepositati);
  }
  public void ritiraDenaro(int valore,File file){
    this.soldiRitirati=valore;
    banca.ritiraDenaroBanca(soldiRitirati,file);
  }

  public void leggiFile(File file,Scanner scanner,String nome, String cognome,String id){
    banca.leggiFileBanca(file,scanner,nome,cognome,id);
  }


}
