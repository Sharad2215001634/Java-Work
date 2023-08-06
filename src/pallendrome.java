import java.util.Scanner;
public class pallendrome {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int rev = 0;
        int rem;
        int old = n;
        while(n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        System.out.print(rev);
        if (old == rev)
        {
            System.out.print(" : is a Pallendrome number ");
        }
        else
        {
            System.out.print(": not  a Pallendrome number ");
        }
    }

}