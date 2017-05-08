package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	
	public static void main(String[] args){
	
	
		Random ran = new Random();
  String ans = JOptionPane.showInputDialog("Guess number between 1 and 100.");
 
  int num;
	
  num = ran.nextInt(100);
  
  System.out.println(num);

for (int i = 0; i< 100; i++);
 
int numb = Integer.parseInt(ans);
System.out.println(numb);
		if(numb > num){
			JOptionPane.showInputDialog("Too High");			
}else if(numb<num){
	JOptionPane.showInputDialog("Too Low");
	
}else if (numb == num);
		JOptionPane.showInputDialog("Great Job");
		}}
 

	 
	 
	 
 