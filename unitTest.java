

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class unitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class unitTest
{
    /**
     * Default constructor for test class unitTest
     */
    public unitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void equalsTestr()
    {
        ClockTime clockTim1 = new ClockTime(11, 11, 01);
        ClockTime clockTim2 = new ClockTime(11, 11, 01);
        assertEquals(true, clockTim1.equals(clockTim2));
    }
}

