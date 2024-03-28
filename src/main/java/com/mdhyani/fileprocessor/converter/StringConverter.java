package com.mdhyani.fileprocessor.converter;

public class StringConverter {

    public static String reverse(String inputString) {
        if (inputString == null) {
            return null;
        }
        StringBuilder output = new StringBuilder(inputString).reverse();
        return output.toString();
    }

}
