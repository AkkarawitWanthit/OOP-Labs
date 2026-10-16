package project;

public abstract class Tour {
    private String id;
    private String name;
    private double price;
    private int seat;

    public Tour(String id, String name, double price, int seat){
        this.name = name;
        this.id = id;
        this.price = price;
        this.seat = seat;
    }

    public void setID(String id){
        this.id = id;
    }
    
    public void setPrice(double price){
        this.price = price;
    }

    public void setSeat(int seat ){
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
