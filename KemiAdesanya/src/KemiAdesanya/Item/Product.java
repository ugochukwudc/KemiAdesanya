/* Copyright (c) Ugochukwu Chukwu
 /* All Rights Reserved
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KemiAdesanya.Item;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * Product parent/super class
 * This class hold properties of all items, like SKU, Name, price, etc
 * Would be used to create sub classes for products like Jewelry, Hair Ties, etc
 * @author Ugochukwudouglas
 * 
 */
public abstract class Product implements Serializable{
    private static final Logger LOG = Logger.getLogger(Product.class.getName());
    private final int numberofItems;
    private final String Name;
    private final int uniqueID;
    private String SKU;
    private String Description;
    private double price;
    /**
     * 
     * @param price
     * @param Description
     * @param numberofItems
     */
    public Product(double price, int numberofItems, String Description) {
        this.price = price;
        this.Description = Description;
        this.numberofItems = numberofItems;
        this.uniqueID = genUniqueID();
        this.SKU = this.genSKU();
        this.Name = this.getClass().getSimpleName();
    }
    
    public Product(double price, int numberofItems, String Description, int uniqueID) {
        this.Name = this.getClass().getSimpleName();
        this.numberofItems = numberofItems;
        this.price = price;
        this.Description = Description;
        this.uniqueID = uniqueID;
        this.SKU = this.genSKU();
    }
    
    
    /**
     *  No arguments constructor for Product
     */
    public Product() {
        this.Name = this.getClass().getSimpleName();
        this.price=6.00;
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
    public String getName(){
        return Name;
    }
    /**
     *
     * @param SKU
     */
    protected void setSKU(String SKU) {
        this.SKU = SKU;
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
        int MAX = 1001;
        int min = 1;
        int ret;
        ret = (int) (Math.random()*(MAX-min)) + min;
        return ret;
    }

    public int getNumberofItems() {
        return numberofItems;
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
    
    /**
     * Returns String comprising of the SKU, 
     * description and Currency formatted price of the product 
     * This will be called when printing the list of products to an excel
     * spreadsheet.
     * @return tab delimited string of Products SKU, description and Price
     * For example, it can return:
     * HT-SP5-3B2N   Plain Hair Ties - 5 Ties, 3 Blue 2 Black   $7.25 CAD
     */
    public String toExcel(){
        char tab = '\t';
        String ret;
        
        ret = this.getSKU()
                + tab
                + this.getDescription()
                + tab
                + this.price;
            //    + this.dispPrice();
        return ret;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.numberofItems;
        hash = 17 * hash + Objects.hashCode(this.Name);
        hash = 17 * hash + this.uniqueID;
        hash = 17 * hash + Objects.hashCode(this.SKU);
        hash = 17 * hash + Objects.hashCode(this.Description);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.SKU, other.SKU)) {
            return false;
        }
        return true;
    }
    
    public boolean search(){
        
        return true;
    }

}