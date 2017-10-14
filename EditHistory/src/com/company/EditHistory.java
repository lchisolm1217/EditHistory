package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EditHistory {

    private Stack<String> myStack = new Stack<>();
    private Queue<String> myQueue = new LinkedList<String>();


    public void input(String s){
        myStack.add(s);
        System.out.println("You input " + s + "!");
    }

    public void copy(){
        String copied = myStack.peek();
        myStack.add(copied);
        System.out.println("You copied " + copied + "!");
    }

    public void undo(){
        String erased = myQueue.peek();
        myStack.add(erased);
        System.out.println("You un-reased " + erased + "!");
    }

    public void delete(){
        String deleted = myStack.pop();
        myQueue.offer(deleted);
        System.out.println("You erased " + deleted );
    }

    public Stack<String> getHistory(){
        return myStack;
    }
}
