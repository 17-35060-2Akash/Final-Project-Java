import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WorkerFrame extends JFrame implements ActionListener
{
	JLabel imgLabel,imgLabelempIdLabel, empIdLabel,empNameLabel, empDesignationLabel, empSalaryLabel;
	JTextField empIdTF, empNameTF, empDesignationTF, empSalaryTF;
	JPanel panel;
	JButton loutBtn,BackBtn,loadBtn,refreshBtn, getAllBtn;
	ImageIcon img;
	JTable empTable;
	SecondFrame sf;
	Font myFont8,myFont7,myFont9;
	
	public WorkerFrame()
	{
		super("WORKER FRAME");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.sf = sf;
		panel = new JPanel();
		panel.setLayout(null);
		myFont7 = new Font("Elephent",Font.BOLD, 12);	
		myFont8 = new Font("Cambria",Font.BOLD, 12);
		myFont9 = new Font("Cambria",Font.BOLD, 10);
		
		loutBtn = new JButton("LOG OUT");
		loutBtn.setBounds(690,430,80,30);
		loutBtn.setBackground(Color.RED);
		loutBtn.setForeground(Color.BLACK);
		loutBtn.setFont(myFont9);
		loutBtn.addActionListener(this);
		panel.add(loutBtn);
		
		BackBtn = new JButton("BACK");
		BackBtn.setBounds(690, 390, 80,30);
		BackBtn.setBackground(Color.RED);
		BackBtn.setForeground(Color.BLACK);
		BackBtn.setFont(myFont7);
		BackBtn.addActionListener(this);
		panel.add(BackBtn);
		
		empNameLabel = new JLabel("NAME:");
		empNameLabel.setBounds(10,10,80,30);
		empNameLabel.setForeground(Color.GRAY);
		empNameLabel.setFont(myFont8);
		panel.add(empNameLabel);
		
		empIdLabel = new JLabel("ID :");
		empIdLabel.setBounds(10,50,80,30);
		empIdLabel.setForeground(Color.GRAY);
		empIdLabel.setFont(myFont8);
		panel.add(empIdLabel);
		
		empIdTF = new JTextField();
		empIdTF.setBounds(100,50,100,30);
		empIdTF.setFont(myFont7);
		panel.add(empIdTF);
		
		
		empNameTF = new JTextField();
		empNameTF.setBounds(100,10,100,30);
		empNameTF.setFont(myFont7);
		panel.add(empNameTF);
		
		empDesignationLabel = new JLabel("DESIGNATION:");
		empDesignationLabel.setBounds(10,90,100,30);
		empDesignationLabel.setForeground(Color.GRAY);
		empDesignationLabel.setFont(myFont8);
		panel.add(empDesignationLabel);
		
		empDesignationTF = new JTextField();
		empDesignationTF.setBounds(100,90,100,30);
		empDesignationTF.setFont(myFont7);
		panel.add(empDesignationTF);
		
		empSalaryLabel = new JLabel("SALARY");
		empSalaryLabel.setBounds(10,130,100,30);
		empSalaryLabel.setForeground(Color.GRAY);
		empSalaryLabel.setFont(myFont8);
		panel.add(empSalaryLabel);
		
		empSalaryTF = new JTextField();
		empSalaryTF.setBounds(100,130,100,30);
		empSalaryTF.setFont(myFont7);
		panel.add(empSalaryTF);
		
		loadBtn = new JButton("LOAD");
		loadBtn.setBounds(290,65,80,30);
		loadBtn.setBackground(Color.PINK);
		loadBtn.setForeground(Color.BLACK);
		loadBtn.setFont(myFont8);
		loadBtn.addActionListener(this);
		panel.add(loadBtn);
		
		
		/*refreshBtn = new JButton("REFRESH");
		refreshBtn.setBounds(690, 50, 80,30);
		refreshBtn.setBackground(Color.PINK);
	    refreshBtn.setForeground(Color.BLACK);
		refreshBtn.setFont(myFont9);
		refreshBtn.addActionListener(this);
		//refreshBtn.setEnabled(false);
		panel.add(refreshBtn);*/
		
		getAllBtn = new JButton("GET ALL");
		getAllBtn.setBounds(290,430,80,30);
	    getAllBtn.setBackground(Color.PINK);
	    getAllBtn.setForeground(Color.BLACK);
		getAllBtn.setFont(myFont9);
		getAllBtn.addActionListener(this);
		panel.add(getAllBtn);
		
		
		img = new ImageIcon("background1.2.jpg");
		imgLabel = new JLabel(img);
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