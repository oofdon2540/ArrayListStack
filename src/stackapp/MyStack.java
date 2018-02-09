/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackapp;

import java.util.*;

/**
 *
 * @author yo
 */
public class MyStack implements StackInterface{
    Wagon wagon;
    private ArrayList<Wagon> theStack;
    
    public MyStack(){
        
        theStack = new ArrayList<Wagon>();
    }
    
    //empty
    @Override
    public boolean isEmpty(){
        return theStack.isEmpty();
    }
    //full
    @Override
    public boolean isFull(){
        return false;
    }
    //push
    @Override
    public void push(Object newItem){
        theStack.add(0,(Wagon)newItem);
    }
    //pop
    @Override
    public Object pop(){
        if(theStack.size() != 0){
             theStack.remove(0);
        }
        else{
            theStack.remove(null);
        }
        
        return theStack;
    }
    
    
    @Override
    public int stackSize(){
        return theStack.size();
    }
    
    @Override
    public String display(){
        StringBuilder sb = new StringBuilder();
        for(Object o : theStack){
            sb.append(o);
            sb.append("\n");
        }
      return sb.toString();
    }
}
