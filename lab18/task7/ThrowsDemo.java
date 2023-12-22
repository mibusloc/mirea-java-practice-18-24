package ru.mirea.lab18.task7;

import java.util.Scanner;

public class ThrowsDemo {
    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to an empty string");
        }
        return "data for " + key;
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }
}

