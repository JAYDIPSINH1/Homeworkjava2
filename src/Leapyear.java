public class Leapyear {

    public static void main(String[] args) {

        int year=1989;

        if ((year%400==0)||(year%4==0)&&(year!=100))
        {
            System.out.println(year+"is a leap year");
        }
        else
        {
            System.out.println("year is not a leap year");
        }

    }
}
