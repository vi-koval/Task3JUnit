package Calculation.Test;

import Calculation.Arithmetics;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestArithmetics  {
    private static Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void runT(){
        a = new Arithmetics();
    }

    //@Ignore
    @Test
    public void testAdd (){
        double res = a.add(3,7);
        if (res !=10)Assert.fail("Error...");
    }
    @Test
    public void testDeduct (){

        double res = a.deduct(5,5);
        Assert.assertTrue("Cool",res == 0);

    }
    @Test
    public void testMult (){

        double res = a.mult(3,7);
        Assert.assertSame(res, 21.0);

    }
    @Test
    public void testDiv (){
        double res = a.div(10.0,5.0 );
        Assert.assertEquals(res,3.0);
    }

    //@Test(expected = ArithmeticException .class)
    @Test
    public void testDivException () {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

    @Test(timeout = 1000)
    public void testN(){
        while (true){
        }
    }
}
