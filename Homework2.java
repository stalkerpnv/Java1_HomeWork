import java.util.Arrays;

public class Homework2 {
    /*Zad1*/
    public static void inverArray(){
        int [] arr={1,1,0,0,1,0,1,1,0,0};
        for (int i:arr) {
            if(i==0){
                i=1;
            }
            else {
                i=0;
            }
            /*Массив, где произошла замена */
            System.out.print(i+" ");
        }
    }

    /*Zad2*/
    public static void fillArray() {
        int[] arr = new int[8];
        int value=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=value;
            value=value+3;
            System.out.print(arr[i]+" ");
        }
    }
    /*Zad3*/
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i]=arr[i]*2;
            }
            System.out.print(arr[i]+" ");
        }
    }
    /*Zad4*/
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i]=1;
        }
        System.out.println(Arrays.deepToString(arr));
    }
    /*Zad5*/
    /*Метод для нахождения минимального значения в одномерном массиве*/
    public static int findMin(int []arr){
        int min=arr[0];
        for(int i=1; i<arr.length;i++){
            if(min>arr[i]) min=arr[i];
        }
        return min;
    }

    /*Метод для нахождения максимального значения в одномерном массиве*/
    public static int findMax(int []arr){
        int max=arr[0];
        for(int i=1; i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
        }
        return max;
    }

    /*Zad6*/
    public static boolean checkBalance(int[]arr) {
        double sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        double sumpart = sum / 2;
        int firstpart = 0;
        for (int j = 0; j < arr.length; j++) {
            firstpart = firstpart + arr[j];
            if (firstpart == sumpart) {
                return true;
            }
        }
        return false;
    }

    /*Zad7*/
    /*Сдвиг массива*/
    public static int[] changePos(int[]arr, int n){
        int size = arr.length;
        for (int i = 0; i < n; i++) {
            int temp = arr[size - 1];
                  for (int j = size - 1; j > 0; j--) {
                      arr[j] = arr[j-1];
               }
            arr[0] = temp;
        }
        return arr;
    }

    public static void main(String[]args){
        inverArray();
        System.out.println();
        fillArray();
        System.out.println();
        changeArray();
        System.out.println();
        fillDiagonal();
        int[]arr={2,5,6,1,3};
        System.out.println("Min"+findMin(arr));
        System.out.println("Max"+findMax(arr));
        int[]array1={1, 1, 1, 2, 1};
        int[]array2={10,10};
        int[]array3={2,1,1,2,1};
        System.out.println(checkBalance(array1));
        System.out.println(checkBalance(array2));
        System.out.println(checkBalance(array3));
        int []array={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(changePos(array,1)));
    }
}
