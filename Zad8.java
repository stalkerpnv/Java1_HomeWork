public class Zad8 {
    public static void checkYear(int year){
        if(year%4!=0 || year%100==0 && year%400!=0){
            System.out.println("Год не високостный");
        }
        else{
            System.out.println("Год високостный");
        }
    }
    public static void main(String[]args){
        checkYear(2018);
        checkYear(2020);

    }
}
