import org.testng.Assert;
import org.testng.annotations.Test;

public class Task8Test {


    @Test
    void testSummation() {

        Assert.assertEquals(Task8.Summation(5, 5), 10);
        Assert.assertEquals(Task8.Summation(0, 5), 5);
        Assert.assertEquals(Task8.Summation(-5, -5), -10);
        Assert.assertEquals(Task8.Summation(0, 0), 0);
        Assert.assertEquals(Task8.Summation(5 - 2, 5 + 3), 11);
        Assert.assertEquals(Task8.Summation(-5, 5), 0);

    }

    @Test
    void testSubtraction() {
        Assert.assertEquals(Task8.Subtraction(15, 5), 10);
        Assert.assertEquals(Task8.Subtraction(5, 15), 10);
        Assert.assertEquals(Task8.Subtraction(0, 0), 0);
        Assert.assertEquals(Task8.Subtraction(5, -5), 10);
        Assert.assertEquals(Task8.Subtraction(5 * 5, 5), 20);
    }

    @Test
    void testMultiplication() {
        Assert.assertEquals(Task8.Multiplication(5, 5), 25);
        Assert.assertEquals(Task8.Multiplication(-5, 5), -25);
        Assert.assertEquals(Task8.Multiplication(0, 5), 0);
        Assert.assertEquals(Task8.Multiplication(-5, -5), 25);
    }

    @Test
    void testDivision() {
        Assert.assertEquals(Task8.Division(25, 5),5);
        Assert.assertEquals(Task8.Division(22, 5), 4.4);
        Assert.assertEquals(Task8.Division(-22, 5), -4.4);
        Assert.assertEquals(Task8.Division(-22,-5),4.4);
    }
}
