package com.solvd.lambdaenum;

import exceptions.CustomException;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum Color {
    RED("FF0000"), GREEN("00FF00"), BLUE("0000FF");

    private final String hexCode;

    Color(String hexCode) {
        // Check if the hexadecimal code has the correct format
        if (!isValidHexCode(hexCode)) {
            try {
                // If it's not valid, throw a custom exception
                throw new CustomException("Invalid Hex Code: " + hexCode);
            } catch (CustomException ex) {
                Logger.getLogger(Color.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }

    public void printInfo() {
        System.out.println("Color: " + this.name() + ", Hex Code: " + hexCode);
    }

    // Private method to check the format of the hexadecimal code
    private boolean isValidHexCode(String hexCode) {
        // You can implement the logic to validate the format of the hexadecimal code here
        // Return true if valid, false if not valid
        // In this example, it only checks the length of the hexadecimal code
        return hexCode.matches("[0-9A-Fa-f]+") && (hexCode.length() == 6 || hexCode.length() == 3);
    }
}
