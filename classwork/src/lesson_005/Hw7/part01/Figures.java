package lesson_005.Hw7.part01;

public class Figures implements AreaFigures {

    private int side1;
    private int side2;
    private int side3;


    public Figures(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Figures(int side1) {
        this.side1 = side1;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    public double areaCircle() {
        double areaCircle =  (Math.PI*(Math.pow(getSide1(), 2)));
        return areaCircle;
    }

    @Override
    public double areaTriangle() {
        double hP = (double) (side1 + side2 + side3) / 2;
        double areaTriangle = Math.sqrt(hP *(hP - side1) * (hP -side2) * (hP - side3)) ;
        return  areaTriangle;
    }

    @Override
    public double areaSquare() {
        double  areaSquare =  Math.pow(getSide1(), 2);
        return areaSquare;
    }

    @Override
    public double areaAllFigures() {
        return areaCircle() + areaTriangle() +areaSquare();
    }

}
