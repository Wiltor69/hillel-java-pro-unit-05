package hillelgeofigur;

import static java.lang.String.format;

public class Main {

    public static void main(String[] args) {
        AreaFigure circle = new Circle(7.3);
        AreaFigure triangle = new Triangle(5.4,7);
        AreaFigure rectangle = new Rectangle(5,9.5);
        AreaFigure rectangle1 = new Rectangle(6.7, 8.3);

        String cr = String.format("%.2f", circle.areaFigure());
        String tr = String.format("%.2f", triangle.areaFigure());
        String rec = String.format("%.2f", rectangle.areaFigure());
        String rec1 = String.format("%.2f", rectangle1.areaFigure());

        System.out.println("Area of circle is: " + cr);
        System.out.println("Area of triangle is: " + tr);
        System.out.println("Area of rectangle is: " + rec);
        System.out.println("Area of rectangle1 is: " + rec1);

        AreaFigure[] figure = {circle, triangle, rectangle, rectangle1};

         sumTotalArea(figure);

    }
    public static void sumTotalArea(AreaFigure[] figure){

        double sum = 0;

        for (int i =0; i< figure.length; i++){
            sum+=figure [i].areaFigure();

        }
        String f = String.format("%.2f", sum);
        System.out.println("Area total figures is: " + f);
    }
}
