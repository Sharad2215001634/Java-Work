import java.util.Scanner;
public class table {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int j;
        for (int i = 1; i < 11; i++)
        {
            j = n * i;
            System.out.println(n+"x"+i+"="+j);
        }
    }
}