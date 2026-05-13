import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.wipro.JavaBasics.methods.Addition;

public class TestAddition {

	
	@Test
	void testAdd()
	{
		 Addition obj=new Addition();
	   	int result= obj.add(3,5);
	   	assertEquals(8,result);
	   	 		
	}
	
	@Test
	void testSqaure()
	{
		

		 Addition obj=new Addition();
	   	int result= obj.square(5);
	   	assertEquals(25,result);
	   	 		
		
	}
	
	
}
