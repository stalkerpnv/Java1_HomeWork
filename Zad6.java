public class Zad6 {
    public static boolean isNegative(int num){
        if(Math.abs(num)!=num) return true;
        else return false;
    }
    public static void main(String[]args){
        System.out.println(isNegative(-4));
        System.out.println(isNegative(10));
    }
}
