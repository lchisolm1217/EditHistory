package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EditHistory {

    //myStack holds all of the edit history
    private Stack<String> myStack = new Stack<>();
    //myQueue holds all deleted strings
    private Queue<String> myQueue = new LinkedList<String>();


    public void input(String s){
        //Takes a string and adds it into myStack
        myStack.add(s);
        System.out.println("You input " + s + "!");
    }

    public void copy(){
        //Takes the last string in myStack and adds it to myStack again
        String copied = myStack.peek();
        myStack.add(copied);
        System.out.println("You copied " + copied + "!");
    }

    public void delete(){
        //Deletes the last string in myStack and adds it to myQueue
        String deleted = myStack.pop();
        myQueue.offer(deleted);
        System.out.println("You erased " + deleted );
    }

    public void undo(){
        //Takes the first word in myQueue and adds it to myStack
        String erased = myQueue.peek();
        myStack.add(erased);
        System.out.println("You un-reased " + erased + "!");
    }



    public Stack<String> getHistory(){
        return myStack;
    }
}
