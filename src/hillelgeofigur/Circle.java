package hillelgeofigur;

public class Circle implements AreaFigure{
     private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaFigure() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }
}
