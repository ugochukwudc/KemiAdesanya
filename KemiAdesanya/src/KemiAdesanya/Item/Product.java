/* Copyright (c) Ugochukwu Chukwu
 /* All Rights Reserved
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KemiAdesanya.Item;

/**
 * Product parent super class
 * This class hold properties of all items, like SKU, Name, price, etc
 * Would be used to create sub classes for products like Jewelry, Hair Ties, etc
 * @author Ugochukwudouglas
 * 
 */
public abstract class Product {
    private final String SKU;
    private String Name;
    private double price;
    private String Description;
    private final int uniqueID;

    /**
     *
     * @param Name product name : hair Ties, jewelry, 
     * @param price
     * @param Description
     * @param uniqueID
     */
    public Product(String Name, double price, String Description, int uniqueID) {
        this.Name = Name;
        this.price = price;
        this.Description = Description;
        this.uniqueID = uniqueID;
        this.SKU=genSKU();
    }
    
    /**
     *  No arguments constructor for Product
     */
    public Product() {
        this.Name="Hair Ties";
        this.price=0.0;
        this.Description="Plain Hair Tie";
        this.uniqueID= genUniqueID();
        this.SKU= genSKU();
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Product{" + "SKU=" + SKU + ", Name=" + Name + ", price=" + price + ", Description=" + Description + ", uniqueID=" + uniqueID + '}';
    }
    
    

    /**
     *
     * @return SKU
     */
    public String getSKU() {
        return SKU;
    }

    /**
     * @return Generated SKU, using class's parameters
     */
    private String genSKU() {
        return "Generated SKU";
    }
    
    /**
     * 
     * @return A unique integer generated for each item
     */
    private int genUniqueID() {
        return 1001;
    }
    

    /**
     *
     * @return
     */
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    
    
    
}
