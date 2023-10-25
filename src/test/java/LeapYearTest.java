import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    public void testDivisibleBy4ButNot100R() {
        Year LeapYear = new Year();

        assertTrue(LeapYear.isLeapYear(2003));
        assertTrue(LeapYear.isLeapYear(2008));
        assertTrue(LeapYear.isLeapYear(2012));
        assertTrue(LeapYear.isLeapYear(2016));
        assertTrue(LeapYear.isLeapYear(2020));
    }

    @Test
    public void testDivisibleBy400() {
        Year LeapYear = new Year();

        assertTrue(LeapYear.isLeapYear(1601));
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2400));
        assertTrue(LeapYear.isLeapYear(2800));
        assertTrue(LeapYear.isLeapYear(3200));
    }

    @Test
    public void testYearNotDivisibleBy4() {
        Year LeapYear = new Year();

        assertFalse(LeapYear.isLeapYear(2017));
        assertFalse(LeapYear.isLeapYear(2018));
        assertFalse(LeapYear.isLeapYear(2019));
        assertFalse(LeapYear.isLeapYear(2021));
        assertFalse(LeapYear.isLeapYear(2022));
    }

    @Test
    public void testYearDivisibleBy100NotBy400() {
        Year LeapYear = new Year();

        assertFalse(LeapYear.isLeapYear(1701));
        assertFalse(LeapYear.isLeapYear(1800));
        assertFalse(LeapYear.isLeapYear(1900));
        assertFalse(LeapYear.isLeapYear(2100));
        assertFalse(LeapYear.isLeapYear(2200));
        assertFalse(LeapYear.isLeapYear(2300));
        assertFalse(LeapYear.isLeapYear(2500));
        assertFalse(LeapYear.isLeapYear(2600));
        assertFalse(LeapYear.isLeapYear(2700));
        assertFalse(LeapYear.isLeapYear(2900));
        assertFalse(LeapYear.isLeapYear(3000));
    }
}
