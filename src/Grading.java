import java.util.Scanner;
public class Grading {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Mark in Hindi : ");
        int hindi = sc.nextInt();
        System.out.print("Enter the Mark in Math : ");
        int math = sc.nextInt();
        System.out.print("Enter the Mark in English : ");
        int eng = sc.nextInt();
        System.out.print("Enter the Mark in Science  : ");
        int sci = sc.nextInt();
        System.out.print("Enter the Mark in GK : ");
        int gk = sc.nextInt();
        double total;
        total=(((hindi+math+eng+sci+gk)*100)/500);
        if (total > 95){
            System.out.print("O Grade");
        }
        else if(total >= 90 && total < 95) {
            System.out.print("A+ Grade");
        }
        else if (total >= 85 && total < 90){
            System.out.print("A Grade");
        }
        else if(total >= 75 && total < 85){
            System.out.print("B+ Grade");
        } else if (total >= 65 && total < 75) {
            System.out.print("B Grade");
        } else if (total >= 60 && total < 65) {
            System.out.print("C+ Grade");
        } else if (total >= 55 && total <60){
            System.out.print("C Grade");
        } else {
            System.out.print("Fail");
        }
    }
}