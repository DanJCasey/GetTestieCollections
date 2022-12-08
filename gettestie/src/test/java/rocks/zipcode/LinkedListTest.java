package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LinkedListTest {
    @Test
    public void TestLinkedList() {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("D");
        myList.add("A");
        myList.add("V");
        myList.add("I");
        myList.add("D");

        assertEquals(5, myList.size());
        assertEquals("V", myList.get(2));

        myList.addFirst("A");
        assertEquals("A", myList.get(0));
        assertNotEquals("V", myList.get(2));

        myList.removeLast();
        assertEquals("I", myList.get(myList.size()-1));
    }
}
