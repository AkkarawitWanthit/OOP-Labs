package project;

public final class DomesticTour extends Tour {
    private String transport;

    public DomesticTour(String id , String name ,double price , int seat , String transport ){
        super(id, name, price, seat);
        this.transport = transport;
    }
    
    public DomesticTour(String id , String name ,double price , int seat){
        super(id, name, price, seat);
        this.transport = "Van";
    }

    public String getTransport(){
        return transport;
    }

    public void setTransport(String transport){
        this.transport = transport;
    }
    
    public double calculatePrice(){
        return getPrice();
    }

    public String getInfo(){
        return super.getInfo()+" | Demestic by "+transport; 
    }
}
