import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;


public class A3Part1ImplementationTest {
	
	//create implementation object
	A3Part1Implementation obj;
	
	//create the variables
	int amount ;
	
	//create mock objects
	IA3Part1 mockObj;

	@Before
	public void setUp() throws Exception {
		obj = new A3Part1Implementation();
		
		amount = 80000;
		
		mockObj = Mockito.mock(IA3Part1.class);
		Mockito.when(mockObj.computeTax(amount)).thenReturn(amount);
		
		obj.setObj(mockObj);
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
