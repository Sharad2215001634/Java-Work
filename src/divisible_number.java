import java.util.Scanner;
public class divisible_number {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n%5==0)
        {
            System.out.print("Number is Divisible by 3 and 5");
        }
        else
        {
            System.out.print("Not Divisible by 3 and 5");
        }
    }
}