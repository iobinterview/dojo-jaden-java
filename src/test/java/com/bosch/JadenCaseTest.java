package com.bosch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class JadenCaseTest {

   private JadenCase jadenCase = new JadenCase();

   @Test
   public void casingTest1() {
      assertEquals( "Most Trees Are Blue",
         jadenCase.toJadenCase( "most trees are blue" ) );
   }

   @Test
   public void casingTest2() {
      assertEquals( "How Can Mirrors Be real If Our Eyes Aren't Real",
         jadenCase.toJadenCase( "How can mirrors be real if our eyes aren't real" ) );
   }

   @Test
   public void testNullArg() {
      assertNull( jadenCase.toJadenCase( null ) );
   }

   @Test
   public void testEmptyArg() {
      assertNull( jadenCase.toJadenCase( "" ) );
   }
}
