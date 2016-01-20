public class Robot{
	
	private int posX, posY;
	private int direzione;
	private boolean stato;
	
	private final int N = 0;
	private final int E = 1;
	private final int S = 2;
	private final int W = 3;
	
	public Robot(int x, int y){
		posX = x;
		posY = y;
		stato = false;
		direzione = N;
	}
	public Robot(int x, int y, boolean z){
		stato = z;
		stato = true;
		direzione = N;		
	}
	public void accendi(){
		this.stato = true;
	}
	public void spegni(){
		this.stato = false;
	}
	public void avanti(int dir){
	
	}
	public void aDestra(){
		if(stato){
			this.direzione = (direzione + 1)%4;
		}
	}
	public void aSinistra(){
		if(stato){
			this.direzione = (direzione + 3)%4;
		}
	}
	public String toString(){
		return "This is a Robot"; 
	}
}
