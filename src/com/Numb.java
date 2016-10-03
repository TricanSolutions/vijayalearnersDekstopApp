/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Ravinda
 */
public class Numb {

    public String numbclass(String pr) {
         String opt = "";
        for (int i = 0; i < pr.length(); i++) {
            char c = pr.charAt(i);

            switch (c) {
                case '1':
                    opt += "E";
                    break;
                case '2':
                    opt += "F";
                    break;
                case '3':
                    opt += "G";
                    break;
                case '4':
                    opt += "H";
                    break;
                case '5':
                    opt += "I";
                    break;
                case '6':
                    opt += "J";
                    break;
                case '7':
                    opt += "K";
                    break;
                case '8':
                    opt += "L";
                    break;
                case '9':
                    opt += "M";
                    break;
                case '0':
                    opt += "N";
                    break;
                default:
                    opt += c;
                    break;
            }
        }
      return opt;
    }


}
