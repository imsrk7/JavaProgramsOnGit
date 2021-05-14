
public class Splender extends Bike2{
	int speedlimit1 = 60;
	
	void run2() {
		System.out.println("Second Run Method");
	}
	
	void run() {
		int speedlimit = 100;
		System.out.println("Speedlimit :" +speedlimit);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Splender b1 = new Splender();
		b1.run2();
		
		Bike2 b = new Splender();
		System.out.println("Speedlimit :" +b.speedlimit1);
		b.run();
		
	}

}
