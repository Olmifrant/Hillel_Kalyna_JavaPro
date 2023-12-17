package lesson_005.Hw7.part02;

public class Main {

    public static void main(String[] args) {
        int Stage = 0;

        Team [ ] team = new Team[3];
        team [0] = new Cat("Вискас",700,2);
        team [1] = new Human("Джеки",1000, 1);
        team [2] = new Robot("Утюг",10000, 6);

        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(1);

        playMarathon(team, treadmill, wall);
    }

    public static void playMarathon(Team [ ] team, Treadmill treadmill, Wall wall) {
        int Stage;
        do {
            for ( Stage = 1; Stage <=3 ; Stage++) {
                System.out.println("\n" + Stage + " этап начат" +"\n" );
                treadmill.setRange(treadmill.getRange()*Stage);
                wall.setHeight(wall.getHeight()*Stage);
                for (int i = 0; i < 3; i++) {
                    if (team[i].getMaxRange() < treadmill.getRange()){
                        continue;
                    }
                    team[i].runTreadmill(treadmill);
                }
                for (int j = 0; j < 3; j++) {
                    if (team[j].getMaxJump() < wall.getHeight()) {
                        continue;
                    }
                    team[j].jumpWall(wall);
                }
                System.out.println("\n" + Stage + " этап окончен" );
            }
        } while (Stage == 3);
    }


}
