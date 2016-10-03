/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.Date;

/**
 *
 * @author Lasitha Ranawaka
 */
public class DateUp {
    
    
    public Date DateSet(Date d){
    
        d.setDate(d.getDate()+7);
    
        return d;
    }
}
