/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;
import java.util.*;
/**
 *
 * @author HP
 */

public class Cal {

    /**
     * @param args the command line arguments
     */
    int sum(int a,int b)
    {
        return a+b;
    }
    int prod(int a,int b)
    {
        return a*b;
    }
    int diff(int a,int b)
    {
        return a-b;
    }
    float div(int a,int b)
    {
        return a/b;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        Cal obj=new Cal();
        System.out.println(obj.sum(a,b));
    }
    
}
