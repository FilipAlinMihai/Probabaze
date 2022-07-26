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
        
        JButton b3=new JButton("Am Citit");
        b3.setFont(new Font("Courier", Font.BOLD,20));
        panelAdaugaCarte.add(b3);
        
        JButton b2=new JButton("Afisare Carti");
        b2.setFont(new Font("Courier", Font.BOLD,20));
        panelArataCarti.add(b2);
        
        JButton b4=new JButton("Colectii");
        b4.setFont(new Font("Courier", Font.BOLD,20));
        panelArataCarti.add(b4);
        
        JButton b5=new JButton("Iesire");
        b5.setFont(new Font("Courier", Font.BOLD,20));
        panelTitlu.add(b5);
	    
	    
        panelAdaugaCarte.setBackground(Color.BLUE);
        panelArataCarti.setBackground(Color.BLUE);
        
	    this.add(panelTitlu);
	    this.add(panelAdaugaCarte);
	    this.add(panelArataCarti);
	   
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        b1.addActionListener(e->adauagaCarte());
        b2.addActionListener(e->afisareCarti());
        b3.addActionListener(e->aduagaPaginiCitite());
        b4.addActionListener(e->colectii());
        b5.addActionListener(e->back());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void adauagaCarte()
	{
		new AdaugaCarte(email);
	}
	
	public void afisareCarti()
	{
		new AfisareCarti(email);
	}
	
	public void aduagaPaginiCitite()
	{
		new AmCitit(email);
	}
	
	public void colectii()
	{
		new PaginaColectii(email);
	}
	

	public void back()
	{
		this.setVisible(false);
		new Interfata();
	}
	

}
