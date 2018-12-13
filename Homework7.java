/**
 * Java. Level 1* Lesson 7. Homework 7.
 *
 * @author Petrov Nikolay
 * @version dated Dec 11, 2018
 */
public class Homework7 {
    public static void main(String[]args){
        Plate plate = new Plate(100);
        Cat[] cats = {new Cat("Thomas", 100),
                      new Cat("Myrzik", 25),
                      new Cat("Barsik", 5)};
        System.out.println("Начальное состояние тарелки " + plate);
        for(Cat cat:cats){
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println("Состояние тарелки, когда все коты попытались поесть " + plate);
    }
}

class Cat{
    private String name;
    private int appetite;
    private boolean happiness;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.happiness = false;
    }

    @Override
    public String toString(){
        return "name: " + name + ", appetite:"+ appetite + ", happiness:" + happiness;
    }

    public void eat(Plate p){
        sethappines(p.dicreaseFood(appetite));
    }

    private void sethappines(boolean happiness){
        this.happiness = happiness;
    }
}

class Plate{
    private int food;

    public Plate(int food){
        this.food = food;
    }

    @Override
    public String toString(){
        return "plate: " + food;
    }

    public boolean dicreaseFood(int n){
        if((food-n)>=0){
            food = food-n;
            return true;
        }
        else{
            addfood();
        }
            return false;
    }

    private void addfood(){
        food = food + 100;
    }
}
