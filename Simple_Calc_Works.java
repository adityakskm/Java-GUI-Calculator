import javax.swing.*;
import java.awt.event.*;

	class Simple_Calc_Works implements ActionListener 
	{
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1, b2, b3, b4, b5;

	Simple_Calc_Works() 
{
	JFrame f= new JFrame("Calculator");

	System.out.println(" Inside main method!! ");

	 l1=new JLabel("First value: ");
	 l1.setBounds(50,50, 100,30);
	 t1=new JTextField();
	 t1.setBounds(200,50, 100,30);

	 l2=new JLabel("Second value:");
	 l2.setBounds(50,100, 100,30);
	 t2=new JTextField();
	 t2.setBounds(200,100, 100,30);


	b1 = new JButton("+");
	b1.setFocusable(false);
	b1.setBounds(50, 150, 50, 50);
	b2 = new JButton("-");
	b2.setBounds(120, 150, 50, 50);
	b3 = new JButton("*");
	b3.setBounds(190, 150, 50, 50);
	b4 = new JButton("/");
	b4.setBounds(260, 150, 50, 50);
	b5 = new JButton("Concatinate");
	b5.setBounds(300, 150, 110, 50);

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);

	l3=new JLabel("Result: ");
	l3.setBounds(50,220, 100,30);

	t3=new JTextField("Result here....");
	t3.setBounds(200, 220, 100,30);

	f.add(t1); 
	f.add(t2); 
	f.add(t3);
	f.add(l1); 
	f.add(l2); 
	f.add(l3);
	f.add(b1); 
	f.add(b2);
	f.add(b3);
	f.add(b4);
    f.add(b5);
    

	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent ae) 
{
	String s1, s2, s3, s4;
	int n1, n2, bool=0;
	double res = 0.0;

	s1 = t1.getText();
	s2 = t2.getText();
	n1 = Integer.parseInt(t1.getText());
	n2 = Integer.parseInt(t2.getText());

	if (ae.getSource() == b1)
		res = n1 + n2;
	else if (ae.getSource() == b2)
		res = n1 - n2;
	else if (ae.getSource() == b3)
		res = n1 * n2;
	else if (ae.getSource() == b4)
		if(n1>n2)		
		res = n1 / n2;
		else
		res = n2 / n1;
    else if (ae.getSource() == b5)
        {
            s4 = s1+s2;
            t3.setText(s4);
            bool = 1;
       }

    if(bool!=1){
	s3 = String.valueOf(res);
	    System.out.println(s3);
	t3.setText(s3);}
}
	public static void main(String args[]) 
{
	new Simple_Calc_Works();
}
} 
