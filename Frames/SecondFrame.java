import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondFrame extends JFrame implements ActionListener
{
	JLabel imgLabel;
	JButton loutBtn,Wbtn, Mbtn, btnTwo, btnService,btnProduct;
	JPanel panel;
	ImageIcon img1;
	Font myFont6,myFont7,myFont8,myFont9;
	GentsParlor gp;
	
	public SecondFrame()
	{
		super("HOME PAGE");
		this.setSize(800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.gp = gp;
		panel = new JPanel();
		panel.setLayout(null);
		myFont6 = new Font("Cambria",Font.BOLD, 14);
		myFont7 = new Font("Elephent",Font.BOLD, 20);
		myFont8 = new Font("Arial", Font.BOLD, 16);
		myFont9 = new Font("Elephent", Font.BOLD, 10);
		
	
		
		loutBtn = new JButton("LOG OUT");
		loutBtn.setBounds(690,415,80,30);
		loutBtn.setBackground(Color.RED);
		loutBtn.setForeground(Color.BLACK);
		loutBtn.setFont(myFont9);
		loutBtn.addActionListener(this);
		panel.add(loutBtn);
		
		Mbtn = new JButton("MANAGER");
		Mbtn.setBounds(350,100,120,30);
		Mbtn.setBackground(Color.PINK);
		Mbtn.setForeground(Color.BLACK);
		Mbtn.setFont(myFont6);
		Mbtn.addActionListener(this);
		panel.add(Mbtn);
		
		Wbtn = new JButton("WORKER");
		Wbtn.setBounds(350,150,120,30);
		Wbtn.setBackground(Color.PINK);
		Wbtn.setForeground(Color.BLACK);
		Wbtn.setFont(myFont6);
		Wbtn.addActionListener(this);
		panel.add(Wbtn);
		
		btnProduct = new JButton("PRODUCT");
		btnProduct.setBounds(350,200,120,30);
		btnProduct.setBackground(Color.PINK);
		btnProduct.setForeground(Color.BLACK);
		btnProduct.setFont(myFont6);
		btnProduct.addActionListener(this);
		panel.add(btnProduct);
		
		btnService = new JButton("SERVICE");
		btnService .setBounds(350,250,120,30);
		btnService .setBackground(Color.PINK);
		btnService .setForeground(Color.BLACK);
		btnService .setFont(myFont6);
		btnService .addActionListener(this);
		panel.add(btnService );
		
		img1 = new ImageIcon("background1.2.jpg");
		imgLabel = new JLabel(img1);
		imgLabel.setBounds(0, 0, 800,500);
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
		
		else if(Mbtn.getText().equals(command))
		{
			ManagerFrame mf = new ManagerFrame();
			mf.setVisible(true);
			this.setVisible(false);
		}
		else if(Wbtn.getText().equals(command))
		{
			WorkerFrame wf = new WorkerFrame();
			wf.setVisible(true);
			this.setVisible(false);
		}
		else if(btnProduct.getText().equals(command))
		{
			ProductFrame pf = new ProductFrame();
			pf.setVisible(true);
			this.setVisible(false);
		}
	    else if(btnService.getText().equals(command))
		{
			ServiceFrame sef = new ServiceFrame();
			sef.setVisible(true);
			this.setVisible(false);
		}
		else
		{
			
		}
	}
		
	
}