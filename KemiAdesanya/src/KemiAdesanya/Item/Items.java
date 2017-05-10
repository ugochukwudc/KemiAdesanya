/* Copyright (c) Ugochukwu Chukwu
 /* All Rights Reserved
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KemiAdesanya.Item;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Logger;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Ugochukwudouglas
 */
public class Items implements Serializable{
    
    private static String Products;
    private static String Designs;
    private static final Logger LOG = Logger.getLogger(Items.class.getName());
    
    Items(){
        // Initialize Products
        Products = "Cards" +
                    "," + "Hair Ties" +
                    "," + "Jewelry" +
                    "";
        // Initialize designs
        Designs = "Select a Design" + 
                "," + "Plain - PLN" +
                "," + "Peacock - PCK" +
                "," + "Peace - PCE" +
                "," + "Polka Dot : Blue - BPD" +
                "," + "Polka Dot : Red - RPD" +
                "," + "Polka Dot : Black - NPD" +
                "," + "USA Patriot Flag - USF" + 
                "," + "DUECES - DUC"
                + "";
    }
    
    private static final Items Instance = new Items();
    /**
     * Get the value of PriceFormat
     *
     * @return the value of PriceFormat
     */
    public static NumberFormatter getPriceFormat() {
        NumberFormat amount = NumberFormat.getCurrencyInstance(Locale.CANADA);
        amount.setMaximumFractionDigits(2);
        //amount.setMinimumFractionDigits(2);
        NumberFormatter pAmount = new NumberFormatter(amount);
        pAmount.setMinimum(5.00);
        pAmount.setMaximum(1000.00);
        pAmount.setAllowsInvalid(false);
        //pAmount.setCommitsOnValidEdit(true);
        pAmount.setOverwriteMode(true);
        return pAmount;
    }
    
    public static NumberFormatter getNOIFormat(){
        NumberFormat noi = NumberFormat.getNumberInstance();
        noi.setMaximumFractionDigits(0);
        noi.setMaximumIntegerDigits(3);
        noi.setMinimumIntegerDigits(1);
        
        NumberFormatter noif = new NumberFormatter(noi);
        noif.setMinimum(1);
        noif.setMaximum(300);
        noif.setOverwriteMode(true);
        noif.setAllowsInvalid(false);
        return noif;
    }
    
    public static String[] getDesigns() {
        String [] DList = Designs.split(",");
        //Arrays.asList(Designs.split(","));
        return DList;
    }

    public static String[] getProduct_List() {
        String [] Product_List;
        Product_List = Products.split(",");
        return Product_List;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static final Items getInstance() {
        return Instance;
    }
    
}