package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ArrayListTest {
    @Test
    public void TestArrayList() {
        List<String> newList = new ArrayList<>();
        newList.add("a");
        newList.add("a");
        newList.add("b");
        int expected = 3;

        assertEquals(expected, newList.size());
        assertFalse(newList.isEmpty());

        String actString = newList.get(2);
        String expString = "b";
        assertEquals(expString, actString);

        newList.set(0, "c");
        expString = "c";
        actString = newList.get(0);
        assertEquals(expString, actString);
    }
}
