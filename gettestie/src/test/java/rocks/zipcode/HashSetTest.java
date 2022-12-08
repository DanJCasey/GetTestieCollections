package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class HashSetTest {
    @Test
    public void TestHashSet() {
        Set<String> hs1 = new HashSet<>();
        Set<String> hs2 = new HashSet<>();
        hs1.add("a");
        hs1.add("b");
        hs1.add("b");
        hs2.add("b");
        hs2.add("c");
        hs2.add("d");

        int expected = 2;
        int actual = hs1.size();
        assertEquals(expected, actual);
        assertTrue(hs2.contains("c"));

        hs2.remove("c");
        assertFalse(hs2.contains("c"));

        hs1.retainAll(hs2);
        actual = hs1.size();
        expected = 1;
        assertEquals(expected, actual);

    }
}
