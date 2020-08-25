import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        //Write a program that will print out the the weekday name with given weekday number to calculate the weekday name.
        //Enter the weekday number: 1
        //It is Sunday.
        Scanner keyBd = new Scanner(System.in);

        System.out.println("Enter the weekday number:");
        int weekNum = keyBd.nextInt();
        String weekDay = "";

        if (weekNum == 0) {
            weekDay = "Sunday";
        } else if (weekNum == 1) {
            weekDay = "Monday";
        } else if (weekNum == 2) {
            weekDay = "Tuesday";
        } else if (weekNum == 3) {
            weekDay = "Wednesday";
        } else if (weekNum == 4) {
            weekDay = "Thursday";
        } else if (weekNum == 5) {
            weekDay = "Friday";
        } else if (weekNum == 6) {
            weekDay = "Saturday";
        }
        System.out.println("It is " + weekDay + ".\n");

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
