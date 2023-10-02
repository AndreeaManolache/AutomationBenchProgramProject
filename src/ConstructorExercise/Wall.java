package ConstructorExercise;

public class Wall {
    double width;
    double height;
    double area;

    public Wall(double i, double j) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        area=this.width * this.height;
        return area;
    }
}
