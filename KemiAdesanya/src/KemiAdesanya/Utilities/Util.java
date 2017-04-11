/* Copyright (c) Ugochukwu Chukwu
 /* All Rights Reserved
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KemiAdesanya.Utilities;

/**
 *
 * @author Ugochukwudouglas
 */
public class Util {
    
    public static void switchFrames(javax.swing.JFrame fromFrame, javax.swing.JFrame toFrame)
    {
        // Switch between fromFrame --> toFrame
        fromFrame.setVisible(false);
        toFrame.setVisible(true);
    }
    
}
