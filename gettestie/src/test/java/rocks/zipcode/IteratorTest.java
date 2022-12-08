package rocks.zipcode;

import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import static org.junit.Assert.assertTrue;

public class IteratorTest {
    @Test
    public void TestIterator(){
        Collection<Integer> myCollection = new LinkedList<>();
        myCollection.add(5);
        myCollection.add(8);
        myCollection.add(0);
        myCollection.add(2);

        Iterator<Integer> iterator = myCollection.iterator();
        while(iterator.hasNext()) {
            Integer actual = iterator.next();
            assertTrue(actual <= 8 && actual >= 0);
        }
    }
}
