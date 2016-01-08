/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tekkitcommando.jc2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Phillip
 */
public class JC2Command {
   public final String name;
   private final  ArrayList<String> parameters;
   public boolean hasError;
   private Exception error;
   public JC2Command (String cmdValue) {
       if(cmdValue.isEmpty()){
           throw new IllegalArgumentException();
       }
       parameters = new ArrayList(Arrays.asList(cmdValue.split(" ")));
       name = parameters.get(0);
       
   }
   
   public boolean execute() {
    
       return false;
   }
   
   public Exception getError(){
       return error;
   }
           
}

