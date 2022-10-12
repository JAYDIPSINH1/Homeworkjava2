import java.util.Scanner;

public class Basicsalary {

    public static void main(String[] args) {

        int basic;
        double hra,da,pf,gp=0,np=0;
        String name;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name of the employee");
        basic=s.nextInt();

        System.out.println("Enter the basic");

        da=basic*30/100;
        hra=basic*12.5/100;
        pf=basic*10/100;
        gp=basic+da+hra;
        np=gp-pf;
        System.out.println("Employees name ");
        System.out.println("Gross pay");
        System.out.println("net pay");





    }
}
