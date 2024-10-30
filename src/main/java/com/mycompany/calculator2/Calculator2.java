/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Calculator2 {

    public static void main(String[] args) {
        Scanner en=new Scanner(System.in);
        int num1,num2,operator;
                
        System.out.println("A simple Calculator");

        System.out.println(" 1-Add \n 2-Substract \n 3-Multiple \n 4-Divide");
        System.out.println("Chose The operator");
        operator=en.nextInt();
        System.out.println("Enter the first number");
        num1=en.nextInt();
        System.out.println("Enter the second number");
        num2=en.nextInt();
        
        int result=0;
        switch(operator){
        case 1:
          result =num1+num2;
        break;
        case 2:
          result =num1-num2;
          break;
        case 3:
            result =num1*num2;
            break;
        case 4:
            result =num1/num2;
            break;
       
        default:
            System.out.println("This operator dosen't exist");
            break;
        
     }   
        System.out.println("The result is "+result);  
 }
}
