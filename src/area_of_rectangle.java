import java.util.Scanner;
public class area_of_rectangle {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of l :");
        double l = sc.nextDouble();
        System.out.print("Enter the value of b :");
        double b = sc.nextDouble();
        double area;
        area = l*b;
        System.out.print("Area is : "+area);
    }
}
