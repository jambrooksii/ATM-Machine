package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean again = true;
        do {
        System.out.println("Welcome to Jamie's ATM machine click    W for Withdraw and D for Deposit ");
        Scanner atmInput = new Scanner(System.in);
        String userInput = atmInput.nextLine();

        int bankAccount = 2000;
        int atmMoney = 0;

        boolean notMultiple;


            if (userInput.toLowerCase().equals("w")) {
                System.out.println("How much do you want to withdraw(multiples of 5, 10, 20");
                atmMoney = atmInput.nextInt();
                if (((atmMoney % 5 == 0 || atmMoney % 10 == 0 || atmMoney % 20 == 0)) && atmMoney > 0 && atmMoney <= bankAccount) {
                    bankAccount = bankAccount - atmMoney;
                } else if (atmMoney % 5 != 0 || atmMoney % 10 != 0 || atmMoney % 20 != 0) {
                    System.out.println("Not a multiple of 5, 10, 20.  Try again" + "You balance is still " + bankAccount);
                }else if(atmMoney > bankAccount){
                    System.out.println("Sorry not enough Money!!");
                }
            }

            if (userInput.toLowerCase().equals("d")) {
                System.out.println("How much do you are you depositing?");
                atmMoney = atmInput.nextInt();
                bankAccount = bankAccount + atmMoney;
            }
            System.out.println("Your new Balance is " + bankAccount);
            System.out.println("Do you want to make another transaction   Y for Yes and N for No?");
            Scanner atmInput2 = new Scanner(System.in);
            userInput = atmInput2.nextLine();

            if (userInput.toLowerCase().equals("y")) {
                again = true;
            } else if (userInput.toLowerCase().equals("n")) {
                again = false;
            } else if (!userInput.toLowerCase().equals("y") || !userInput.toLowerCase().equals("n")) {
                again = false;
                System.out.println("Sorry incorrect entry, Thank you have a nice day ");
            }


        } while (again == true);

    }

}


