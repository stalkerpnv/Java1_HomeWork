public class Zad4 {
    public static boolean checknum(int a,int b){
        if((a+b)>=10 && (a+b)<=20) return true;
        else return false;
    }
    public static void main(String[]args){
        System.out.println(checknum(15,10));
    }
}
