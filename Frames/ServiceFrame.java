import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ServiceFrame extends JFrame implements ActionListener
{
	JLabel imgLabel;
	JPanel panel;
	ImageIcon img4;
	SecondFrame sf;
	JButton loutBtn,BackBtn;
	Font myFont7,myFont8;
	
	public ServiceFrame()
	{
		super("SERVICE FRAME");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.sf = sf;
		panel = new JPanel();
		panel.setLayout(null);
		myFont7 = new Font("Elephent",Font.BOLD, 12);
        myFont8 = new Font("Elephent",Font.BOLD, 10);
		
		loutBtn = new JButton("LOGOUT");
		loutBtn.setBounds(690,430,80,30);
		loutBtn.setBackground(Color.RED);
		loutBtn.setForeground(Color.BLACK);
		loutBtn.setFont(myFont8);
		loutBtn.addActionListener(this);
		panel.add(loutBtn);
		
		BackBtn = new JButton("BACK");
		BackBtn.setBounds(690, 390, 80,30);
		BackBtn.setBackground(Color.RED);
		BackBtn.setForeground(Color.BLACK);
		BackBtn.setFont(myFont7);
		BackBtn.addActionListener(this);
		panel.add(BackBtn);
		
		
		img4 = new ImageIcon("background1.2.jpg");
		imgLabel = new JLabel(img4);
		imgLabel.setBounds(0, 0, 800, 500);
		panel.add(imgLabel);
		
		this.add(panel);		
				
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(loutBtn.getText().equals(command))
		{
			GentsParlor gp = new GentsParlor();
			gp.setVisible(true);
			this.setVisible(false);
		}
		else if(BackBtn.getText().equals(command))
		{
			SecondFrame sf = new SecondFrame();
			sf.setVisible(true);
			this.setVisible(false);
		}
		
		else
		{
			
		}
	}
		
	
}