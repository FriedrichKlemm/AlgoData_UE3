package Task_1.Test;

import Task_1.Number;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {
    Number testNumber;
    @org.junit.Before
    public void setUp() throws Exception {
         testNumber = new Number("-123");
    }

    @org.junit.Test
    public void getNumber() throws Exception {
        System.out.println (testNumber.getNumber());
    }

    @org.junit.Test
    public void printNumber() throws Exception {
        System.out.println(testNumber.printNumber());

        testNumber.printLineWise();
    }

    @Test
    public void testConstructor() throws Exception {
        Number newTestNumber = new Number("-12345");

        newTestNumber.printNumber();
    }

    @Test
    public void getAtIndex() throws Exception {
       int testIndex = testNumber.getAtIndex(2);
       int expectedChar = 1;

       assertEquals(expectedChar, testIndex);
    }

}