package lesson_005.Hw7.part02;

public class Main {

    public static void main(String[] args) {


        int Stage = 0;

        Team [ ] team = new Team[3];
        team [0] = new Human("Ilon",1000, 2);
        team [1] = new Cat("Lucky",700,4);
        team [2] = new Robot("WALLI",10000, 15);

        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(1);

        start(team, treadmill, wall);
    }

    public static void start(Team [] team, Treadmill treadmill, Wall wall) {
        int Stage;
        do {
            for ( Stage = 1; Stage <=4 ; Stage++) {
                System.out.println("\n" + Stage + " этап начат" );
                treadmill.setRange(treadmill.getRange()*2);
                wall.setHeight(wall.getHeight()*2);
                for (int i = 0; i < 3; i++) {
                    if (team[i].getMaxRange()  < (treadmill.getRange() /2 ) ){
                        continue;
                    }
                    team[i].runTreadmill(treadmill);
                }

                System.out.println("Стена");
                for (int j = 0; j < 3; j++) {
                    if (team[j].getMaxJump() < (wall.getHeight() /2 )) {
                        continue;
                    }
                    team[j].jumpWall(wall);
                }
                System.out.println(Stage + " этап окончен" );
            }
        } while (Stage == 4);

    }
}
