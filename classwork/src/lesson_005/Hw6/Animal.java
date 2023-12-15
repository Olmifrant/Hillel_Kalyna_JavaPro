package lesson_005.Hw6;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int run);

    public abstract void swim(int swim);
}
