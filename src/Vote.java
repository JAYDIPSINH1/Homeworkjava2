import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {

        int age;
        System.out.println("Enter your age");
        Scanner s=new Scanner(System.in);
        age=s.nextInt();

        if(age>=18)

        {
            System.out.println("Eligible for vote");
        }
        else
        {
            System.out.println("Not eligible for vote");
        }

    }
}
