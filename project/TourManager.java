package project;

import java.util.List;
import java.util.ArrayList;

public class TourManager {
    protected List<Tour> tours = new ArrayList<>();

    public  void addTour(Tour t){
        tours.add(t);
    }
    
    public List<Tour> getTours(){
        return tours;
    }

    public Tour findTour (String id){
        for (Tour t : tours){
            if (t.getID().equals(id.trim())){
                return t;
            }
        }
        return  null;
    }

    public String showAll(){
        String send = "";
        for (Tour t : tours){
            send += t.getInfo()+"\n";
        }
        return send;
    }
}
