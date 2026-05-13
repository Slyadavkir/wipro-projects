// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SwitchTest{
    public static void main(String[] args) {
       
     	Object obj3=10;
		
		switch(obj3)
		{
		case String s -> System.out.println("string: "+s);
		case Integer i -> System.out.println("Integer :"+i);
		case null -> System.out.println("null value");
		default -> System.out.println("unknown type");
		}
		
		
		
		
		Object obj4=new Person("Xyz",12);
		if(obj4 instanceof Person(String name,int age))
		{
			System.out.println(name+" - "+age);
		}
    }
}

record Person(String name,int age)
		{
			
		}