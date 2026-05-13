package WiproProject2.WiproProject2;


public class Addition {
	public static void main(String[] args) {
		Addition obj = new Addition();
		int x = obj.add(4,8);
		int y = obj.add(4,9);
		
		System.out.println("addition :"+obj.add(x,y));
		System.out.println("square :" + obj.square(4));
		System.out.println("cube :" + obj.cube(4));
	}
	
	void display() {
		System.out.println("welcome");
	}
	
	int add(int x,int y) {
		return x+y;
	}
	

	int square(int x)
	{
		return x*x;
	}
	
	int cube(int x)
	{
		return x*x*x;
	}

	
	
	String getMessage()
	{
		return "welcome to java programming";
	}
}
