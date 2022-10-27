public class CheckLeapYear {
    private boolean result;


    public boolean isLeapYear(int year) {
        if (year%4 == 0 && year%100 != 0) {
            result = true;
        }
        else if (year%400 == 0) {
            result = true;
        }
        else if (year%100 == 0 && year%400 != 0) {
            result = false;
        }
        else {
            result = false;
        }

        return result;
    }
}

