/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Korisnik
 */
public class Product {
    private int ID;
    private String name;
    private int quantity;
    private MeasurementUnit measurementUnit;
    private Manufacturer manufacturer;
    private double priceWithoutVAT;

    public Product() {
    }

    public Product(int ID, String name, int quantity, MeasurementUnit measurementUnit, Manufacturer manufacturer, double priceWithoutVAT) {
        this.ID = ID;
        this.name = name;
        this.quantity = quantity;
        this.measurementUnit = measurementUnit;
        this.manufacturer = manufacturer;
        this.priceWithoutVAT = priceWithoutVAT;
    }

    public double getPriceWithoutVAT() {
        return priceWithoutVAT;
    }

    public void setPriceWithoutVAT(double priceWithoutVAT) {
        this.priceWithoutVAT = priceWithoutVAT;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

  
    
}
