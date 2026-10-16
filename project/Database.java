package project;

public class Database {
    public static TourManager manager = new TourManager();

    static {
        manager.addTour(new DomesticTour("T01", "ChiangRai 3D2N", 5900, 20, "Bus"));
        manager.addTour(new DomesticTour("T02", "Phuket 4D3N", 8900, 12));
        manager.addTour(new InternationalTour("T03", "Japan Tokyo 5D4N", 35900, 20 , 1500));
        manager.addTour(new InternationalTour("T04", "Korea Seoul 5D3N", 25900, 20 , 1200));
    }
}
