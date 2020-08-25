import java.util.Scanner;

public class WeekDaySwitch {
    public static void main(String[] args) {
        Scanner keyBd = new Scanner(System.in);
        System.out.println("Enter the weekday number:");
        int weekNumber = keyBd.nextInt();
        switch (weekNumber) {
            case 0:
                System.out.println("It is Sunday.");
                break;
            case 1:
                System.out.println("It is Monday.");
                break;
            case 2:
                System.out.println("It is Tuesday.");
                break;
            case 3:
                System.out.println("It is Wednesday.");
                break;
            case 4:
                System.out.println("It is Thursday.");
                break;
            case 5:
                System.out.println("It is Friday.");
                break;
            case 6:
                System.out.println("It is Saturday.");
                break;
        }
    }
}
