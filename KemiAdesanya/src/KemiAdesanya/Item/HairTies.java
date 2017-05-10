/* Copyright (c) Ugochukwu Chukwu
 /* All Rights Reserved
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KemiAdesanya.Item;

import java.io.Serializable;
import java.util.Objects;


/**
 * Hair Ties class used to create Hair Tie objects as a product
 * The class is made serializable to allow saving and reading objects to file
 * 
 * @author Ugochukwudouglas
 */
public class HairTies extends Product implements Serializable{
    
    private final char type; // Single or BULK
    private final String design; // Plain, Peace, Peacock
    private final boolean uniform; // uniform collection, or not

    @Override
    public String toString(){
        String ret;
        ret = this.getSKU();
        ret = ret + " : " ;
        ret = ret + this.getDescription();
        return ret;
    }
    
    /**
     *
     */
    public HairTies() {
        this.type = 'S';
        this.design = "PLAIN";
        this.uniform = true;
    }
    
    /**
     *
     * @param type
     * @param design
     * @param uniform
     * @param price
     * @param numberofItems
     * @param Description
     */
    public HairTies(char type, String design, boolean uniform, double price, int numberofItems, String Description) {
        super(price, numberofItems, Description);
        this.type = type;
        this.design = design.toUpperCase();
        this.uniform = uniform;
        this.setSKU(this.genSKU());
    }

    /**
     * Main Constructor for HairTies
     * @param type
     * @param design
     * @param uniform
     * @param price
     * @param numberofItems
     * @param Description
     * @param uniqueID
     */
    public HairTies(char type, String design, boolean uniform, double price, int numberofItems, String Description, int uniqueID) {
        super(price, numberofItems, Description, uniqueID);
        this.type = type;
        this.design = design.toUpperCase();
        this.uniform = uniform;
        this.setSKU(this.genSKU());
    }
    
    private String genSKU(){
        String ret;
        ret = "HT"
                + "-" + this.type + this.getNumberofItems()
                + "-" + this.design.substring(0, 3);
        // if all entries are uniform
        if (this.uniform){
            ret = ret + "-" + this.getNumberofItems();
        }
        ret = ret + "-" + this.getUniqueID();
        return ret;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.type;
        hash = 89 * hash + Objects.hashCode(this.design);
        hash = 89 * hash + (this.uniform ? 1 : 0);
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
        final HairTies other = (HairTies) obj;
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.design, other.design)) {
            return false;
        }
        if (this.uniform != other.uniform) {
            return false;
        }
        return true;
    }
    
    
}

