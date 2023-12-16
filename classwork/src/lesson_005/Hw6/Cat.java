package lesson_005.Hw6;

public class Cat extends Animal {

    private int limitRun = 200;
    private static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run (int run) {
        if (run <= limitRun) {
            System.out.println("Кот " + name + " пробежал " + run + " метров");
        } else {
            System.out.println("Кот " + name + " хотел пробежать " +
                    run + " метров но не смог потому что у котов ограничение " + limitRun + " метров");
        }
    }

    @Override
    public void swim (int swim) {
        System.out.println("Кот " + name + " хотел проплыть " + swim + " метров  но не умеет плавать");
        System.out.println();
    }
}

