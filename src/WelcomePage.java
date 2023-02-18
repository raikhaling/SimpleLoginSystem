import java.awt.Font;

import javax.swing.*;

public class WelcomePage {
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello");
	
	WelcomePage(String userID){
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		welcomeLabel.setText("Hello "+ userID);
		
		frame.setTitle("Welcome Page");
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 450);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
}
