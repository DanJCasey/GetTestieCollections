package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Vector;

public class VectorTest {
        private Vector<Person> vector;
        private Person[] arr;
        private Person p1;
        private Person p2;
        private Person p3;
        private Person p4;
        private Person p5;
        private Person p6;

        @Before
    public void set() throws Exception {
            arr = new Person[6];
            p1 = new Person("Dave", 1980);
            p2 = new Person("Molly", 1988);
            p3 = new Person("Dan", 1992);
            p4 = new Person("Matt", 1983);
            p5 = new Person("Bela", 1929);
            p6 = new Person("Alita", 1944);

            arr = new Person[]{p1, p2, p3, p4, p5, p6};
     }
     @Test
    public void vectorTest1(){
            vector = new Vector<>(Arrays.asList(arr));
         Assert.assertEquals(6, vector.size());
     }
     @Test
    public void vectorTest2(){
            vector = new Vector<>(Arrays.asList(arr));
            vector.add(new Person("Josh", 1998));
            Assert.assertEquals(7, vector.size());
     }
     @Test
    public void vectorTest3(){
            vector = new Vector<>(Arrays.asList(arr));
            vector.remove(p4);
            Assert.assertEquals(false, vector.contains(p4));
            Assert.assertEquals(5, vector.size());
     }
}
