import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        int a,b,c,d,e;
        System.out.println("Enter marks of five subjects");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        e=s.nextInt();

        int sum=a+b+c+d+e;
        System.out.println("Total marks" +sum);

        double avg=sum/5.0;
        System.out.println("Average marks" +avg);

    }
}
