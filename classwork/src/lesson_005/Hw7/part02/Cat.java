package lesson_005.Hw7.part02;

public class Cat extends Team {

    public Cat(String name, int maxRange, int maxJump) {
        super(name, maxRange, maxJump);
    }

    @Override
    public void runTreadmill(Treadmill treadmill) {

        if (treadmill.getRange() <= getMaxRange()) {
            System.out.println("Кот " + getName() + " пробежал " + treadmill.getRange() + " метров");
        } else System.out.println("Кот " + getName() + " не смог пробежать " + treadmill.getRange()
                + " метров поскольку может пробежать лишь " + getMaxRange() + " и больше бегать не будет");
    }

   @Override
    public void jumpWall(Wall wall) {

        if (wall.getHeight() <= getMaxJump()) {
            System.out.println("КОТ " + getName() + " смог перепрыгнуть препятствие высотой " + wall.getHeight() + " метра");
        } else System.out.println("КОТ " + getName() + " не смог перепрыгнуть препятствие высотой " + wall.getHeight()
                    + " метров поскольку может прыгнуть лишь на " + getMaxJump() +" и  больше прыгать не будет");
    }

    }

