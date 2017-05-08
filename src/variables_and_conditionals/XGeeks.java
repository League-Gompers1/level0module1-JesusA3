package variables_and_conditionals;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
            String danielsPower = "Hacking";
            String christophersPower = "Reading";
            String jesussPower = "Speed";
            String jasonsPower = "Smarts";
            String alfredosPower = "Gaming";
            String chrissPower = "Math";
            String joshuasPower = "Insperation";
            String ebukasPower = "Endurance";
       
        // 2. Ask the user to enter a name. Store their answer in a variable.
            String name=JOptionPane.showInputDialog("Enter name");
            
        // 3. Show the superpower in a pop-up, depending on the name entered. 
            if(name.equals("Daniel")){
           
            	JOptionPane.showMessageDialog(null, "Daniel's Superpower is " +  danielsPower );          
    } else if(name.equals("Ebuka")){
       JOptionPane.showMessageDialog(null, "Ebuka's Superpower is " + ebukasPower  );        
    
    } else if(name.equals("Christopher")){
        JOptionPane.showMessageDialog(null, "Christopher's Superpower is " + christophersPower  );  
    }
    else if(name.equals("Jesus")){
        JOptionPane.showMessageDialog(null, "Jesus's Superpower is " + jesussPower  );  
    }
    else if(name.equals("Jason")){
        JOptionPane.showMessageDialog(null, "Jason's Superpower is " + jasonsPower );  
    }
    else if(name.equals("Alfredo")){
        JOptionPane.showMessageDialog(null, "Alfredo's Superpower is " +  alfredosPower );  
    }
    else if(name.equals("Chris")){
        JOptionPane.showMessageDialog(null, "Chris's Superpower is " + chrissPower  );  
    }
    else if(name.equals("Joshua")){
        JOptionPane.showMessageDialog(null, "Joshua's Superpower is " + joshuasPower  );  
    }
 
} } 