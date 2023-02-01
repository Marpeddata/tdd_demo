package facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    Hello hello;

    @BeforeEach
    void setUp() {
        hello = new Hello();
    }

    @AfterEach
    void tearDown() {
    }

/*    @Test
    public void testHelloReq1(){
        System.out.println("Requirement 1");
        String actual = hello.sayHello("Helge");
        String expected = "Hello Helge";
        assertEquals(expected, actual);

    }*/

/*    @Test
    public void testHelloReq2(){
        System.out.println("Requirement 2");
        String actual = hello.sayHello(null);
        String expected = "Hello, my friend";
        assertEquals(expected, actual);
    }

    @Test
    public void testHelloReq3(){
        System.out.println("Requirement 3");
        String actual = hello.sayHello("HELGE");
        String expected = "HELLO HELGE!";
        assertEquals(expected, actual);
    }
*/
    @Test
    public void testHelloReq4(){
        System.out.println("Requirement 4");
        String[] names = {"Jill","Jane"};
        String actual = hello.sayHelloArray(names);
        String expected = "Hello, Jill and Jane.";
        assertEquals(expected, actual);
    }

    @Test
    public void testHelloReq5(){
        System.out.println("Requirement 5");
        String[] names = {"Jill","Jane","Jørgen"};
        String actual = hello.sayHelloArray(names);
        String expected = "Hello, Jill, Jane, and Jørgen.";
        assertEquals(expected, actual);
    }

 /*   @Test
    public void testHelloReq6(){
        System.out.println("Requirement 6");
        String[] names = {"Jill","JANE","Jørgen"};
        String actual = hello.sayHelloArray(names);
        String expected = "Hello, Jill and Jørgen. AND HELLO JANE!";
        assertEquals(expected, actual);
    }*/



}