/**
ColorPanel class allows the selection of a car color.
Only one color can be selected.
State of the selection is tracked.

@author Matthew Flautt
@version 1.0

COP5007	Project #: 6
File Name: ColorPanel.java
*/

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ColorPanel extends JPanel {

   /**
   Rows in the grid layout
   */    
   private final int ROW = 3;
   
   /**
   Columns in the grid layout
   */
   private final int COLUMN = 1;
   
   /**
   radio button for selecting red color
   */
   private JRadioButton red = new JRadioButton("Red");
   
   /**
   radio button for selecting white color
   */
   private JRadioButton white = new JRadioButton("White");
   
   /**
   radio button for selecting blue color
   */
   private JRadioButton blue = new JRadioButton("Blue");
   
   /**
   non-Parameterized constructor
   adds all radio buttons to a jpanel
   sets grid layout
   sets border with title
   button group limits selection to one button
   sets white color to the default selection
   */
   public ColorPanel(){
      setLayout(new GridLayout(ROW, COLUMN));
      setBorder(new TitledBorder("Color"));      
      ButtonGroup allButtons = new ButtonGroup();
      allButtons.add(red);
      allButtons.add(white);
      allButtons.add(blue);
      white.setSelected(true);      
      add(red);
      add(white);
      add(blue);
   }
   
   /**
   method for tracking the state of the red button
   @return boolean value of red button state
   */
   public boolean redButtonState() {
      return red.isSelected();
   }
   
   /**
   method for tracking the state of the blue button
   @return boolean value of blue button state
   */
   public boolean blueButtonState() {
      return blue.isSelected();
   }
   
   /**
   method for tracking the state of the white button
   @return boolean value of white button state
   */
   public boolean whiteButtonState() {
      return white.isSelected();
   }
}
