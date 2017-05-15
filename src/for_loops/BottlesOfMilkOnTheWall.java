package for_loops;

import javax.swing.JOptionPane;

public class BottlesOfMilkOnTheWall {
public static void main(String[] args) {
	int bottles =99;
	for(int i = bottles; i > 0; i--){
		JOptionPane.showMessageDialog(null,bottles+" bottles of milk on the wall,");
		JOptionPane.showMessageDialog(null,bottles+" bottles of milk, take one down pass it around");
		JOptionPane.showMessageDialog(null,bottles+" bottles of milk on the wall,");
		bottles--;
		JOptionPane.showMessageDialog(null,bottles+" bottles of milk on the wall,");
		if(bottles ==1){
			JOptionPane.showMessageDialog(null, "No more bottles of milk on the wall");
	
}
}
}}