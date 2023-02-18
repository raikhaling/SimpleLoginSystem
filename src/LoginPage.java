import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userTextField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("UserID:");
	JLabel userPasswordLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel();
	
	HashMap<String, String> loginInfo = new HashMap<>();
	
	public LoginPage(HashMap loginInfo) {
		this.loginInfo = loginInfo;
		
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null, Font.ITALIC,22));
		
		userTextField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200, 100, 25);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225,200,100,25);
		resetButton.addActionListener(this);

		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userPasswordField);
		frame.add(userTextField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,450);
		frame.setLayout(null);
		frame.setVisible(true); 
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == loginButton) {
			
			String userID = userTextField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			if(loginInfo.containsKey(userID)) {
				if(password.equals((String)loginInfo.get(userID))) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login succesful");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage(userID);
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Password Incorrect");
				
				}
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("User name not Found");
			}

		}
		if(e.getSource() == resetButton) {
			userTextField.setText("");
			userPasswordField.setText("");
			messageLabel.setText("");
		}
		
	}

	
}
