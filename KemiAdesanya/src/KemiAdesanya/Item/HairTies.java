/* Copyright (c) Ugochukwu Chukwu
 /* All Rights Reserved
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KemiAdesanya.Item;

import java.io.Serializable;
import java.awt.*;


/**
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

    public HairTies(char type, String design, boolean uniform, double price, int numberofItems, String Description) {
        super("Hair-Ties", price, numberofItems, Description);
        this.type = type;
        this.design = design;
        this.uniform = uniform;
    }

    public HairTies(char type, String design, boolean uniform, double price, int numberofItems, String Description, int uniqueID) {
        super("Hair-Ties", price, numberofItems, Description, uniqueID);
        this.type = type;
        this.design = design;
        this.uniform = uniform;
    }
    
    
    private String genSKU(){
        String ret;
        ret = "HT"
                + "-" + this.type
                + "-" + this.design.charAt(0);
        // if all entries are uniform
        if (this.uniform){
            ret = ret + "-" + this.getNumberofItems();
        }
        
        return ret;
    }
    /**
     * 
     * @return tab delimited string of Products SKU, description and Price 
     */
    public String toExcel(){
        char tab = '\t';
        String ret;
        
        ret = this.getSKU()
                + tab
                + this.getDescription()
                + tab
                + this.dispPrice();
        return ret;
        
    }
    
}
