package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ArrayDequeTest {
    @Test
    public void TestArrayDeque() {
        ArrayDeque<String> myDeque = new ArrayDeque<>();
        myDeque.add("D");
        myDeque.add("A");
        myDeque.add("V");
        myDeque.add("I");
        myDeque.add("D");

        assertEquals(5, myDeque.size());
        assertEquals("D", myDeque.peekFirst());
        assertNotEquals("V", myDeque.peekFirst());

        myDeque.addFirst("A");
        assertEquals("A", myDeque.peekFirst());
        assertEquals("D", myDeque.peekLast());

        myDeque.removeLast();
        assertEquals("I", myDeque.peekLast());
    }
}
