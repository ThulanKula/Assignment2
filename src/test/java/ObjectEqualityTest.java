import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectEqualityTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public void equality(Object a, Object b){
        assertEquals(a, b);
    }


    public void identity(Object a, Object b){
        assertSame(a, b);
        System.out.println("Same");
        assertNotSame(a, b);


    }

    public void failT(int a, int b) {
       int total;
       total = a + b;
    }

}