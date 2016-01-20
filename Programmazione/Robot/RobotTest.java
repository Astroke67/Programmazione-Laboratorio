public class RobotTest{
	public static void main(String[] args){
		Robot r = new Robot(0,0);
		r.accendi();
		r.aSinistra();
		r.avanti(5);
		r.spegni();
		System.out.println(r.toString());
	}
}
