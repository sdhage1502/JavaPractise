package com.tka.basic.inheritance;
// Main method to demonstrate the inheritance

public class STest {
    public static void main(String[] args) {
        // Creating an instance of Cricket class
        Cricket cricket = new Cricket("Cricket", 11, "Twenty20");

        // Displaying information about the cricket
        cricket.displayInfo();
        cricket.displayCricketFormat();
    }
}