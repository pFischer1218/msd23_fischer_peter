package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void newCalc(){
        calculator=new Calculator();
    }

    @Test
    void testAddition1(){
        assertEquals(9,calculator.add(5.4,3.6));
    }

    @Test
    void testAddition2(){
        assertEquals(5390.945,calculator.add(3,5387.945));
    }

    @Test
    void testAddition3(){
        assertEquals(-8.00,calculator.add(-5,-3));
    }

    @Test
    void testMinus1(){
        assertEquals(252.8,calculator.minus(300.3,47.5));
    }

    @Test
    void testMinus2(){
        assertEquals(60.7,calculator.minus(13,-47.7));
    }

    @Test
    void testMinus3(){
        assertEquals(-733,calculator.minus(-666,67));
    }

    @Test
    void testMulitply1(){
        assertEquals(144,calculator.multiply(-12.0,-12));
    }

    @Test
    void testMulitply2(){
        assertEquals(64,calculator.multiply(128,0.5));
    }

    @Test
    void testMulitply3(){
        assertEquals(0, calculator.multiply(7362.83, 0));
    }

    @Test
    void testDivide1(){
        assertEquals(0.03,calculator.divide(0.09,3));
    }

    @Test
    void testDivide2(){
        assertEquals(-18,calculator.divide(-36,2));
    }


    @Test
    public void testDivide3() {
        assertEquals("Infinity",(calculator.divide(26,0))+"");
    }

}
