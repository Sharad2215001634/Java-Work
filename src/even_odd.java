import java.util.Scanner;
public class even_odd {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
//        if (n%2==0)
//        {
//            System.out.print("Even");
//        }
//        else
//        {
//            System.out.print("Odd");
//        }
           String j = n%2==0? "Even" : "Odd";
        System.out.print(j);
    }
}