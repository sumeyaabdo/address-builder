package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for name
        System.out.println("Full name: ");
        String fullName = scanner.nextLine();

        // Asking for billing Street
        System.out.println("Billing Street: ");
        String billingStreet = scanner.nextLine();

        // Asking for billing City
        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine();

        // Asking for billing State
        System.out.println("Billing State: ");
        String billingState = scanner.nextLine();

        // Asking for billing zip
        System.out.println("Billing Zip: ");
        String billingZip = scanner.nextLine();

        // Asking for Shipping Street
        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        // Asking for Shipping City
        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine();

        // Asking for Shipping State
        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine();

        // Asking for Shipping Zip
        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine();


    }
}
