package com.erik;

import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Stack<String> names=new Stack<String>();
        System.out.println("Is stack empty ? :" + names.empty() );
        names.push("Erik");
        names.push("Alice");
        names.push("Bob");
        System.out.println("Stack size : "+names.size() );
        Iterator<String> al= names.iterator();
        try{
            while(al.hasNext())
                System.out.println(al.next());
        }
        catch (NoSuchElementException e ){
            System.out.println("Exception : "+e);
        }

    }
}
