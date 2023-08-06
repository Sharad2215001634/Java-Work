import java.util.Scanner;
public class area_of_circle {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float r = sc.nextFloat();
        double area;
        double p = 3.14;
        area = p * r * r;
        System.out.print("Radius of Circle is : "+area);

    }
}