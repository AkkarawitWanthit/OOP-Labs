package project;

public class InternationalTour extends Tour {
    protected double visaFee;

    public InternationalTour (String id , String name , double price , int seat){
        super(id, name, price, seat);
    }

    public double calculatePrice(){
        return getPrice()+visaFee;
    }
}
