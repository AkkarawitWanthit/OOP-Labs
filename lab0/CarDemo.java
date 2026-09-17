package lab0;
public class CarDemo {
public static void main(String[] args) {
// default constructor
    Car a = new Car("Green");
    Car b = new Car("Blue",100);
    int speedA = a.speed;
    System.out.println(speedA); // = ?
    System.out.println(b.speed); // = ?
    System.out.println(a.color); // = ?
    System.out.println(a.weight); // = ?
}
} 
