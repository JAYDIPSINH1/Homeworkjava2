import java.util.Scanner;

public class Cityname {

    public static void main(String[] args) {

            int n;
            System.out.println("Enter code of city");
            Scanner s=new Scanner(System.in);
            n=s.nextInt();

            switch (n)
            {
                case 0: System.out.println("AHMEDABAD");
                break;

                case 1: System.out.println("GANDHINAGAR");
                   break;

                case 2: System.out.println("RAJKOT");
                    break;

                case 3: System.out.println("SURAT");
                    break;

                case 4: System.out.println("VADODARA");
                    break;

                case 5: System.out.println("MORBI");
                    break;
            }
    }
}
