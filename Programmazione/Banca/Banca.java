class Banca{
  private char operazione;
  private int soldi;
  private int saldo=1000;
  //COSTRUTTORE
  public Banca(char op){
    this.operazione=op;
  }

  public int visualizzaSaldoBanca(){
    return saldo;
  }

  public void  depositaDenaroBanca(int deposito){
    this.soldi=deposito;
    saldo+=soldi;
  }
  public void  ritiraDenaroBanca(int prelievo){
    this.soldi=prelievo;
    saldo-=soldi;
  }

}
