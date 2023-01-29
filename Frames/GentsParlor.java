import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GentsParlor extends JFrame implements MouseListener, ActionListener
{
	ImageIcon img,icon;
	JLabel userLabel, passLabel, imgLabel;
	JTextField userTF;
	JPasswordField passPF;
	JButton loginBtn, exitBtn,showPassBtn,clearBtn;
	JRadioButton r1, r2, r3;
	JCheckBox c1, c2, c3;
	ButtonGroup bg1;
	JComboBox combo;
	JPanel panel;
	Color myColor;
	Font myFont,myFont2,myFont3,myFont4;
	
	public GentsParlor()
	{
		super("CO3 GENTS PARLOR");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		icon=new ImageIcon(getClass().getResource("img2.png"));
		this.setIconImage(icon.getImage());
		
		myColor = new Color(200, 230, 140);
		myFont = new Font("Cambria",Font.BOLD, 20);
		myFont2 = new Font("Elephent",Font.BOLD, 20);
		myFont3 = new Font("Arial", Font.BOLD, 16);
		myFont4 = new Font("Elephent", Font.BOLD, 12);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		userLabel = new JLabel("USER NAME:");
		userLabel.setBounds(260,280,120,40);
		userLabel.setFont(myFont3);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(380, 285, 120,30);
		userTF.setBackground(Color.BLACK);
		userTF.setForeground(Color.RED);
		userTF.setFont(myFont);
		panel.add(userTF);
		
		passLabel = new JLabel("PASSWORD:");
		passLabel.setBounds(260, 340, 120,40);
		passLabel.setFont(myFont3);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(380, 345, 120,30);
		passPF.setBackground(Color.BLACK);
		passPF.setForeground(Color.RED);
		passPF.setFont(myFont);
		panel.add(passPF);
		
		showPassBtn = new JButton("SHOW");
		showPassBtn.setBounds(510, 345, 80,30);
		showPassBtn.setBackground(Color.BLACK);
		showPassBtn.setForeground(Color.RED);
		showPassBtn.setFont(myFont4);
		showPassBtn.addMouseListener(this);
		panel.add(showPassBtn);
		
		loginBtn = new JButton("LOG IN");
		loginBtn.setBounds(260, 400, 80,30);
		loginBtn.addMouseListener(this);
		loginBtn.addActionListener(this);
		loginBtn.setBackground(Color.PINK);
		loginBtn.setFont(myFont4);
		loginBtn.setForeground(Color.BLACK);
		
	
		panel.add(loginBtn);
		
		exitBtn = new JButton("EXIT");
		exitBtn.setBounds(418, 400, 80,30);
		exitBtn.setFont(myFont4);
		exitBtn.setForeground(Color.BLACK);
		exitBtn.setBackground(Color.RED);
		exitBtn.addMouseListener(this);
	    exitBtn.addActionListener(this);
		;
		
		panel.add(exitBtn);
		
		clearBtn=new JButton("Clear");
		clearBtn.setBounds(510,285,80,30);
		clearBtn.setBackground(Color.BLACK);
		clearBtn.setForeground(Color.RED);
		clearBtn.setFont(myFont4);
		panel.add(clearBtn);
		
		clearBtn.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				userTF.setText("");
				passPF.setText("");
			}
			
			
		});
		

		img = new ImageIcon("background1.1.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 800, 500);
		panel.add(imgLabel);
		
		this.add(panel);
		
		
}public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me)
	{
		passPF.setEchoChar((char)0);
	}
	public void mouseReleased(MouseEvent me)
	{
		passPF.setEchoChar('*');
	}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.BLACK);
			loginBtn.setForeground(Color.PINK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.BLACK);
			exitBtn.setForeground(Color.RED);
		}
		else
		{
			
	}}
	public void mouseExited(MouseEvent me){if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.PINK);
			loginBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		else
		{
			
	}}
		public void actionPerformed(ActionEvent ae)
	   {
		String command = ae.getActionCommand();
		
		if(loginBtn.getText().equals(command))
		{
			SecondFrame sf = new SecondFrame();
			sf.setVisible(true);
			this.setVisible(false);
		}
		else if(exitBtn.getText().equals(command))
		{
			System.exit(0);
		}
		else
		{
			
		}
	}
	
}
	