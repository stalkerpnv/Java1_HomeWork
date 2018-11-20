public class Zad3 {

    public static double Calc(double a, double b, double c,double d){
        return a*(b+(c/d));
    }

    public static void main(String[]args){
        double a=1;
        double b=5;
        double c=2;
        double d=3;
        System.out.println(Calc(a,b,c,d));
    }
}
