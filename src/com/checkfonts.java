/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lasitha Ranawaka
 */
public class checkfonts {
   

    List<String> li = new ArrayList<>();

    public checkfonts() {

        li.add("_KALAHAM.TTF");
        li.add("_kushpoo.ttf");
        li.add("FM_ABHAY.TTF");
        li.add("FM_Bindumathi.TTF");
    }

   

    public boolean CheckFonts() {

        boolean bol = false;

        try {
            File f = new File("C:\\Windows\\Fonts");

            String s[] = f.list();

            for (String string : li) {

                if (new File("C:\\Windows\\Fonts\\"+string).exists()) {
                    bol=false;
                }else{
                    com.Messages.errorjoption("Missing font - "+string);
                    System.out.println("Miss font - "+string);
                    bol=true;
                    break;
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }

       
        return bol;
    }
}

