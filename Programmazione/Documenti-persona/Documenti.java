public class Documenti{

  private String nome;
  private String cognome;
  private String cod_fiscale;
  private String sesso;
  private String stringa;

  //COSTRUTTORE
  public Documenti(String n,String c,String cod){
    this.nome=n;
    this.cognome=c;
    this.cod_fiscale=cod;

  }

  //METODI
  public void setNome(){
    this.nome=nome;
  }

  public void setCognome(){

  }
  public void setCodFisc(){

  }

  public void maschio(){
    this.sesso="maschio";
  }

  public void femmina(){
    this.sesso="femmina";
  }

  public String stampa(){
    stringa = "Nome: " + nome + "\nCognome: "+cognome+"\nSesso:"+sesso+"\nCodice fiscale:"+cod_fiscale;
    return stringa;
  }

}
