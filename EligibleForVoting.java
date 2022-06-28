package day3;
import javax.swing.*;

public class EligibleForVoting {
    //main method
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();//creating Jframe for GUI dialog
		
		//taking input
		String age = JOptionPane.showInputDialog(jFrame, "Type your age here in the box");
		
		int age_Int = Integer.parseInt(age);//type casting

		//logic
		if(age_Int >= 18) {
			JOptionPane.showMessageDialog(jFrame,"You are eligible for voting!");
		}else {
			JOptionPane.showMessageDialog(jFrame,"You are not eligible for voting!");
		}
	}
    
}
