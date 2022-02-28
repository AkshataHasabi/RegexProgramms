package com.bridgelab.regexpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scanner=new Scanner(System.in);
    static UserRegistration userRegistration = new UserRegistration();
    public static void main(String[] args) {
        System.out.println("welcome to regex programms");
        boolean condition = true;
        while (condition) {
            System.out.println("choose option:" + "\n" + "1.CheckFirstName" + "\n" + "2.CheckLastName" + "\n"+"3.CheckEmail"+"\n"+"4.CheckMobileFormat"+"\n"+ "5.Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter a First Name:");
                    userRegistration.validFirstName(scanner.next());
                    break;
                case 2:
                    System.out.println("Enter a Last Name:");
                    userRegistration.validLastName(scanner.next());
                    break;
                case 3:
                    System.out.println("Enter a email:");
                    userRegistration.validEmail(scanner.next());
                    break;
                case 4:
                    System.out.println("Enter a Mobile Number");
                    userRegistration.validMobileNumber(scanner.next());
                    break;
                case 5:
                    condition=false;
                    break;
                default:
                    System.out.println("invalid option");
            }
        }
    }

    public void validMobileNumber(String mobileNumber) {
        boolean value = Pattern.matches("^(\\(?(\\+)?\\d{2}\\)?[-]?)?\\d{10}$", mobileNumber);
        System.out.println(value);
        if(value){
            System.out.println("valid mobile format");
        }else{
            System.out.println("Invalid mobile format");
        }
    }

    public void validEmail(String email) {
        boolean value = Pattern.matches("^[a-zA-Z]+[-\\+\\_\\.a-zA-Z0-9]+[@][a-zA-Z0-9]+([.]?[a-zA-Z\\,]{2,3}){2,3}", email);
        System.out.println("LastName is valid or not:"+" "+ value);
    }

    public void validLastName(String lastName) {
        boolean value = Pattern.matches("^[A-Z]{1}[a-zA-Z]+", lastName);
        System.out.println("LastName is valid or not:"+" "+ value);
    }

    public void validFirstName(String firstName) {
        boolean value = Pattern.matches("[A-Z]{1}[a-zA-Z]+", firstName);
        System.out.println("Name is valid or not:"+ value);
    }
}
