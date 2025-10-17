package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City. It includes properties for the city name and province name.
 * @author Eloise Fang
 */
public class City implements Comparable<Object> {
    private String city;
    private String province;

    /**
     * Constructor for the City class.
     * @param city The name of the city.
     * @param province The name of the province where the city is located.
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the city.
     * @return A string representing the city's name.
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Gets the name of the province.
     * @return A string representing the province's name.
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * @param o
     * @return
     * Compares the city names
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Compares this city to another city alphabetically by name for sorting purposes.
     * @param o The other city to compare to.
     * @return An integer value. Negative if this city's name comes before the other,
     *         positive if it comes after, and zero if they are the same.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city1 = (City) o;

        return city.equals(city1.city) && province.equals(city1.province);
    }

    /**
     * @return
     * Returns the hash code for the city
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
