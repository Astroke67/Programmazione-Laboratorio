class Bancomat{
  private String nome,cognome,id;
  private char operazione;
  private int saldo;
  private int soldiDepositati;
  private int soldiRitirati;
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

  Banca banca=new Banca();

  public int visualizzaSaldo(){
    saldo=banca.visualizzaSaldoBanca();
    return saldo;
  }

  public void depositaDenaro(int valore){
    this.soldiDepositati=valore;
    banca.depositaDenaroBanca(soldiDepositati);
  }
  public void ritiraDenaro(int valore){
    this.soldiRitirati=valore;
    banca.ritiraDenaroBanca(soldiRitirati);
  }
}
