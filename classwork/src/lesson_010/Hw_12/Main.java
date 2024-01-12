package lesson_010.Hw_12;

public class Main {


    public static void main(String[] args) {

        FileNavigator navigator = new FileNavigator();
        int size = 10;
        for (int i = 0; i < size; i++) {

            String pat = null;
            String nam = null;
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
                    case 1: nam = ("Миконос"); break;
                    case 2: nam = ("Крит"); break;
                    case 3: nam = ("Тинос"); break;
                    case 4: nam = ("Ираклия"); break;
                    case 5: nam = ("Халки"); break;
                }
                siz =  (int) (((Math.random() * 1000) + 2000)) ;

                navigator.add(pat, nam, siz);

            }


        navigator.find();

        }
    }

