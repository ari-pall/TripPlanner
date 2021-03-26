package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataFactory {
    public DataFactory(){
    }
    public ObservableList<TravelPackage> getTravelPackages(){
        ObservableList<TravelPackage> travelPackages = FXCollections.observableArrayList();
        ObservableList<Tour> tours = getTours();
        ArrayList<Flight> flights = getFlights();
        ArrayList<Hotel> hotels = getHotels();
        TravelPackage travelPackage1 = new TravelPackage(hotels.get(0),flights.get(0),tours.get(0));
        TravelPackage travelPackage2 = new TravelPackage(hotels.get(1),flights.get(1),tours.get(1));
        TravelPackage travelPackage3 = new TravelPackage(hotels.get(2),flights.get(2),tours.get(2));
        travelPackages.add(travelPackage1);
        travelPackages.add(travelPackage2);
        travelPackages.add(travelPackage3);
        return travelPackages;
    }
    public ObservableList<Tour> getTours(){
        ObservableList<Tour> tours = FXCollections.observableArrayList();

        LocalDate d1 = LocalDate.of(2021,4,1);
        LocalDate d2 = LocalDate.of(2021,4,5);
        LocalDate d3 = LocalDate.of(2021,5,11);
        LocalDate d4 = LocalDate.of(2021,5,21);
        LocalDate d5 = LocalDate.of(2021,6,4);
        LocalDate d6 = LocalDate.of(2021,6,16);
        LocalDate d7 = LocalDate.of(2021,7,10);
        LocalDate d8 = LocalDate.of(2021,7,11);
        LocalDate d9 = LocalDate.of(2021,8,7);
        LocalDate d10 = LocalDate.of(2021,8,24);


        Tour tour1 = (new Tour( "Horseriding in Eyjafjörður","Bring warm clothes",d1, 10,10000,
                "Akureyri",7,"Family friendly"));
        tour1.setTourID(1);
        tours.add(tour1);
        Tour tour2= (new Tour( "Buggy Tour in Rauðhólar","Children must be under parent supervision",
                d2,20,20000, "Reykjavík",5, "Action"));
        tour2.setTourID(2);
        tours.add(tour2);
        Tour tour3=(new Tour( "Kajaking in Lagarfljót","Bring warm clothes, you could get wet.",d3,10,15000,
                "Egilsstaðir", 3, "Family friendly"));
        tour3.setTourID(3);
        tours.add(tour3);
        Tour tour4=(new Tour( "Walk around Skaftafell","Bring warm clothes and packed lunch.",d4,50,20000,
                "Reykjavík", 15, "Family friendly"));
        tour4.setTourID(4);
        tours.add(tour4);
        Tour tour5=(new Tour( "Diving in Silfra","Bring dry clothes.",d5,25,18000,
                "Reykjavík", 6, "Action"));
        tour5.setTourID(5);
        tours.add(tour5);
        Tour tour6=(new Tour( "Snowmobil trip","Bring warm clothes.",d6,15,25000,
                "Ísafjörður", 6, "Action"));
        tour6.setTourID(6);
        tours.add(tour6);
        Tour tour7 = (new Tour( "Walk around Reykjavík","Come dressed according to weather.",d7, 25,7000,
                "Reykjavík",2, "Wheelchair accessible"));
        tour1.setTourID(7);
        tours.add(tour7);
        Tour tour8 = (new Tour( "Biking around Þingvellir","Bring warm clothes. Bikes are available for rent.",d8, 15,10000,
                "Reykjavík",8, "Family friendly"));
        tour1.setTourID(8);
        tours.add(tour8);
        Tour tour9 = (new Tour( "Skiing in Hlíðarfjall","Skiing accuipment is available for rent",d9, 20,15000,
                "Akureyri",5, "Action"));
        tour1.setTourID(9);
        tours.add(tour9);

        return tours;
    }

    public ArrayList<Flight> getFlights(){
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Reykjavík","Akureyri","02/03/21" , "12/03/21",  23900));
        flights.add(new Flight("Reykjavík","Ísafjörður","03/03/21" , "14/03/21",  22900));
        flights.add(new Flight("Akureyri","Reykjavík","12/03/21" , "17/03/21",  25900));
        return flights;
    }
    public ArrayList<Hotel> getHotels(){
        ArrayList<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel("Hótel Edda", "Akureyri", "www.edda.is", 4, 12000));
        hotels.add(new Hotel("Hótel Ísafjörður", "Ísafjörður", "www.hotelis.is", 3, 10000));
        hotels.add(new Hotel("Fosshótel", "Reykjavík", "fosshotel.is", 3, 12000));
        return hotels;
    }
}
