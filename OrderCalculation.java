/**
OrderCalculation class combines the panels necessary to option our a Ford Explorer at Henderson's Autos.
OrderCalculation class contains two inner class actionlisteners

@author Matthew Flautt
@version 1.0

COP5007	Project #: 6
File Name: OrderCalculation.java
*/

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderCalculation extends JFrame{
   
   /**
   * Because it's recommended when extending JFrame
   */ 
   private static final long serialVersionUID = 1L;

   /**
   create color panel object for color choice selection
   */
   private ColorPanel color = new ColorPanel();
   
   /**
   create wheels panel object for wheel choice selection
   */
   private WheelsPanel wheels = new WheelsPanel();
   
   /**
   create interior panel object for selecting interior options
   */
   private InteriorPanel interior = new InteriorPanel();
   
   /**
   non-Parameterized constructor
   create jframe object
   adds panels to jframe
   sets border layout
   */
   public OrderCalculation(){
      super("Order Calculator");
      JLabel welcome = new JLabel("Henderson's Autos: 2008 Ford Explorer Options", JLabel.CENTER);
      setLayout(new BorderLayout());
      add(welcome, BorderLayout.NORTH);
      add(color, BorderLayout.WEST);
      add(wheels, BorderLayout.EAST);
      add(interior, BorderLayout.CENTER);
      add(buttonPanel(), BorderLayout.SOUTH);
      pack();
   }
   
   /**
   panel contains the buttons for calculate and exit
   @return buttons jpanel with two buttons
   */
   private JPanel buttonPanel(){
      JPanel buttons = new JPanel();
      JButton calc = new JButton("Calculate");
      calc.addActionListener(new Calc());
      JButton exit = new JButton("Exit");
      exit.addActionListener(new Exit());
      buttons.add(calc);
      buttons.add(exit);
      return buttons;
   }

   /**
   Calc class is the action listener for the calculate button
   Calc class has methods to calculate the subtotal, tax, and total
   */
   private class Calc implements ActionListener {

      /**
      @override calls calculate methods and displays joptionpane with cost info
      */
      public void actionPerformed(ActionEvent e) {
         final int BASECOST = 25000;
         int subTotal = 0;
         int tax = 0;
         int totalCost = 0;
         subTotal = BASECOST + calcColorCost() + calcInteriorCost() + calcWheelCost();
         tax = calcTax(subTotal);
         totalCost = subTotal + tax;
         String msg[] = {("Subtotal: $" + subTotal), ("Tax: $" + tax), ("Total: $" + totalCost)};
         JFrame parent = new JFrame();
         JOptionPane.showMessageDialog(parent, msg);
      }
      
      /**
      calculates the cost of the color option selected
      @return int representing the cost of the color option
      */
      private int calcColorCost(){
         final int RED = 500;
         final int BLUE = 600;
         final int WHITE = 0;
         if(color.redButtonState()) return RED;
         else if(color.blueButtonState()) return BLUE;
         else return WHITE;
      }

      /**
      calculates the cost of the interior options selected
      @return int representing the sum of all selected options
      */
      private int calcInteriorCost(){
         final int RADIO = 1500;
         final int SEAT = 900;
         final int LEATHER = 1200;
         final int SUN = 750;
         int tally = 0;
         if(interior.radioButtonState()) tally =+ RADIO;
         if(interior.seatButtonState()) tally =+ SEAT;
         if(interior.leatherButtonState()) tally =+ LEATHER;
         if(interior.sunButtonState()) tally =+ SUN;
         return tally;
      }

      /**
      calculates the cost of the wheel option selected
      @return int representing the cost of the wheel option
      */
      private int calcWheelCost(){
         final int B17 = 0;
         final int B18 = 1300;
         final int B19 = 2100;
         if(wheels.b19ButtonState()) return B19;
         else if(wheels.b18ButtonState()) return B18;
         else return B17;
      }

      /**
      calculates the cost of the color option selected
      @param an int representing cost before tax
      @return double cast to int representing the amount of tax
      */
      private int calcTax(int subTotal){
         final double TAXRATE = 0.07;
         double tax = TAXRATE * subTotal;
         return (int)tax;
      }
   }

   /**
   Exit class is the action listener for the exit button
   */
   private class Exit implements ActionListener {
      
      /**
      @override exits the program
      */
      public void actionPerformed(ActionEvent e) {
         System.exit(0);
      }
   }
}