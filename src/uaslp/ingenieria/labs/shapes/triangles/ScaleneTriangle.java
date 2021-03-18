package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;
import java.util.*;

public class ScaleneTriangle extends Triangle{
    private int side1, side2, side3;

    public ScaleneTriangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String getName(){
        return "Triangulo Escaleno";
    }

    public int getSidesCount(){
        return 3;
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public double getArea(){
        return Math.sqrt(((side1+side2+side3)/2)*(((side1+side2+side3)/2)-side1)*(((side1+side2+side3)/2)-side2)*(((side1+side2+side3)/2)-side3));
    }
}
