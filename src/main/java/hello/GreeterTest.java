package hello;

import static org.junit.Assert.*;  
import org.junit.Test;
import hello.Greeter;

public class GreeterTest {

	   @Test  
    public void testFindMax(){  
        assertEquals(4,Greeter.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Greeter.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  

}