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

        // Asking for billing State
        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine();

        // Asking for billing zip
        System.out.println("Billing Zip: ");
        String billingZip = scanner.nextLine();

        //
    }
}
