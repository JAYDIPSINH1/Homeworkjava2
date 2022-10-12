import java.util.Scanner;

public class Vovel {

    public static void main(String[] args) {

        char ch;
        System.out.println("Enter any character");
        Scanner s=new Scanner(System.in);
        ch=s.next().charAt(0);

         if (ch=='a' || ch=='e'||ch=='i' || ch=='o' || ch=='u')
         {
           System.out.println("vovwl");

         }
         else
         {
             System.out.println("consonant");
         }
    }
}
