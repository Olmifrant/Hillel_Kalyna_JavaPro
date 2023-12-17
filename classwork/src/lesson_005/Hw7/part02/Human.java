package lesson_005.Hw7.part02;

public class Human extends Team {

    public Human (String name, int maxRange, int maxJump) {
        super(name, maxRange, maxJump);
    }

    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getRange() <= getMaxRange()) {
            System.out.println("Человек " + getName() + " пробежал " + treadmill.getRange() + " м.");
        } else System.out.println("Человек " + getName() + " не смог пробежать "
                    + treadmill.getRange() + " м. т.к. может пробежать лишь "
                + getMaxRange() + " м. и больше бегать не будет");
    }

    @Override
    public void jumpWall(Wall wall) {

        if (wall.getHeight() <= getMaxJump()) {
            System.out.println("Человек " + getName() + " перепрыгнул стену высотой " + wall.getHeight() + " м.");
        } else System.out.println("Человек " + getName() + " не смог перепрыгнуть стену высотой " + wall.getHeight()
                    + " м. т.к. может прыгнуть лишь на " + getMaxJump() +" м. и  больше прыгать не будет");
    }

}
