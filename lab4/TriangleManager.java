package lab4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TriangleManager {
    private List<Triangle> triangles;

    public TriangleManager (boolean useArray){
        if(useArray){
            triangles = new ArrayList<>();
        }
        else{
            triangles = new LinkedList<>();
        }
    }

    public void addTriangle(Triangle t){
        if(t==null){
            System.out.println("Tringle cannot be null");
        }
        else{
            triangles.add(t);
        }
    }

    public Triangle findTriangleWithLargestPerimeter(){
        Triangle largest = triangles.get(0);

        for (Triangle t : triangles){
            if (t.getPerimeter() > largest.getPerimeter()){
                largest = t;
            }
        }
        return largest;
    }
}
