package lab4;

public class EquilateralTraingle implements Triangle {
    private double side;

    public EquilateralTraingle(double side){
        this.side = side;
    }
    @Override 
    public  double getLongestSideLength(){
        return side;
    }

    @Override 
    public double getPerimeter(){
        return  side*3;
    }

    @Override 
    public double getLargestAngle(){
        return 60.0;
    }
}
