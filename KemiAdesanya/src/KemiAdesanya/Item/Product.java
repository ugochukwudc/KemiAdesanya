/* Copyright (c) Ugochukwu Chukwu
 /* All Rights Reserved
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KemiAdesanya.Item;

import java.text.NumberFormat;

/**
 * Product parent super class
 * This class hold properties of all items, like SKU, Name, price, etc
 * Would be used to create sub classes for products like Jewelry, Hair Ties, etc
 * @author Ugochukwudouglas
 * 
 */
public abstract class Product {
    private final String SKU;
    private final int numberofItems;
    private String Name;
    private double price;
    private String Description;
    private final int uniqueID;

    /**
     *
     * @param Name product name : hair Ties, jewelry, 
     * @param price
     * @param Description
     * @param numberofItems
     */
    public Product(String Name, double price, int numberofItems, String Description) {
        this.Name = Name;
        this.price = price;
        this.Description = Description;
        this.numberofItems = numberofItems;
        this.uniqueID = genUniqueID();
        this.SKU = this.genSKU();
    }
    
    public Product(String Name, double price, int numberofItems, String Description, int uniqueID) {
        this.numberofItems = numberofItems;
        this.Name = Name;
        this.price = price;
        this.Description = Description;
        this.uniqueID = uniqueID;
        this.SKU = this.genSKU();
    }
    
    
    /**
     *  No arguments constructor for Product
     */
    public Product() {
        this.Name="Hair Ties";
        this.price=0.0;
        this.numberofItems=4;
        this.Description="Plain Hair Ties";
        this.uniqueID= genUniqueID();
        this.SKU= this.genSKU();
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
     * @return Generated SKU, using class parameters
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

    public int getNumberofItems() {
        return numberofItems;
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
    
    public String dispPrice(){
        String P;
        P = NumberFormat.getCurrencyInstance().format(price);
        P = P + " CAD"; // optional
        
        return P;
    }
}
