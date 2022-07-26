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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AdaugaCarte extends JFrame implements ActionListener{
	JTextField field1;
    JTextField field;
    JSpinner pagini;
	public AdaugaCarte(String s)
	{
		super();
		 this.setPreferredSize(new Dimension(500, 500));
		this.getContentPane().setBackground(Color.BLUE);
		this.setBackground(Color.green);
		this.pack();
		JPanel panelTitlu = new JPanel();
		 JPanel panelTitluC = new JPanel();
		 JPanel panelAutor = new JPanel();
		 JPanel panelPagini = new JPanel();
		 JPanel panelAdauga = new JPanel();
		 
		this.setLayout(new GridLayout(5,1));
		
		JButton b1=new JButton("Adauga Carte");
        b1.setFont(new Font("Courier", Font.BOLD,20));
        panelAdauga.add(b1);
        
        JLabel titlu =new JLabel("Adauga o carte noua", SwingConstants.CENTER);
		 titlu.setForeground(Color.WHITE);
	        titlu.setFont(new Font("Courier", Font.BOLD,25));
	        panelTitlu.add(titlu);
	        
	        JLabel titluA =new JLabel("Titlu", SwingConstants.CENTER);
	        titluA.setFont(new Font("Courier", Font.BOLD,25));
	        
	        titluA.setForeground(Color.WHITE);
	        panelTitluC.add(titluA);

	         field = new JTextField(15);
	        field.setFont(new Font("Courier", Font.BOLD,18));
	        panelTitluC.add(field);
	    
	    
	        JLabel autor =new JLabel("Autorul", SwingConstants.CENTER);
	        autor.setFont(new Font("Courier", Font.BOLD,25));
	        
	        autor.setForeground(Color.WHITE);
	        panelAutor.add(autor);

	         field1 = new JTextField(15);
	        field1.setFont(new Font("Courier", Font.BOLD,18));
	        panelAutor.add(field1);
	        
	        JLabel nrp =new JLabel("Numarul de pagini", SwingConstants.CENTER);
	        nrp.setFont(new Font("Courier", Font.BOLD,25));
	        
	        nrp.setForeground(Color.WHITE);
	        panelPagini.add(nrp); 
	        
	        pagini=new JSpinner();
	        pagini.setPreferredSize(new Dimension(60, 25));
	        panelPagini.add(pagini);
        
        panelTitlu.setBackground(Color.BLUE);
        panelTitluC.setBackground(Color.BLUE);
        panelAutor.setBackground(Color.BLUE);
        panelPagini.setBackground(Color.BLUE);
        panelAdauga.setBackground(Color.BLUE);
        JButton b3=new JButton("Iesire");
	       b3.setFont(new Font("Courier", Font.BOLD,20));
	       panelTitlu.add(b3);
        
        this.add(panelTitlu);
        this.add(panelTitluC);
        this.add(panelAutor);
        this.add(panelPagini);
        this.add(panelAdauga);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		 
        b1.addActionListener(e->adaugaOCarte(s));
        b3.addActionListener(e->back());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void adaugaOCarte(String s)
	{
		
		String titlu=field.getText();
		String autor=field1.getText();
		int nrpg=(int)pagini.getValue();
		Principal c =new Principal();
		
		if(c.cautaCarte(s,titlu,autor))
		{
			if(c.aduagaCarteNoua(s, titlu, autor, nrpg))
				JOptionPane.showMessageDialog(null, "Cartea a fost adaugata ","INFO", JOptionPane.INFORMATION_MESSAGE);
			else 
				JOptionPane.showMessageDialog(null, "Eroare la adaugare ","INFO", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Cartea nu a putut fi adaugata ","INFO", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void back()
	{
		this.setVisible(false);
	}
}
