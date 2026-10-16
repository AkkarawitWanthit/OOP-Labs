package project;

public final class InternationalTour extends Tour {
    private double visaFee;

    public InternationalTour (String id , String name , double price , int seat , double visaFee){
        super(id, name, price, seat);
        this.visaFee = visaFee;
    }

    public double calculatePrice(){
        return getPrice()+visaFee;
    }

    public String getInfo(){
        return super.getInfo()+" | International, Visa Fee "+visaFee; 
    }
}
