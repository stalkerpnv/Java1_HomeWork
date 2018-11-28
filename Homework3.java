import java.util.Random;
import java.util.Scanner;
public class Homework3 {

    private static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut","peanut","pepper","pineapple", "pumpkin","potato"};

    /**
     * Сравнивает посимвольно две строки
     * @param word Загаданное слово из массива
     * @param input_word Слово введенное пользователем
     * @return возвращает результат в виде строки+######
     */
    public static String compareChars(String word, String input_word){
        String result="";
        int count;
        if(word.length()<=input_word.length()){
            count=word.length();
        }
        else {
            count=input_word.length();
        }
        for(int i=0; i<count;i++){
            if(word.charAt(i)==input_word.charAt(i)){
                result=result+word.charAt(i);
            }
        }
        return result+"###########";
    }

    public static void main(String[]args){
        String input_word;
        Random rand=new Random();
        /*Генерация случайного индекса массива*/
        int i_words=rand.nextInt(words.length);

        /*System.out.println(words[i_words]);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите слово=>");
        input_word=sc.nextLine();

        while(input_word.equals(words[i_words])==false){
            System.out.println("Слово не отгадано");
            System.out.println(compareChars(words[i_words],input_word));
            System.out.println("Попробуйте еще раз");
            input_word=sc.nextLine();
        }
        sc.close();
        System.out.println("Слово отгадано!");
    }
}
