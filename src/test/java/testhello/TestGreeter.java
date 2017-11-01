package hello;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;



public class TestGreeter {

   private Greeter g;
	
   @Before
   public void setUp() throws Exception 
   {
      g = new Greeter();
   }

   @Test
   public void testGreeterEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }
	
   @Test
   public void testGreeter() 
   {
      g.setName("World War");
      assertEquals(g.getName(),"World War");
      assertEquals(g.sayHello(),"Hello World War!");
   }
   
   // Tests age variable and its getter and setter.
   @Test
   public void newtestwbhGreeterPass()
   {
	   g.setAge(22);
	   assertEquals(g.getAge(), 22);
   }
   
   @Test
   public void newtestwbhGreeterFail(){
	   g.setAge(99);
	   g.setAge(50);
	   assertEquals(g.getAge(), 99);
   }
}