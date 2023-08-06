public class ci{
    public static void main(String[] arg){
        double a=0;
        double p = 1000;
        double r = 10;
        double t =2;
        double ci;
        a= p*((1+r/100)*(1+r/100));
        System.out.println("Toatl amount = "+a);
        ci = a-p;
        System.out.print("Compound Intrest = "+ci);
    }
}