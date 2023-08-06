import java.util.Scanner;
public class gretest_number{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd Number : ");
        int c = sc.nextInt();
        // Using Ternary operator
//        int gretest;
//        gretest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
//        System.out.print("Largest number is : "+gretest);
        if (a > b && a > c)
        {
            System.out.print("1st number is Largest : "+a);
        }
        else {
            if (b > a && b > c)
            {
                System.out.print("2nd number is Largest : "+b);
            }
            else
            {
                System.out.print("3rd Number is Largest : "+c);
            }
        }

    }
}
