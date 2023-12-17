package lesson_005.Hw7.part01;

public class Main {

    public static void main(String[] args) {

        Figures[] figures = new Figures[4];
        figures[0] = new Figures(11);                                      //  круг
        figures[1] = new Figures(12,12,15);     //  треугольник,
        figures[2] = new Figures(12);                                      //  квадрат

        double areaCircle = 0;
        double areaTriangle = 0;
        double areaSquare = 0;

        for(int i = 0; i < figures.length; i++){
            if(i == 0){
                areaCircle = figures[i].areaCircle();
                System.out.println("Площадь круга: " + areaCircle);
            }else if(i == 1){
                areaTriangle = figures[i].areaTriangle();
                System.out.println("Площадь треугольника: " + areaTriangle);
            }else if(i == 2){
                areaSquare = figures[i].areaSquare();
                System.out.println("Площадь квадрата: " + areaSquare);

            }else if(i == 3){
                double result = areaCircle + areaTriangle + areaSquare;
                System.out.println("Общая площадь фигур: " + result);
            }
        }

    }
}
