package rocks.zipcode;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class PriorityQueueTest {
    @Test
    public void TestPriorityQueue () {
        PriorityQueue<Integer> myPQ = new PriorityQueue<>();
        myPQ.add(3);
        myPQ.add(6);
        myPQ.add(8);
        myPQ.add(-12);
        myPQ.add(0);

        assertFalse(myPQ.isEmpty());
        Integer actual = myPQ.remove();
        Integer expected = 3;
        assertNotEquals(expected, actual);
        expected = -12;
        assertEquals(expected, actual);

        expected = 4;
        actual = myPQ.size();

        assertEquals(expected, actual);
        assertTrue(myPQ.contains(8));

        actual = myPQ.peek();
        expected = 0;
        assertEquals(expected, actual);
    }
}
