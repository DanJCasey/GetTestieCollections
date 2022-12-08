package rocks.zipcode;

import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TreeSetTest {
    @Test
    public void TestTreeSet() {
        TreeSet<Integer> myTree = new TreeSet<>();
        myTree.add(3);
        myTree.add(6);
        myTree.add(2);
        myTree.add(13);

        Integer expected = 2;
        Integer actual = myTree.first();
        assertEquals(expected, actual);


        myTree.remove(2);
        actual = myTree.pollFirst();
        assertNotEquals(expected, actual);

        expected = 6;
        actual = myTree.higher(5);
        assertEquals(expected, actual);
    }
}
