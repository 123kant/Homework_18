import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestJTicket {
    @Test
    public void testIsLuckyTicketFalse() {
        System.out.println("testIsLuckyTicketFalse");
        int[] testArray = {1, 1, 1, 3, 3, 3};
        boolean actualResult = LuckyTicket.checkIsLuckTicket(testArray);
        assertFalse(actualResult);
    }

    @Test
    public void testIsLuckyTicketTrue() {
        System.out.println("testIsLuckyTicketTrue");
        int[] testArray = {1, 1, 1, 1, 1, 1};
        boolean actualResult = LuckyTicket.checkIsLuckTicket(testArray);
        assertTrue(actualResult);
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("This is text before each test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("This is text after each test");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all tests...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all tests...");
    }
}
