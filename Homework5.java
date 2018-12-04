/**
 * Java. Level 1* Lesson 5. Homework 5.
 *
 * @author Petrov Nikolay
 * @version dated Dec 4, 2018
 */
public class Homework5{
    public static void main(String[]args){
        Person[] persArray=new Person[5];
        persArray[0]=new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45);
        persArray[1]=new Person("Petrov Petr", "Programmer", "petr@mail.ru", "89245679078", 80000, 30);
        persArray[2]=new Person("Novikov Sergey", "Taxi driver", "novikov@gmail.com", "899912342", 28000, 25);
        persArray[3]=new Person("Semenov Semen", "Actor", "semen@yandex.ru", "89086781234", 35000, 41);
        persArray[4]=new Person("Novgorodov Aysen", "Scientist", "novaysen@gmail.com", "89244605689", 90000, 55);

        for(int i = 0; i < persArray.length; i++){
            if(persArray[i].age > 40) persArray[i].PrintInfo();
        }
    }
}

 class Person{
     String FIO;
     String prof;
     String email;
     String phone;
     int zp;
     int age;

     Person(String FIO, String prof, String email, String phone, int zp, int age){
         this.FIO = FIO;
         this.prof = prof;
         this.email = email;
         this.phone = phone;
         this.zp = zp;
         this.age = age;
     }
     public void PrintInfo(){
         System.out.println(this.FIO + " " + this.prof + " " + this.email + " " + this.phone + " " + this.zp + " " + this.age);
     }
 }
