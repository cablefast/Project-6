/**
WheelsPanel class allows the selection of a car wheels.
Only one type of wheel can be selected.
State of the selection is tracked.

@author Matthew Flautt
@version 1.0

COP5007	Project #: 6
File Name: WheelsPanel.java
*/

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class WheelsPanel extends JPanel {

   /**
   Rows in the grid layout
   */ 
   private final int ROW = 3;
   
   /**
   Columns in the grid layout
   */
   private final int COLUMN = 1;

   /**
   radio button for selecting 17" wheels
   */
   private JRadioButton b17 = new JRadioButton("17\" Silver");
   
   /**
   radio button for selecting 18" wheels
   */
   private JRadioButton b18 = new JRadioButton("18\" Gun Metal");
   
   /**
   radio button for selecting 19" wheels
   */
   private JRadioButton b19 = new JRadioButton("19\" Chrome");
   
   /**
   non-Parameterized constructor
   adds all radio buttons to a jpanel
   sets grid layout
   sets border with title
   button group limits selection to one button
   sets 17" wheels to the default selection
   */
   public WheelsPanel(){
      setLayout(new GridLayout(ROW, COLUMN));
      setBorder(new TitledBorder("Wheels"));
      ButtonGroup allButtons = new ButtonGroup();
      allButtons.add(b17);
      allButtons.add(b18);
      allButtons.add(b19);
      b17.setSelected(true);
      add(b17);
      add(b18);
      add(b19);
   }
   
   /**
   method for tracking the state of the b17 button
   @return boolean value of b17 button state
   */
   public boolean b17ButtonState() {
      return b17.isSelected();
   }
   
   /**
   method for tracking the state of the b18 button
   @return boolean value of b18 button state
   */
   public boolean b18ButtonState() {
      return b18.isSelected();
   }
   
   /**
   method for tracking the state of the b19 button
   @return boolean value of b19 button state
   */
   public boolean b19ButtonState() {
      return b19.isSelected();
   }
}
