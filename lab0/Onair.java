package lab0;
public class Onair {
    public static void main(String[] args) {
        Tv t1 = new Tv(1 , 50 , 2.0f , "default");
        System.out.println(" | Channel : "+t1.channel+" | "+"brightness : "+t1.brightness+" | "+"gamma : "+t1.gamma+" | "+"Name : "+t1.name+" | ");
        Tv t2 = new Tv();
        System.out.println(" | Channel : "+t2.channel+" | "+"brightness : "+t2.brightness+" | "+"gamma : "+t2.gamma+" | "+"Name : "+t2.name+" | ");
        Tv t3 = new Tv("Default");
        System.out.println(" | Channel : "+t3.channel+" | "+"brightness : "+t3.brightness+" | "+"gamma : "+t3.gamma+" | "+"Name : "+t3.name+" | ");
    }   
}
