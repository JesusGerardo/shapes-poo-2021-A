package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;
import java.util.*;

public class TriangleEquilatero extends Triangle {
    private int side;

    public TriangleEquilatero(int side) {
        this.side = side;
    }

    public String getName(){
        return "Triangulo Equilatero";
    }

    public int getSidesCount(){
        return 3;
    }

    public double getPerimeter(){
        return side*3;
    }

    public double getArea(){
        return (Math.sqrt(3)/4)*(side*side);
    }
}
