

public class SealedClass {

	public static void main(String[] args) {
		
		  Shapes s1 = new Circle();
		    Shapes s2 = new Rectangle();

		    s1.area();
		    s2.area();

	}

}


sealed abstract class Shapes permits Circle,Rectangle
{
	public abstract void area();
}


// A sealed class is a class that restricts inheritance to a fixed set of classes.


final class Circle extends Shapes
{

	@Override
	public void area() {
	System.out.println(3.14*2.4*2.4);
		
	}
	
}

final class Rectangle extends Shapes
{

	@Override
	public void area() {
		System.out.println(3*6);
		
	}
	
}


