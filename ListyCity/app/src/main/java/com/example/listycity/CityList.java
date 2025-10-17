package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects.
 * It provides methods to add, retrieve, and check for the existence of cities.
 * @author Eloise Fang
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * Candidate city to add
     * @throws IllegalArgumentException
     * This is thrown if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities. The list is sorted alphabetically
     * based on the city name.
     * @return Returns a sorted List of City objects.
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if a given city exists in the list.
     * @param city The city to check for in the list.
     * @return Returns true if the city is found in the list, and false otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes a city from the list.
     * @param city The city to remove.
     * @throws IllegalArgumentException If the city does not exist in the list.
     */

    public void delete(City city) {
        if(!cities.contains(city))
            throw new IllegalArgumentException("City does not exist");
        cities.remove(city);
    }

    /**
     * Gets the number of cities in the list.
     * @return Number of cities in the list.
     */

    public int countCities() {
        return cities.size();
    }
}
