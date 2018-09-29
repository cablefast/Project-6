/**
InteriorPanel class allows the selection of a interior car options.
Multiple options can be selected; none of the options are mandatory.
The state of all selections is tracked.

@author Matthew Flautt
@version 1.0

COP5007	Project #: 6
File Name: InteriorPanel.java
*/

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class InteriorPanel extends JPanel {

   /**
   Rows in the grid layout
   */ 
   private final int ROW = 4;
   
   /**
   Columns in the grid layout
   */
   private final int COLUMN = 1;

   /**
   check box for selecting the upgraded radio option
   */
   private JCheckBox radio = new JCheckBox("Radio");
   
   /**
   check box for selecting the seat warmer option
   */
   private JCheckBox seat = new JCheckBox("Seat Warmer");
   
   /**
   check box for selecting the leather interior option
   */
   private JCheckBox leather = new JCheckBox("Leather");
   
   /**
   check box for selecting the sun roof option
   */
   private JCheckBox sun = new JCheckBox("Sun Roof");
   
   /**
   non-Parameterized constructor
   adds all radio buttons to a jpanel
   sets grid layout
   sets border with title
   */
   public InteriorPanel(){
      setLayout(new GridLayout(ROW, COLUMN));
      setBorder(new TitledBorder("Interior"));      
      add(radio);
      add(seat);
      add(leather);
      add(sun);
   }
   
   /**
   method for tracking the state of the radio button
   @return boolean value of radio button state
   */
   public boolean radioButtonState() {
      return radio.isSelected();
   }
   
   /**
   method for tracking the state of the seat button
   @return boolean value of seat button state
   */
   public boolean seatButtonState() {
      return seat.isSelected();
   }
   
   /**
   method for tracking the state of the leather button
   @return boolean value of leather button state
   */
   public boolean leatherButtonState() {
      return leather.isSelected();
   }
   
   /**
   method for tracking the state of the sun button
   @return boolean value of sun button state
   */
   public boolean sunButtonState() {
      return sun.isSelected();
   }
}
