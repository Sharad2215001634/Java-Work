import java.util.Scanner;
public class si{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Priciple : ");
        double p = sc.nextDouble();
        System.out.print("Enter the Rate % per Anumm : ");
        double r = sc.nextDouble();
        System.out.print("Enter the Time  : ");
        double t = sc.nextDouble();
        double si;
        si = (p * r * t) / 100;
        System.out.print("Simple Intrest = "+si+"%");
    }
}