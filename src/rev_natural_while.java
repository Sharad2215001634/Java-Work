import java.util.Scanner;
public class rev_natural_while {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n >=1)
        {
            System.out.println(n);
            n--;
        }

    }
}