package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class HashMapTest {
    @Test
    public void TestHashMap(){
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Molly", 34);
        myMap.put("Calvin", 28);
        myMap.put("Nieem", 36);
        Integer actual = myMap.get("Nieem");
        Integer expected = 36;

        assertEquals(expected, actual);
        assertFalse(myMap.containsKey("nieem"));
        assertTrue(myMap.containsKey("Calvin"));
        assertFalse(myMap.containsValue(13));
        assertTrue(myMap.containsValue(34));

        expected = 3;
        actual = myMap.size();
        assertEquals(expected, actual);
        assertFalse(myMap.isEmpty());
    }
}
