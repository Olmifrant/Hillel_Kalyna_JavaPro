package ua.hillel.kalina.lessons.lesson_012;

public class Fonts {



    static int sise = 0;
    String[] rezult = new String[sise];


    public String[] nul () {

        String string =
               "   /$$$$$$ \n" +
                       "  /$$$_  $$\n" +
                       " | $$$$\\ $$\n" +
                       " | $$ $$ $$\n" +
                       " | $$\\ $$$$\n" +
                       " | $$ \\ $$$\n" +
                       " |  $$$$$$/\n" +
                       "  \\______/ ";

        return string.split("\n");
    }

    public String[] one (){

        String string =
               "    /$$  \n" +
                       "  /$$$$  \n" +
                       " |_  $$  \n" +
                       "   | $$  \n" +
                       "   | $$  \n" +
                       "   | $$  \n" +
                       "  /$$$$$$\n" +
                       " |______/";

        return string.split("\n");
    }


    public String[] two (){

        String string =
               "   /$$$$$$ \n" +
                       "  /$$__  $$\n" +
                       " |__/  \\ $$\n" +
                       "   /$$$$$$/\n" +
                       "  /$$____/ \n" +
                       " | $$      \n" +
                       " | $$$$$$$$\n" +
                       " |________/";

        return string.split("\n");
    }


    public String[] three (){

        String string =
              "   /$$$$$$ \n" +
                      "  /$$__  $$\n" +
                      " |__/  \\ $$\n" +
                      "    /$$$$$/\n" +
                      "   |___  $$\n" +
                      "  /$$  \\ $$\n" +
                      " |  $$$$$$/\n" +
                      "  \\______/ ";

        return string.split("\n");
    }


    public String[] four (){

        String string =
              "  /$$   /$$\n" +
                      " | $$  | $$\n" +
                      " | $$  | $$\n" +
                      " | $$$$$$$$\n" +
                      " |_____  $$\n" +
                      "       | $$\n" +
                      "       | $$\n" +
                      "       |__/";

        return string.split("\n");
    }

    public String[] five (){

        String string =
              "  /$$$$$$$ \n" +
                      " | $$____/ \n" +
                      " | $$      \n" +
                      " | $$$$$$$ \n" +
                      " |_____  $$\n" +
                      "  /$$  \\ $$\n" +
                      " |  $$$$$$/\n" +
                      "  \\______/ ";

        return string.split("\n");
    }

    public String[] six (){

        String string =
              "   /$$$$$$ \n" +
                      "  /$$__  $$\n" +
                      " | $$  \\__/\n" +
                      " | $$$$$$$ \n" +
                      " | $$__  $$\n" +
                      " | $$  \\ $$\n" +
                      " |  $$$$$$/\n" +
                      "  \\______/ ";

        return string.split("\n");
    }

    public String[] seven (){

        String string =
              "  /$$$$$$$$\n" +
                      " |_____ $$/\n" +
                      "      /$$/ \n" +
                      "     /$$/  \n" +
                      "    /$$/   \n" +
                      "   /$$/    \n" +
                      "  /$$/     \n" +
                      " |__/      ";

        return string.split("\n");
    }


    public String[] eight (){

        String string =
             "   /$$$$$$ \n" +
                     "  /$$__  $$\n" +
                     " | $$  \\ $$\n" +
                     " |  $$$$$$/\n" +
                     "  >$$__  $$\n" +
                     " | $$  \\ $$\n" +
                     " |  $$$$$$/\n" +
                     "  \\______/ ";

        return string.split("\n");
    }

    public String[] nine (){

        String string =
              "   /$$$$$$ \n" +
                      "  /$$__  $$\n" +
                      " | $$  \\ $$\n" +
                      " |  $$$$$$$\n" +
                      "  \\____  $$\n" +
                      "  /$$  \\ $$\n" +
                      " |  $$$$$$/\n" +
                      "  \\______/ ";

        return string.split("\n");
    }


    public void output (String[] mass){

        String[] out = new String[8];

        if (sise == 0){
            sise = 8;
            out = mass;
        }else {
            for (int i = 0; i < out.length; i++) {
                out[i] = rezult[i]+mass[i];
            }
        }
        rezult = out;
    }
}
