package ca.on.oicr;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

   private FizzBuzz sut;

   @Before
   public void setUp() throws Exception {
      sut = new FizzBuzz();
   }



   @Test
   public void test() {
      assertEquals("FIZZ", sut.decide(3));
   }

}
