package lesson_005.Hw6;

public class Dog extends Animal {

    private int limitRun = 500;
    private int limitSwim = 10;
    private static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run (int run) {

        if (run <= limitRun) {
            System.out.println("Пес " + name + " пробежал " + run + " метров");
        } else {
            System.out.println("Пес " + name + " хотел пробежать " +
                    run + " метров но не смог потому что у собак ограничение " + limitRun + " метров");
        }
    }

    @Override
    public void swim (int swim) {

        if (swim <= limitSwim) {
            System.out.println("Пес " + name + " проплыл " + swim + " метров");
        } else {
            System.out.println("Пес " + name + " хотел проплыть " +
                    swim + " метров но не смог потому что у собак ограничение " + limitSwim + " метров");
        }
        System.out.println();
    }
}
