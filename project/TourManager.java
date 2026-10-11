package project;

import java.util.List;
import java.util.ArrayList;

public class TourManager {
    protected List<Tour> tours = new ArrayList<>();

    public  void addTour(Tour t){
        addTour(t);
    }

    public Tour findTour (String id){
        for (Tour t : tours){
            if (t.getID()==id){
                return t;
            }
        }
        return  null;
    }

    public String showAll(){
        String send = "";
        for (Tour t : tours){
            send += t.getInfo()+"/n";
        }
        return send;
    }
}
