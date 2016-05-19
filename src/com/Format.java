/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Ravinda
 */
public class Format {
    public static final NumberFormat nf2d = NumberFormat.getNumberInstance();
    public static DateFormat dd_MMMM_yyyy = new SimpleDateFormat("dd - MMMM - yyyy");
    public static DateFormat dd_MM_yyyy = new SimpleDateFormat("dd-MM-yyyy");
    public static DateFormat yyyy_MM_dd = new SimpleDateFormat("yyyy-MM-dd");
    public static DateFormat yyyy_MM_dd_hh_mm_ss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static {
        nf2d.setGroupingUsed(false);
        nf2d.setMaximumFractionDigits(2);
        nf2d.setMinimumFractionDigits(2);
        nf2d.setRoundingMode(RoundingMode.HALF_DOWN);
    }
}
