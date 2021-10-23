package com.company;

import com.company.PlayerPackage.Asker;
import com.company.PlayerPackage.Guesser;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String user_word;
        String letter = new String();
        int counter = 0;
        int error = 0;

        System.out.println("Asker:");
        Asker asker = new Asker();
        System.out.println("Guesser:");
        Guesser guesser = new Guesser();


        System.out.println("(" + asker.getName() + ") Please enter your word:");
        user_word = scanner.nextLine();

        char[] word = new char[user_word.length()];

        for (int i = 0; i < user_word.length(); i++) {
            word[i] = user_word.charAt(i);
        }

        char[] win = new char[word.length];
        Arrays.fill(win, '_');

        while(counter != user_word.length()){
            int here = 0;
            System.out.println("_______________________________");

            System.out.println("(" + guesser.getName() + ") Please enter a letter:");
            letter = scanner.nextLine();


            for (int i = 0; i < word.length; i++) {
                if(letter.equalsIgnoreCase(String.valueOf(word[i]))){
                    win[i] = word[i];
                    here++;
                }
            }

            System.out.println(Arrays.toString(win));

            if(here != 0) {
                System.out.println(here + " treffer!");

                if(Arrays.equals(word, win)){
                    System.out.println("(" + guesser.getType()  + "): " + guesser.getName() + " won the game!");
                    break;
                }
            }else{
                error++;
            }

            printer(error);

            if(error == 14){
                System.out.println("(" + asker.getType()  + "): " + asker.getName() + " won the game!");
                break;
            }
        }

    }

/*
    "  _ _ _ _"
    "  |      0"
    "  |     /|\"
    "  |     / \"
    "  |"
*/

    private static void printer(int error) {
        switch (error){
            case 0:
                System.out.println("No errors, Greate!");
                break;
            case 1:
                System.out.println("You got " + error + " errors now!");
                System.out.println("|");
                break;
            case 2 :
                System.out.println("You got " + error + " errors now!");
                System.out.println("|");
                System.out.println("|");
                break;
            case 3:
                System.out.println("You got " + error + " errors now!");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 4:
                System.out.println("You got " + error + " errors now!");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 5:
                System.out.println("You got " + error + " errors now!");
                System.out.println("-");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 6:
                System.out.println("You got " + error + " errors now!");
                System.out.println("- -");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 7:
                System.out.println("You got " + error + " errors now!");
                System.out.println("- - -");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 8:
                System.out.println("You got " + error + " errors now!");
                System.out.println("- - - -");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 9:
                System.out.println("You got " + error + " errors now!");
                System.out.println("- - - -");
                System.out.println("|      0");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 10:
                System.out.println("You got " + error + " errors now!");
                System.out.println("- - - -");
                System.out.println("|      0");
                System.out.println("|      |");
                System.out.println("|");
                System.out.println("|");
                break;
            case 11:
                System.out.println("You got " + error + " errors now!");
                System.out.println("- - - -");
                System.out.println("|      0");
                System.out.println("|     /|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 12:
                System.out.println("You got " + error + " errors now!");
                System.out.println("- - - -");
                System.out.println("|      0");
                System.out.println("|     /|" + (char)92);
                System.out.println("|");
                System.out.println("|");
                break;
            case 13:
                System.out.println("You got " + error + " errors now!");
                System.out.println("- - - -");
                System.out.println("|      0");
                System.out.println("|     /|" + (char)92);
                System.out.println("|     /");
                System.out.println("|");
                break;
            case 14:
                System.out.println("You got " + error + " errors now!");
                System.out.println("- - - -");
                System.out.println("|      0");
                System.out.println("|     /|" + (char)92);
                System.out.println("|     / " + (char)92);
                System.out.println("|");
                break;
        }
    }
}
