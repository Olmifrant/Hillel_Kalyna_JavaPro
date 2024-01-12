package lesson_010.Hw_12;

public class Main {

    public static void main(String[] args) {

        FileNavigator navigator = new FileNavigator();

        int size = 10;

        for (int i = 0; i < size; i++) {

            String pat = null;
            String nam01 = null;
            String nam02 = null;


            int siz = 0;
                int n = (int) ((Math.random() * 5) +1);
                switch (n){
                    case 1: pat = ("D://Media//Photo//2019//"); break;
                    case 2: pat = ("D://Media//Photo//2020//"); break;
                    case 3: pat = ("D://Media//Photo//2021//"); break;
                    case 4: pat = ("D://Media//Photo//2022//"); break;
                    case 5: pat = ("D://Media//Photo//2023//"); break;
                }
                int k = (int) ((Math.random() * 5) +1);
                switch (k){
                    case 1: nam01 = ("Миконос"); break;
                    case 2: nam01 = ("Крит"); break;
                    case 3: nam01 = ("Тинос"); break;
                    case 4: nam01 = ("Ираклия"); break;
                    case 5: nam01 = ("Халки"); break;
                }

//            int f = (int) ((Math.random() * 5) +1);
//            switch (f){
//                case 1: nam02 = ("01"); break;
//                case 2: nam02 = ("02"); break;
//                case 3: nam02 = ("03"); break;
//                case 4: nam02 = ("04"); break;
//                case 5: nam02 = ("05"); break;
//            }

            int f = (int) ((Math.random() * 100));
                nam02 = String.valueOf(f);



            String nam = nam01+nam02;

                siz =  (int) (((Math.random() * 1000) + 2000)) ;

            //System.out.println(nam + siz + pat);
            navigator.add(nam, siz, pat);

        }


        navigator.print();

    }
}
