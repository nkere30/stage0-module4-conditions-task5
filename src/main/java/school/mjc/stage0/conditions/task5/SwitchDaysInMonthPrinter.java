package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public static void amountOfDays(int month) {
        switch (month) {
            case 2:
                System.out.println(28);
                break;
            case 4, 6, 9, 11:
                System.out.println(30);
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(31);
                break;
            default:
                System.out.println("wrong number!");
        }
    }

    public static void main(String[] args) {
        amountOfDays(1);
        amountOfDays(2);
        amountOfDays(3);
        amountOfDays(4);
        amountOfDays(5);
        amountOfDays(6);
        amountOfDays(7);
        amountOfDays(8);
        amountOfDays(9);
        amountOfDays(10);
        amountOfDays(11);
        amountOfDays(12);
        amountOfDays(13);
    }
}
