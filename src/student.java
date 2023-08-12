import java.util.Scanner;
public class student {

        Scanner sc = new Scanner(System.in);

        String name;
        int roll_num;
        String course;
        void get()
        {
            System.out.print("Enter Your Name : ");
            name = sc.next();
            System.out.print("Enter Your Roll number : ");
            roll_num = sc.nextInt();
            System.out.print("Enter Your Course : ");
            course = sc.next();
        }
        void display()
        {
            System.out.print("Your Name : ");
            System.out.println(name);
            System.out.print("Your Roll Number : ");
            System.out.println(roll_num);
            System.out.print("Your Course : ");
            System.out.println(course);
        }
        public static void main(String[] arg){
            student s = new student();
            s.get();
            s .display();
    }
}
