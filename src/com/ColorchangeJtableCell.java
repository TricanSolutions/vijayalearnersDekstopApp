/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Sudara
 */
public class ColorchangeJtableCell extends DefaultTableCellRenderer {

    String Stringfixvalue = null;
    Color cc = null;

    public ColorchangeJtableCell(JTable mytable, String fixvalue, Color c, int JtableColumn) {

        this.Stringfixvalue = fixvalue;
        this.cc = c;

        mytable.getColumnModel().getColumn(JtableColumn).setCellRenderer(this);

    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (Integer.parseInt((String) table.getValueAt(row, column)) == Integer.parseInt(Stringfixvalue)) {
            setBackground(cc);
            setForeground(Color.BLACK);

        } else if (table.getValueAt(row, column).equals(Stringfixvalue)) {
            setBackground(cc);
            setForeground(Color.BLACK);

        } else if (isSelected) {
            setBackground(new Color(10, 36, 106));
        } else {

            setBackground(Color.white);
            setForeground(Color.BLACK);
        }


        return c;
    }
}