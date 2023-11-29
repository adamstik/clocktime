

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class equalsTest2.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class equalsTest2
{
    /**
     * Default constructor for test class equalsTest2
     */
    public equalsTest2()
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
    public void equalsTest()
    {
        ClockTime clockTim1 = new ClockTime(11, 01, 01);
        ClockTime clockTim2 = new ClockTime(11, 01, 01);
        assertEquals(true, clockTim1.equals(clockTim2));
    }

    @Test
    public void changeTime()
    {
        ClockTime clockTim1 = new ClockTime(11, 01, 01);
        ClockTime clockTim2 = new ClockTime(11, 01, 01);
        clockTim2.setHour(11);
        clockTim2.setMinute(0);
        clockTim2.setSecond(0);
        assertEquals("11:00:00 A.M.", clockTim2.toString12());
    }
}


