package com;

import javax.swing.JTextField;

public class Validation  {

    public static void validatedouble(JTextField txt01) {

        try {

            double d = Double.parseDouble(txt01.getText());

        } catch (Exception e) {

            txt01.setText("");
//            setValidationMessage("Be carefull while entering data",Color.RED);
        }


    }

    public static void validatelong(JTextField txt) {
        try {
            long i = Long.valueOf(txt.getText());

        } catch (Exception e) {
            txt.setText("");
//             setValidationMessage("Be carefull while entering data",Color.RED);


        }
    }

    public static void validatenumber(JTextField txt) {
        try {
            int i = Integer.valueOf(txt.getText());

        } catch (Exception e) {
            txt.setText("");
//             setValidationMessage("Be carefull while entering data",Color.RED);
        }
    }



    public static void phonenovalidate(JTextField txt) {
        if (!txt.getText().isEmpty()) {
            for (int i = 0; i < txt.getText().length(); i++) {

                char c = txt.getText().charAt(i);

                if (!Character.isDigit(c)) {

                    String s = txt.getText().substring(0, i);
                    txt.setText(null);
//                     setValidationMessage("Be carefull while entering data",Color.RED);
                    txt.setText(s);
                } else {
                    if (10 < txt.getText().length()) {
                        String a = txt.getText().substring(0, 10);
                        txt.setText(a);
//                         setValidationMessage("Be carefull while entering data",Color.RED);
                    }
                }
            }
        }
    }

    public static void InterestValidate(JTextField txt) {
        if (!txt.getText().isEmpty()) {
            for (int i = 0; i < txt.getText().length(); i++) {

                char c = txt.getText().charAt(i);

                if (!Character.isDigit(c)) {

                    String s = txt.getText().substring(0, i);
                    txt.setText(null);
//                     setValidationMessage("Be carefull while entering data",Color.RED);
                    txt.setText(s);
                } else {
                    if (2 < txt.getText().length()) {
                        String a = txt.getText().substring(0, 2);
                        txt.setText(a);
//                         setValidationMessage("Be carefull while entering data",Color.RED);
                    }
                }
            }
        }
    }

    public static void accnovalidate(JTextField txt) {
        if (!txt.getText().isEmpty()) {
            for (int i = 0; i < txt.getText().length(); i++) {

                char c = txt.getText().charAt(i);

                if (!Character.isDigit(c)) {

                    String s = txt.getText().substring(0, i);
                    txt.setText(null);
                    txt.setText(s);
//                     setValidationMessage("Be carefull while entering data",Color.RED);
                } else {
                    if (20 < txt.getText().length()) {
                        String a = txt.getText().substring(0, 20);
                        txt.setText(a);
//                         setValidationMessage("Be carefull while entering data",Color.RED);
                    }
                }
            }
        }
    }
}
