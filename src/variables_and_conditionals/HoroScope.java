package variables_and_conditionals;

import javax.swing.JOptionPane;

public class HoroScope {
	public static void main(String[] args) {
	String January = " Capricorn";
    String Febuary = "Aquarius";
    String March = "Pisces";
    String April = "Aries";
    String May = "Taurus";
    String June = "Gemini";
    String July = "Cancer";
    String August = "Leo";
    String September = "Virgo";
    String October = "Libre";
    String November = "Scorpio";
    String December = "sagittarius";
    String month=JOptionPane.showInputDialog("What month were you born in.");
   
    if(month.equals("January")){
        
    	JOptionPane.showMessageDialog(null, "You Are A" + January );          

    } else if(month.equals("Febuary")){
JOptionPane.showMessageDialog(null, "You Are A " + Febuary);        

} else if(month.equals("March")){
JOptionPane.showMessageDialog(null, "You Are A " + March );  
}
else if(month.equals("April")){
JOptionPane.showMessageDialog(null, "You Are A " + April );  
}
else if(month.equals("May")){
JOptionPane.showMessageDialog(null, "You Are A " + May );  
}
else if(month.equals("June")){
JOptionPane.showMessageDialog(null, "You Are A " +  June );  
}
else if(month.equals("July")){
JOptionPane.showMessageDialog(null, "You Are A " + July  );  
}
else if(month.equals("August")){
JOptionPane.showMessageDialog(null, "You Are A " + August  );  

}
else if(month.equals("September")){
JOptionPane.showMessageDialog(null, "You Are A " + September);  
}
else if(month.equals("October")){
	JOptionPane.showMessageDialog(null, "You Are A " + October);  
}
else if(month.equals("November")){
	JOptionPane.showMessageDialog(null, "You Are A " + September ); 
}
else if(month.equals("December")){
	JOptionPane.showMessageDialog(null, "You Are A " + December  );  
{

}
} } }