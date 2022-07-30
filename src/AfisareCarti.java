import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumnModel;

public class AfisareCarti extends JFrame implements ActionListener{

	JTable tabel;
	public AfisareCarti(String s)
	{
		super();
		 this.setPreferredSize(new Dimension(500, 500));
		this.getContentPane().setBackground(Color.BLUE);
		this.pack();
		JPanel panelTitlu = new JPanel();
		 JPanel panelTabel = new JPanel();
		 
		 panelTitlu.setBackground(Color.BLUE);
		 panelTabel.setBackground(Color.BLUE);
		 
		this.setLayout(new GridLayout(2,1));
		 JLabel titluA =new JLabel("Cartile tale", SwingConstants.CENTER);
	        titluA.setFont(new Font("Courier", Font.BOLD,30));
	        titluA.setForeground(Color.WHITE);
	        panelTitlu.add(titluA);
	        
	        String header[]={"Titlu","Autor","Numar Pagini","Progres"};
	        
	        Principal p=new Principal();
	        ArrayList<Carte> carti=p.getBooks(s);
	        
	        
	        String data[][]=new String[carti.size()+1][4];
	        int i=0;
	        for(Carte h:carti)
	        	{
	        		data[i][0]=h.getTitlu();
	        		data[i][1]=h.getAutor();
	        		data[i][2]=String.valueOf(h.getNrPagini());
	        		data[i][3]=h.getProcent();
	        		i++;
	        	}
	        		
	        tabel=new JTable(data,header);    
			tabel.setRowHeight(30);  
			TableColumnModel columnModel = tabel.getColumnModel();

			columnModel.getColumn(0).setWidth(150); 
			columnModel.getColumn(1).setPreferredWidth(150);
			columnModel.getColumn(2).setPreferredWidth(50);
			columnModel.getColumn(3).setPreferredWidth(50);
			JScrollPane sp=new JScrollPane(tabel);  

			sp.setPreferredSize(new Dimension(450,200));
			
			panelTabel.add(sp);
		
		this.add(panelTitlu);
		this.add(panelTabel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
