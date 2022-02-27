package com.bridgelab.regexpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("welcome to regex programms");
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter a First Name:");
        userRegistration.validFirstName(scanner.nextLine());
    }

    public void validFirstName(String firstName) {
        boolean value = Pattern.matches("[A-Z]{1}[a-zA-Z]+", firstName);
        System.out.println("Name is valid or not:"+ value);
    }
}
