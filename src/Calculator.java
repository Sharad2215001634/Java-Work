import java.util.Scanner;
public class Calculator {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number First Number  : ");
        Double a = sc.nextDouble();
        System.out.print("Enter the Operation(+,-,*,/,% : ");
        String op = sc.next();
        System.out.print("Enter the Second Number : ");
        Double b = sc.nextDouble();
        Double c;
        switch (op)
        {
            case "+":
            {
              c =a+b;
                System.out.print(a+" + "+b+" = "+c);
                break;
            }
            case "-":
            {
                c = a-b;
                System.out.print(a+" - "+b+" = "+c);
                break;
            }
            case "*":
            {
                c= a*b;
                System.out.print(a+" x "+b+" = "+c);
                break;
            }
            case "/":
            {
                c= a/b;
                System.out.print(a+" / "+b+" = "+c);
                break;
            }
            case "%":
            {
                c= a%b;
                System.out.print(a+" % "+b+"="+c);
                break;
            }


        }

    }
}