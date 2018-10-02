/**
OrderMenu class is a Main method. It calls OrderCalculation and sets some basic swing elements.

@author Matthew Flautt
@version 1.1

COP5007	Project #: 6
File Name: OrderMenu.java
*/

import javax.swing.JFrame;

public class OrderMenu{

   /**
   main method calls OrderCalculation
   */
   public static void main(String[] args){  
      OrderCalculation frame = new OrderCalculation();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}