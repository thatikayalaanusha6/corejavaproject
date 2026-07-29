
public class Addition {

	int a=10;
	int b=20;
	
	void disp() {
		
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {


	System.out.println("main method started");
	Addition ad = new Addition();
	ad.disp();
	
System.out.println("main method ended");
	}

}
