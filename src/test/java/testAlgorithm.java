import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testAlgorithm {
    @Test
    @DisplayName("Should check if the year divided by 4 is an int and the year divided by 100 is not.")
    public void divide_by_4_and_100() {
        boolean expected = true;
        CheckLeapYear test = new CheckLeapYear();
        boolean result = test.isLeapYear(2000);
        Assertions.assertEquals(result,expected);
    }
    @Test
    @DisplayName("Should check if the year divided by 400 is an int.")
    public void divide_by_400() {
        boolean expected = true;
        CheckLeapYear test = new CheckLeapYear();
        boolean result = test.isLeapYear(1996);
        Assertions.assertEquals(result,expected);
    }
    @Test
    @DisplayName("Should check if the year divided by 100 is an int and the year divided by 400 is not.")
    public void divide_by_100_and_400() {
        boolean expected = false;
        CheckLeapYear test = new CheckLeapYear();
        boolean result = test.isLeapYear(1900);
        Assertions.assertEquals(result,expected);
    }
    @Test
    @DisplayName("Should check if the year divided by 4 is not an int")
    public void divide_by_4() {
        boolean expected = false;
        CheckLeapYear test = new CheckLeapYear();
        boolean result = test.isLeapYear(1999);
        Assertions.assertEquals(result,expected);
    }
}
