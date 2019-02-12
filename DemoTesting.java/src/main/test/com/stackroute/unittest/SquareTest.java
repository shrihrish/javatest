package com.stackroute.unittest;

import org.junit.*;
import static org.junit.Assert.*;

public class SquareTest {


    Square app;
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
        app=new Square();
    }

    @After
    public void tearDown(){
        System.out.println("Inside teardown");
        app=null;
    }
    @Test
    public void isPowerOfFour() {
        Square s =new Square();


        //Arrange
        String expectedValue="";

        //Act

        //Assert
        assertEquals(expectedValue,s.isPowerOfFour(16));
    }

}
