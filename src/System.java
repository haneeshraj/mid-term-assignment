
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hanee
 */
public class System {
    private ArrayList<City> ListOfCities;
    
    

    public System() {
        this.ListOfCities = new ArrayList<>();
        initCityData();

    }
    
     public City mockCity(String cityName, String postalCode, ArrayList<Community> communities) {
        City newCity = new City("","");
        newCity.setCityName(cityName);
        newCity.setPostalCode(postalCode);

        newCity.setCommunityDirectory(communities);
        java.lang.System.out.println(newCity);

        return newCity;
    }
     
     public Community mockCommunity(String name) {
        Community community = new Community();
        community.setCommunityName(name);
        return community;
    }
     
     
    public ArrayList<City> getListOfCities() {
        return ListOfCities;
    }
     
    public void setListOfCities(ArrayList<City> rootCityDirectory) {
        this.ListOfCities = rootCityDirectory;
    }
    
    public void addListOfCities(City city) {
        this.ListOfCities.add(city);
    }

    public void deleteListOfCities(City city) {
        this.ListOfCities.remove(city);
    }
    

    private void initCityData() {
        ArrayList<Community> torontoCommunityList = new ArrayList<>();
        ArrayList<Community> vancouverCommunityList = new ArrayList<>();

        Community torontoCommunity1 = mockCommunity("Etobicoke");
        Community torontoCommunity2 = mockCommunity("North York");
        Community vancouverCommunity1 = mockCommunity("Downtown");
        Community vancouverCommunity2 = mockCommunity("Fairview");
        torontoCommunityList.add(torontoCommunity1);
        torontoCommunityList.add(torontoCommunity2);
        vancouverCommunityList.add(vancouverCommunity1);
        vancouverCommunityList.add(vancouverCommunity2);

        City newCity1 = mockCity("Toronto", "M4Y 2W1", torontoCommunityList);
        City newCity2 = mockCity("Vancouver", "V5K 0A1", vancouverCommunityList);
        addListOfCities(newCity1);
        addListOfCities(newCity2);
    }
}

