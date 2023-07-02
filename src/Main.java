public class Main {
    public static void main(String[] args) {
        int yearLeap = 1764;
        int year = 1763;
        leapYear(year);
        leapYear(yearLeap);
    }
    private static void leapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println( year + " Год является високосным");
        }else {
            System.out.println( year + " Год является невисокосным");
        }
    }
}