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

public class PaginaPornire extends JFrame implements ActionListener  {
	
	private String email;
	
	public PaginaPornire(String s)
	{
		super();
		 this.setPreferredSize(new Dimension(500, 500));
		this.getContentPane().setBackground(Color.BLUE);
		this.setBackground(Color.green);
		this.pack();
		email=s;
		 this.setLayout(new GridLayout(3,1));
		 setTitle("Pagina Principala");
		 JPanel panelTitlu = new JPanel();
		 JPanel panelAdaugaCarte = new JPanel();
		 JPanel panelArataCarti = new JPanel();
		 JLabel titlu =new JLabel("Pagina Principala", SwingConstants.CENTER);
		 titlu.setForeground(Color.WHITE);
	        titlu.setFont(new Font("Courier", Font.BOLD,25));
	        panelTitlu.add(titlu);
	    panelTitlu.setBackground(Color.BLUE);
	    
	    JButton b1=new JButton("Adauga Carte");
        b1.setFont(new Font("Courier", Font.BOLD,20));
        panelAdaugaCarte.add(b1);
        
        JButton b2=new JButton("Afisare Carti");
        b2.setFont(new Font("Courier", Font.BOLD,20));
        panelArataCarti.add(b2);
	    
        panelAdaugaCarte.setBackground(Color.BLUE);
        panelArataCarti.setBackground(Color.BLUE);
        
	    this.add(panelTitlu);
	    this.add(panelAdaugaCarte);
	    this.add(panelArataCarti);
	   
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        b1.addActionListener(e->adauagaCarte());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void adauagaCarte()
	{
		new AdaugaCarte(email);
	}
	
	

}
