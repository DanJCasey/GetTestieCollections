package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }


    // Make a bigger test exercising more Stack methods.....

    @Test
    public void TestStack2(){
        Stack<String> stack = new Stack<>();
        String hi = "Hey there!";
        String no = "We don't want any";

        stack.push(hi);
        stack.push(no);
        String actual = stack.pop();
        assertFalse(stack.isEmpty());
        assertEquals(no, actual);

        actual = stack.peek();
        assertEquals(hi, actual);

        stack.clear();
        assertTrue(stack.isEmpty());
    }
















}
