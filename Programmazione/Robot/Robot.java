public class Robot{
	
	private int posX, posY;
	private int direzione, passi;
	private boolean stato;
	private String stato2;
	private String finale;
	char[] direzioni = {'N', 'E', 'S', 'W'};
	
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
		posX = x;
		posY = y;
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
	public void avanti(int passi){
		if(stato){
			switch(direzione){
				case N:
					this.posY += passi;
					break;
				case S:
					this.posY -= passi;
					break;
				case E:
					this.posX += passi;
					break;
				case W:
					this.posX -= passi;
					break;
			}
		}
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
		
		if(stato){
			stato2 = "ON";
		}else{
			stato2 = "OFF";
		}
		finale = "This is a Robot(" + stato2 + ") facing " + direzioni[direzione] + " in position (" + posX + "," + posY + ").";
		return finale;
	}
}
