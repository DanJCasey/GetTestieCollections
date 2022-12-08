package rocks.zipcode;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TreeMapTest {
    @Test
    public void TestTreeMap(){
        Map<String, Integer> myTree = new TreeMap<>();
        myTree.put("Dave", 40);
        myTree.put("Molly", 34);
        myTree.put("Bethany", 45);
        Iterator<Map.Entry<String, Integer>> iterator = myTree.entrySet().iterator();

        Map.Entry<String, Integer> myEntry = iterator.next();
        Integer actual = myEntry.getValue();
        Integer expected = 45;

        assertEquals(expected, actual);

    }
}
