import java.util.Scanner;

public class Weekday {

    public static void main(String[] args) {

        int n;
        System.out.println("Enter code of Day");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        switch (n) {
            case 0:
                System.out.println("SUNDAY");
                break;

            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;

            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURESDAY");
                break;

            case 5:
                System.out.println("FRIDAY");
                break;

            case 6:
                System.out.println("SATURDAY");
                break;

        }
    }
}