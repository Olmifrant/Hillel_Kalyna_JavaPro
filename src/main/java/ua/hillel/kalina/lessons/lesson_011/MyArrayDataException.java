package ua.hillel.kalina.lessons.lesson_011;

public class MyArrayDataException extends CustomException {


    MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные находятся в ячейке [%d, %d]\n", row, col));
    }

}
