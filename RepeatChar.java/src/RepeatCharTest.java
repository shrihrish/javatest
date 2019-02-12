import static org.junit.Assert.*;
import org.junit.*;
package com.stackroute.unittest;


public class RepeatCharTest {

    ReapeatChar app;
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

    }

    @After
    public void tearDown(){
        System.out.println("Inside teardown");
        app=null;
    }


    @Test
    public void test() throws Exception {
        //Arrange
        StringBuffer  expectedValue=new StringBuffer("Stackroutetete");

        //Act
        StringBuffer actualValue=app.repeatCh("Stackroute",2);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}


