package day3;
import javax.swing.*;

public class numberCheck {
    public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();//creating Jframe for GUI dialog
		
		//taking input
		String num = JOptionPane.showInputDialog(jFrame, "Type a number for checking it!");
		
		int num_Int = Integer.parseInt(num);//type casting

		//logic
		if(num_Int > 0) {
			JOptionPane.showMessageDialog(jFrame,"It is a positive number!");
		}
		else if(num_Int < 0) {
			JOptionPane.showMessageDialog(jFrame, "It is a negative number");
		}
		else if(num_Int == 0) {
			JOptionPane.showMessageDialog(jFrame, "It is a zero");
		}
	}
    
}
