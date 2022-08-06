package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void isLeapYear(int year) {
        boolean reminderBool = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        int reminder = reminderBool? 1 : 0;
        switch (reminder) {
            case 1:
                System.out.println("leap");
                break;
            case 0:
                System.out.println("not leap");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
            isLeapYear(2020);
            isLeapYear(2021);
            isLeapYear(2024);
            isLeapYear(2000);
            isLeapYear(3000);
            isLeapYear(2022);
            isLeapYear(100);
            isLeapYear(400);
    }
}
