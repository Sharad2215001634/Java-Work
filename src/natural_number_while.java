import java.util.Scanner;
public class natural_number_while {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int n = sc.nextInt();
        int i= 1;
        while(i <= n)
        {
            System.out.println(+i);
            i++;
        }
    }
}
