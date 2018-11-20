public class Zad5 {
    public static void NegOrPos1(int num) {
            if(Math.abs(num)==num){
                System.out.println("Число положительное!");
            }
            else{
                System.out.println("Число отрицательное");
            }
    }
    public static void NegOrPos2(int num) {
        if(num>=0){
            System.out.println("Число положительное!");
        }
        else{
            System.out.println("Число отрицательное");
        }
    }
    public static void main(String[]args){
        NegOrPos1(-4);
        NegOrPos2(-4);

        NegOrPos1(7);
        NegOrPos2(7);
    }
}
