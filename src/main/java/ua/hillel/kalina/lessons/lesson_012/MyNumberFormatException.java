package ua.hillel.kalina.lessons.lesson_012;

class MyNumberFormatException extends CustomException  {

    MyNumberFormatException (char st){

        super(String.format("Символ "  + st +  " не является числои"));

    }
}
