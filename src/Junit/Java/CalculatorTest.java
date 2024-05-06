//package JUNIT.Junit.Java;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.Random;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CalculatorTest {
//    Random rd = new Random();
//    Calculator calc = new Calculator();
//
//    @Test
//    void testAdd() {
//
//        for (int i = 0; i < 300; i++) {
//            int a = rd.nextInt(-5555, 6666);
//            int b = rd.nextInt(-5555, 6666);
//            assertEquals((a+b),calc.add(a,b));
//        }
//        assertEquals(0,calc.add(1,2));
//    }
//
//    @Test
//    void testSub() {
//
//        for (int i = 0; i < 300; i++) {
//            int a = rd.nextInt(-5555, 6666);
//            int b = rd.nextInt(-5555, 6666);
//            assertEquals((a-b),calc.sub(a,b));
//        }
//    }
//
//    @Test
//    void testMul() {
//
//        for (int i = 0; i < 300; i++) {
//            int a = rd.nextInt(-5555, 6666);
//            int b = rd.nextInt(-5555, 6666);
//            assertEquals((a*b),calc.mul(a,b));
//        }
//    }
//
//    @Test
//    void testDiv() {
//
//        for (int i = 0; i < 300; i++) {
//            int a = rd.nextInt(-5555, 6666);
//            int b = rd.nextInt(-5555, 6666);
//            try{
//                assertEquals((a/b),calc.div(a,b));
//            }catch (IllegalArgumentException e){
//                assertEquals("Cannot div by zero",e.getMessage());
//            }
//        }
//        try{
//            assertEquals(0,calc.div(1, 0));
//        }catch (IllegalArgumentException e){
//            assertEquals("Cannot div by zero",e.getMessage());
//        }
//    }
//}