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
   public void test_3_produces_FIZZ() {
      assertEquals("FIZZ", sut.decide(3));
   }

   @Test
   public void test_5_produces_BUZZ() {
      assertEquals("BUZZ", sut.decide(5));
   }

   @Test
   public void test_8_produces_empty_string() throws Exception {
      assertEquals("", sut.decide(8));
   }
}
