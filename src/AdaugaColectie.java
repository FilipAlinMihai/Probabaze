import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AdaugaColectie  extends JFrame implements ActionListener{
	JTextField field;
	private String email;
	public AdaugaColectie(String s)
	{
		super();
		 this.setPreferredSize(new Dimension(500, 500));
		this.getContentPane().setBackground(Color.BLUE);
		this.pack();
		JPanel panelTitlu = new JPanel();
		 JPanel panelNume = new JPanel();
		 JPanel panelAdauga = new JPanel();
		 
		 panelTitlu.setBackground(Color.BLUE);
		 panelNume.setBackground(Color.BLUE);
		 panelAdauga.setBackground(Color.BLUE);
		 
		 email=s;
		this.setLayout(new GridLayout(3,1));
		JLabel titlu =new JLabel("Adauga o colectie", SwingConstants.CENTER);
		 titlu.setForeground(Color.WHITE);
	        titlu.setFont(new Font("Courier", Font.BOLD,25));
	        panelTitlu.add(titlu);
	        
	        JLabel titluA =new JLabel("Nume Colectie", SwingConstants.CENTER);
	        titluA.setFont(new Font("Courier", Font.BOLD,25));
	        
	        titluA.setForeground(Color.WHITE);
	        panelNume.add(titluA);

	         field = new JTextField(15);
	        field.setFont(new Font("Courier", Font.BOLD,18));
	        panelNume.add(field);
	        
	        JButton b1=new JButton("Adauga colectie");
		       b1.setFont(new Font("Courier", Font.BOLD,20));
		       panelAdauga.add(b1);
		       JButton b2=new JButton("Inapoi");
		       b2.setFont(new Font("Courier", Font.BOLD,20));
		       panelAdauga.add(b2);
		       
	        this.add(panelTitlu);
			this.add(panelNume);
			this.add(panelAdauga);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		       this.setVisible(true);
		       
		     
		    b1.addActionListener(e->adaugaColectieNoua());
		    b2.addActionListener(e->back());
		    

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void  adaugaColectieNoua()
	{
		Principal p= new Principal();
		String col=field.getText();
		
		if(p.cautraColectie(col,email))
		{
			JOptionPane.showMessageDialog(null, "Colectia nu poate fi aduagata","INFO", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			if(p.adauagaColectieNoua(email, col))
				JOptionPane.showMessageDialog(null, "Colectie adaugata","INFO", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "Eroare la aduagare","INFO", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void back()
	{
		this.setVisible(false);
	}

}
