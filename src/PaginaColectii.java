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

public class PaginaColectii extends JFrame implements ActionListener{

	private String email;
	public PaginaColectii(String s)
	{
		super();
		 this.setPreferredSize(new Dimension(500, 500));
		this.getContentPane().setBackground(Color.BLUE);
		this.pack();
		JPanel panelTitlu = new JPanel();
		 JPanel panelAfisare = new JPanel();
		 JPanel panelOptiuni = new JPanel();
		 
		 panelTitlu.setBackground(Color.BLUE);
		 panelAfisare.setBackground(Color.BLUE);
		 panelOptiuni.setBackground(Color.BLUE);
		 
		 email=s;
		this.setLayout(new GridLayout(3,1));
		JLabel titlu =new JLabel("Colectiile tale", SwingConstants.CENTER);
		 titlu.setForeground(Color.WHITE);
	        titlu.setFont(new Font("Courier", Font.BOLD,25));
	        panelTitlu.add(titlu);
	        
	        String numeColectii="Colectiile tale sunt ";
	        
	        String colectiileMele="";
	        Principal p=new Principal();
	        colectiileMele=p.extrageColectii(email);
	       
	        JLabel continut =new JLabel("Colectiile tale - "+colectiileMele, SwingConstants.CENTER);
	        continut.setForeground(Color.WHITE);
	        continut.setFont(new Font("Courier", Font.BOLD,25));
		        panelAfisare.add(continut);
		        

				JButton b1=new JButton("Adauga colectie");
		       b1.setFont(new Font("Courier", Font.BOLD,20));
		       panelOptiuni.add(b1);
		       

				JButton b2=new JButton("Acceseaza colectie");
		       b2.setFont(new Font("Courier", Font.BOLD,20));
		       panelOptiuni.add(b2);
		       
		       JButton b3=new JButton("Iesire");
		       b3.setFont(new Font("Courier", Font.BOLD,20));
		       panelTitlu.add(b3);
		
		this.add(panelTitlu);
		this.add(panelAfisare);
		this.add(panelOptiuni);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       this.setVisible(true);
	       
	       b1.addActionListener(e->adaugacolectie());
	       b2.addActionListener(e->gestionareColectii());
	       b3.addActionListener(e->back());
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void adaugacolectie()
	{
		new AdaugaColectie(email);
	}
	
	public void back()
	{
		this.setVisible(false);
	}
	
	public void gestionareColectii()
	{
		new GestionareColectii(email);
	}
	

}
