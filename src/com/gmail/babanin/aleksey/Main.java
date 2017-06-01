package com.gmail.babanin.aleksey;

import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {

        int number;
        
        sc = new Scanner(System.in);

        System.out.println("Enter ticket number");
        number = sc.nextInt();

        Ticket ticket = new Ticket(number);

        if (ticket.isLucky()) {
            System.out.println("You are Lucky!");
        } else {
            System.out.println("Sorry");
        }
    }
}
