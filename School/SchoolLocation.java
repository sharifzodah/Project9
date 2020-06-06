package School;

import java.util.ArrayList;

public class SchoolLocation {

    /*
  Create 3 private instance variables
  String price and location
  Static String ArrayList locationList
   */
    private String price;
    private String location;
    private static ArrayList<String> locationList = new ArrayList<>();

       /*
    Create a constructor
        Parameter string location


        call three methods

        addLocation
        setSchoolLocation
        setPrice
     */

    public SchoolLocation(String location) {
        addLocation();
        setLocation(location);
        setPrice(location);
    }
 /*
    create a setPrice Method

            if the location is USA
                price should be $8000
            if the location is England
                price should be $6500
            if the location is France
                price should be $7200
            if the location is Germany
                price should be $7000
            if the location is Canada
                price should be $7500

            if the location is non of these then throw an exception  --> "This is not a valid location"

     */

    public void setPrice(String newLocation) {
        if (newLocation.equalsIgnoreCase("USA")) {
            this.price = "$8000";
        } else if (newLocation.equalsIgnoreCase("England")) {
            this.price = "$6500";
        } else if (newLocation.equalsIgnoreCase("France")) {
            this.price = "$7200";
        } else if (newLocation.equalsIgnoreCase("Germany")) {
            this.price = "$7000";
        } else if (newLocation.equalsIgnoreCase("Canada")) {
            this.price = "$7500";
        } else {
            throw new RuntimeException("This is not a valid location");
        }
    }
/*
    Create a get method for price
     */
        public String getPrice() {
            return price;
        }

      /*
    Create a public static method name is addLocation
        no return type
        add USA , England , France , Germany , Canada
             to
        ArrayList locationList
     */
public static void addLocation(){
    locationList = new ArrayList<>();
    locationList.add("USA");
    locationList.add("England");
    locationList.add("France");
    locationList.add("Germany");
    locationList.add("Canada");

}

    public void setLocation(String location) {
        this.location = location;
    }

/*
    Create a get method for the locationList
     */

    public static ArrayList<String> getLocationList() {
        return locationList;
    }
/*
    Create a set method for the locationList
    no return type
    one parameter String SchoolLocation
    Create an String ArrayList name is listOfLocations is equal to the get method of the locationList

    If the locationList contains SchoolLocation
    then instance variable location is equal to  SchoolLocation parameter

     If the locationList does NOT contains SchoolLocation parameter
     then throw a RunTimeException ("Location should be one of the following " +listOfLocations)
     */

    public void locationList(String SchoolLocation) {
        ArrayList<String> listOfLocations = getLocationList();
        if (listOfLocations.contains(SchoolLocation)){
             setLocation(SchoolLocation);
        }else {
            throw new RuntimeException("Location should be one of the following " +listOfLocations);
        }
    }
/*
    Create a get method for the location
     */

    public String getLocation() {
        return location;
    }
}


