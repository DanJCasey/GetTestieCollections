package rocks.zipcode;

import static org.junit.Assert.assertTrue;

public class ComparableTest {
    @org.junit.Test
    public void TestComparable() {
        Person Ron = new Person("Ron", 1980);
        Person Jack = new Person("Jack", 1995);
        int actual = Ron.compareTo(Jack);
        assertTrue(actual > 0);
    }

}
