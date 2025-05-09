package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private List<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return this.inventory;
    }

    public List<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {
        return null;
    }
    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }
    public List<Vehicle> getVehiclesByYear(int minYear, int maxYear) {
        return null;
    }
    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }
    public void removeVehicle(Vehicle vehicle) {
    }

}
