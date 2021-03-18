package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;
import java.util.*;

public class IsoscelesTriangle extends Triangle{
    private int equalSide, differentSide;

    public IsoscelesTriangle(int equalSide, int differentSide){
        this.equalSide=equalSide;
        this.differentSide=differentSide;
    }

    public String getName(){
        return "Triangulo Isosceles";
    }

    public int getSidesCount(){
        return 3;
    }

    public double getPerimeter(){
        return equalSide*2+differentSide;
    }

    public double getArea(){
        return (differentSide*(Math.sqrt((equalSide*equalSide)-((differentSide*differentSide)/4))))/2;
    }
}
