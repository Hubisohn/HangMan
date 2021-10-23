package com.company.PlayerPackage;

import java.util.Scanner;

public abstract class Player {

    Scanner scanner = new Scanner(System.in);

    String name = new String();

    public Player(){

        System.out.println("Please enter your Name:");
        name = scanner.nextLine();

    }

    public abstract String getType();

    public String getName(){
        return name;
    }

}
