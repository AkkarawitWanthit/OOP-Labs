package lab0;
public class Garage {
    public static void main(String[] args){
        Car car1 = new Car("Black");
        // get values of car attributes
        int s = car1.speed;
        Car car2 = new Car("Blue");
        String c = car1.color;
        String c2 = car2.color;
        double w = car2.weight;
        System.out.println(s);
    }
}
