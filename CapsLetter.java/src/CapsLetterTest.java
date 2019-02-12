package com.stackroute.unittest;
import org.junit.*;
import static org.junit.Assert.*;


public class CapsLetterTest {

    CapsLetterTest app;

    @BeforeClass
    public static void setUpOnce(){
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce(){
        System.out.println("Inside teardown once");

    }
    @Before
    public void setUp(){
        System.out.println("Inside setup");
        app = new CapsLetter();
    }

    @After
    public void tearDown(){
        System.out.println("Inside teardown");
        app=null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "Capital letter";

        //Act
        String actualValue = app.capitalL('L');
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test1() throws Exception {
        //Arrange
        String expectedValue = "Lower case letter";

        //Act
        String actualValue = app.capitalL('p');
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test2() throws Exception {
        //Arrange
        String expectedValue = "Digit";

        //Act
        String actualValue = app.capitalL('9');
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test3() throws Exception {
        //Arrange
        String expectedValue = "Special Character";

        //Act
        String actualValue = app.capitalL('#');
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }



}


