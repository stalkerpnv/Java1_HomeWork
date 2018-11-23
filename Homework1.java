public class Homework1{

    /*Zad3*/
    /*Метод вычисляющий выражение a*(b+(c/d))*/
    public static double Calc(double a, double b, double c,double d){
        return a*(b+(c/d));
    }
    /* Zad 4*/
    /*Метод, проверяющий что их сумма лежит в пределах от 10 до 20(включительно)*/
    public static boolean checknum(int a,int b){
        if((a+b)>=10 && (a+b)<=20) return true;
        else return false;
    }
    /*Zad 5*/
    /*Метод 1 для проверки положительности или отрицательности числа */
    public static void NegOrPos1(int num) {
            if(Math.abs(num)==num){
                System.out.println("Число положительное!");
            }
            else{
                System.out.println("Число отрицательное");
            }
    }

    /*Метод 2 для проверки положительности или отрицательности числа */
    public static void NegOrPos2(int num) {
        if(num>=0){
            System.out.println("Число положительное!");
        }
        else{
            System.out.println("Число отрицательное");
        }
    }

    /*Zad 6*/
    /*Метод для проверки отрицательности числа */
    public static boolean isNegative(int num){
        if(Math.abs(num)!=num) return true;
        else return false;
    }

    /*Zad 7*/
    /*Метод для приветствия */
    public static void sayHello(String name){
        System.out.println("Привет,"+name+"!");
    }

    /*Zad 8*/
    /*Метод для определения високостный ли год */
    public static void checkYear(int year){
        if(year%4!=0 || year%100==0 && year%400!=0){
            System.out.println("Год не високостный");
        }
        else{
            System.out.println("Год високостный");
        }
    }
        /*Zad1*/
    public static void main(String[]args){
        /*Zad2*/
        boolean bool = true;
        char charS='E';
        char chInUnicode='\u0045';
        byte byteNum = 124;
        short shortNum =128;
        int intNum =2147483647;
        long longNum = -35554;
        float floatNum=45663;
        double doubleNum= -293.4673;

        /*Zad 3*/
        double a=1;
        double b=5;
        double c=2;
        double d=3;
        System.out.println(Calc(a,b,c,d));

        /*Zad 4*/
        System.out.println(checknum(15,10));

        /*Zad 5*/
        NegOrPos1(-4);
        NegOrPos2(-4);
        NegOrPos1(7);
        NegOrPos2(7);

        /*Zad 6*/
        System.out.println(isNegative(-4));
        System.out.println(isNegative(10));

        /*Zad 7*/
        sayHello("John");

        /*Zad 8*/
        checkYear(2018);
        checkYear(2020);


    }
}
