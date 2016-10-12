/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Lasitha Ranawaka
 */
public class Test {

    public static void main(String[] args) {
        String oldtime="02:30:25";
        String addnewtime="00:00:01";
        String nowtime="02:30:27";
       SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        Date d1 = null;
        Date d2 = null;
        Date d3 = null;
        
        try {
            d1 = format.parse(oldtime);
            d2 = format.parse(nowtime);
            d3 = format.parse(addnewtime);
            
            

            //in milliseconds
            long addition = d3.getTime() + d1.getTime();
            System.out.println("addition mili "+addition);
            long now=d2.getTime();
            System.out.println("now mili "+now);
            String afteraddition = format.format(new Date(addition));
            System.out.println(afteraddition);
            if(addition < now ){
                System.out.println("still cant");
            
            }else if(addition>now){
                System.out.println("ok");
            
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
