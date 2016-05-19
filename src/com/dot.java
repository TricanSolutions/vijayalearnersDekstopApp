/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Lasitha Ranawaka
 */
public class dot {
     public static String InputDot2Mysql(String urtext){
    
        String r="";
        
        try {
           r=urtext.replaceAll("'","G1" );
        } catch (Exception e) {
            System.out.println(" Error in charactor Dot");
        }
         return  r;
    }
    
    public static String GetDotfromMysql(String Dbtext){
    
        String rr="";
        
        try {
             rr=Dbtext.replaceAll("G1","'" );
        } catch (Exception e) {
           System.out.println(" Error in charactor Dot");
        }
        return rr;
    }
    
    
}
