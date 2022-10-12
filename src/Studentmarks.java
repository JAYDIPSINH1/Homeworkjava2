import java.util.Scanner;

public class Studentmarks {

    public static void main(String[] args) {

        int marks;
        System.out.println("Enter any number");
        Scanner s=new Scanner(System.in);
        marks=s.nextInt();

        if (marks >= 60 && marks <= 70)
        {
            System.out.println("Distriction");
        }
        else if (marks >= 40 && marks >= 60)
        {
            System.out.println("first class");
        }
        else if (marks >= 35 && marks >= 50)
        {
            System.out.println("pass class");
        } else {
            System.out.println("fail");
        }
    }
}



