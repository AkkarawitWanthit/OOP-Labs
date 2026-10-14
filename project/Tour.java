package project;

public abstract class Tour {
    protected String id;
    protected String name;
    protected double price;
    protected int seat;
    protected String transport;

    public Tour(String id, String name, double price, int seat){
        this.name = name;
        this.id = id;
        this.price = price;
        this.seat = seat;
    }

    public String getID(){
        return  id;
    }

    public double getPrice (){
        return price;
    }

    public String getName(){
        return name;
    }

    public boolean book(int people){
        if(people>0&&people<=seat){
            seat-=people;
            return true;
        }
        return false;
    }

    public abstract double calculatePrice();

    public String getInfo(){
        return id+" "+name+" "+calculatePrice()+" baht, seats left: "+seat;
    }
}
