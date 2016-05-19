/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

/**
 *
 * @author Lasitha Ranawaka
 */
public class forabsent {
    public static String Inputabsent(String urtext){
     String r="";
        
        try {
           r=urtext.replaceAll("ab","ab" );
        } catch (Exception e) {
            System.out.println(" Error in charactor Dot");
        }
         return  r;
    }
    
    public static String Getabsent(String Dbtext){
    
        String rr="";
        
        try {
             rr=Dbtext.replaceAll("ab","්ඉ" );
        } catch (Exception e) {
           System.out.println(" Error in charactor Dot");
        }
        return rr;
    }
}

