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
        
    	JOptionPane.showMessageDialog(null, "You Are " + January );          

    } else if(month.equals("Febuary")){
JOptionPane.showMessageDialog(null, "You Are " + Febuary);        

} else if(month.equals("March")){
JOptionPane.showMessageDialog(null, "You Are " + March );  
}
else if(month.equals("April")){
JOptionPane.showMessageDialog(null, "You Are " + April );  
}
else if(month.equals("May")){
JOptionPane.showMessageDialog(null, "You Are " + May );  
}
else if(month.equals("June")){
JOptionPane.showMessageDialog(null, "You Are " +  June );  
}
else if(month.equals("July")){
JOptionPane.showMessageDialog(null, "You Are " + July  );  
}
else if(month.equals("August")){
JOptionPane.showMessageDialog(null, "You Are " + August  );  

}
else if(month.equals("September")){
JOptionPane.showMessageDialog(null, "You Are " + September);  
}
else if(month.equals("October")){
	JOptionPane.showMessageDialog(null, "You Are " + October);  
}
else if(month.equals("November")){
	JOptionPane.showMessageDialog(null, "You Are " + September ); 
}
else if(month.equals("December")){
	JOptionPane.showMessageDialog(null, "You Are " + December  );  
{

}
} } }