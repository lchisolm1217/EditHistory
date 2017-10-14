package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here


        EditHistory myHistory = new EditHistory();
        editDoc(myHistory);




    }

    public static void editDoc(EditHistory a){
        System.out.println("Hello! Welcome to you text editor.");
        System.out.println("Enter 1 to input");
        System.out.println("Enter 2 to copy");
        System.out.println("Enter 3 to delete");
        System.out.println("Enter 4 to undo");
        System.out.println("Enter 5 to quit");
        Scanner scan = new Scanner(System.in);
        int input;
        while(a.getHistory().size() <= 10){
            input = scan.nextInt();
            if (input ==1) {
                System.out.println("Enter your string");
                String word = scan.next();
                a.input(word);
                scan.nextLine();
                System.out.println("Next command");
                continue;
            }
             else if(input ==2 ) {
                a.copy();
                System.out.println("Next command");
                continue;
            }
            else if(input ==3) {
                a.delete();
                System.out.println("Next command");
                continue;
            }
            else if(input ==4) {
                a.undo();
                System.out.println("Next command");a
                continue;
            }
            else{
                break;
            }
        }
        System.out.println("Goodbye!");
        System.out.println("This is your edit history");
        System.out.println(a.getHistory());

    }


}
