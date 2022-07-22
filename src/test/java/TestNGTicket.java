import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGTicket {
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before all tests...");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After all tests...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is text before each test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This is text after each test");
    }

    @Test
    public void testIsLuckyTicketFalse () {
        System.out.println("testIsLuckyTicketFalse");
        int [] testArray = {1,1,1,3,3,3};
        boolean actualResult = LuckyTicket.checkIsLuckTicket(testArray);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void testIsLuckyTicketTrue () {
        System.out.println("testIsLuckyTicketTrue");
        int [] testArray = {1,1,1,1,1,1};
        boolean actualResult = LuckyTicket.checkIsLuckTicket(testArray);
        Assert.assertTrue(actualResult);
    }
}
