import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GestionareColectii extends JFrame implements ActionListener{

	public GestionareColectii(String s)
	{
		
		super();
		this.setPreferredSize(new Dimension(500, 500));
		this.getContentPane().setBackground(Color.BLUE);
		this.pack();
		JPanel panelTitlu = new JPanel();
		JPanel panelOptiuni = new JPanel();
		
		this.setLayout(new GridLayout(2,1));
		JLabel titlu =new JLabel("Gestionare Colectii", SwingConstants.CENTER);
		titlu.setForeground(Color.WHITE);
	    titlu.setFont(new Font("Courier", Font.BOLD,25));
	    panelTitlu.add(titlu);
	        
	    JButton b3=new JButton("Iesire");
        b3.setFont(new Font("Courier", Font.BOLD,20));
        panelTitlu.add(b3);
		
		 panelTitlu.setBackground(Color.BLUE);
		 panelOptiuni.setBackground(Color.BLUE);
		 
		 JButton b1=new JButton("Afisare Colectie");
	     b1.setFont(new Font("Courier", Font.BOLD,20));
	     panelOptiuni.add(b1);
	     
	     
	     JButton b2=new JButton("Adauga la Colectie");
	     b2.setFont(new Font("Courier", Font.BOLD,20));
	     panelOptiuni.add(b2);
	     
		
		 
		 this.add(panelTitlu);
		 this.add(panelOptiuni);
			
			
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setVisible(true);
		 
		 b3.addActionListener(e->back());
	}
	
	
	
	public void back()
	{
		this.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
