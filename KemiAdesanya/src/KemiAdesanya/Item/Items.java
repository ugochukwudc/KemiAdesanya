/* Copyright (c) Ugochukwu Chukwu
 /* All Rights Reserved
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KemiAdesanya.Item;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author Ugochukwudouglas
 */
public class Items implements Serializable{
    
    private static final String Products = "Cards" +
                                            "," + "Hair Ties" +
                                            "," + "Jewelry" +
                                            "";
    
    private static final Logger LOG = Logger.getLogger(Items.class.getName());
    
    private static final Items Instance = new Items();


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
