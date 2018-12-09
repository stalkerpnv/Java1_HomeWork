/**
 * Java. Level 1* Lesson 6. Homework 6.
 *
 * @author Petrov Nikolay
 * @version dated Dec 9, 2018
 */

public class Homework6{
    public static void main(String[]args){
        Animal[] animals= {new Cat("Thomas"),
                           new Dog("Sharik")};
        for (Animal animal:animals){
            System.out.println(animal + " " + animal.run(200));
            System.out.println(animal + " " + animal.swim(5));
            System.out.println(animal + " " + animal.jump(1));
        }

    }
}

interface IAnimal{
    boolean run(int value);
    boolean swim(int value);
    boolean jump(int value);
}
abstract class Animal implements IAnimal{
    protected String name;
    protected int valuer; //Параметр для метода run
    protected int values; //Параметр для метода swim
    protected double  valuej; //Параметр для метода jump

    Animal(String name, int valuer, int values, double valuej){
        this.name = name;
        this.valuer = valuer;
        this.values = values;
        this.valuej = valuej;
    }

    @Override
    public String toString(){
        return  name;
    }

}
 class Cat extends Animal{

    Cat(String name){
        super(name,200, 0, 2);
    }

     public boolean run(int value) {
         return this.valuer >= value;
     }

     public boolean swim(int value) {
         return this.values >= value;
     }

     public boolean jump(int value) {
         return this.valuej >= value;
     }
 }

class Dog extends Animal{

    Dog(String name){
        super(name,500, 10, 0.5);
    }

    public boolean run(int value) {
        return this.valuer >= value;
    }

    public boolean swim(int value) {
        return this.values >= value;
    }

    public boolean jump(int value) {
        return this.valuej >= value;
    }
}
