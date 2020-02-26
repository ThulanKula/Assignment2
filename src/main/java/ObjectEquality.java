import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ObjectEquality {
    public static void main(String[] args) {

    }

    @Test
    public void equality(){
       Object x = 78;
       Object y = "Thulani";
    }

    @Test
    public void identity(){
       Object x = 45;
       Object y = 778;
       }

    @Test
    public void failT(){
        int a = 12;
        Object b = "String";
        fail("execption");
    }


}
