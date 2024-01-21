package ua.hillel.kalina.lessons.lesson_12;

class MyNumberFormatException extends CustomException  {

    MyNumberFormatException (char st){

        super(String.format("Символ "  + st +  " не является числои"));

    }
}
