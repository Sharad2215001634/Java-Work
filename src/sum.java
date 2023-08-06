import java.util.Scanner;
public class sum {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B : ");
        int b = sc.nextInt();
        int c;
        c = a+b;
        System.out.println("Sum is "+c);
    }
}
