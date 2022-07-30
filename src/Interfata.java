
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class Interfata extends JFrame implements ActionListener {

    JTextField field1;
    JTextField field;

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public Interfata()
    {
        super();
        this.setPreferredSize(new Dimension(500, 500));
        this.getContentPane().setBackground(Color.BLUE);
        this.setBackground(Color.green);
        setTitle("Pagina de pornire");
        //buildMenu();
        this.pack();

        this.setLayout(new GridLayout(5,1));

        JPanel panelTitlu = new JPanel();
        JPanel panelEmail = new JPanel();
        JPanel panelAdaugaNou = new JPanel();
        panelAdaugaNou.setBackground(Color.BLUE);
        panelTitlu.setBackground(Color.BLUE);
        panelEmail.setBackground(Color.BLUE);
        JLabel titlu =new JLabel("Bibliteca ta digitala", SwingConstants.CENTER);

        titlu.setFont(new Font("Courier", Font.BOLD,25));
        panelTitlu.add(titlu);


        JLabel adresa =new JLabel("Email", SwingConstants.CENTER);
        adresa.setFont(new Font("Courier", Font.BOLD,25));
        titlu.setForeground(Color.WHITE);
        adresa.setForeground(Color.WHITE);
        panelEmail.add(adresa);

         field = new JTextField(15);
        field.setFont(new Font("Courier", Font.BOLD,18));
        panelEmail.add(field);

        JButton b1=new JButton("Conectare");
        b1.setFont(new Font("Courier", Font.BOLD,20));
        panelEmail.add(b1);
//        JTextField field = new JTextField(10);
//        field.setSize(100,50);
//        field.setFont(new Font("Courier", Font.BOLD,25));
//        add(adresa,  BorderLayout.CENTER);
//        add(field);

        JLabel adresa1 =new JLabel("Email", SwingConstants.CENTER);
        adresa1.setFont(new Font("Courier", Font.BOLD,25));
        adresa1.setForeground(Color.WHITE);
        panelAdaugaNou.add(adresa1);

         field1 = new JTextField(15);
        field1.setFont(new Font("Courier", Font.BOLD,18));
        panelAdaugaNou.add(field1);


        JButton b=new JButton("Utilizator Nou");
        b.setFont(new Font("Courier", Font.BOLD,17));
        panelAdaugaNou.add(b);
        this.add(panelTitlu);
        this.add(panelEmail);
        this.add(panelAdaugaNou);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        b1.addActionListener(e ->conectare());
        b.addActionListener(e ->primaConectare());
    }

    public void conectare()
    {
        String s=field.getText();
//        
//        try {
//        	Class.forName("com.mysql.cj.jdbc.Driver");
//        	System.out.println("aaaaaaa!");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarie","root","");
//
//            System.out.println("Conexiune reusita!");
//            
//            Statement st = con.createStatement();
//            String sql = ("SELECT * FROM utilizator");
//            ResultSet rs = st.executeQuery(sql);
//            while(rs.next()) { 
//             String id = rs.getString("Nume"); 
//             String str1 = rs.getString("Email");
//             //String parola =rs.getString("Paroal");
//             
//             System.out.println(id+" "+str1+" ");
//            }
//            con.close();
//        	
//        	
//        	
//        	
//        	
////        	Class.forName("com.mysql.jdbc.Driver");
////            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarie","root","");
////
////            System.out.println("Conexiune reusita!");
////            
////            Statement st = con.createStatement();
////            String sql = ("SELECT * FROM utilizator");
////            
////            boolean gasitUtilizator=false;
////            
////            ResultSet rs = st.executeQuery(sql);
////            while(rs.next()) { 
////             String num = rs.getString("Nume"); 
////             String em= rs.getString("Email");
////            
////             if(em.equals(s))
////            	 gasitUtilizator=true;                   
////             
////            }
////            if(!gasitUtilizator)
////            	JOptionPane.showMessageDialog(null, "Utilizatorul nu a fost gasit ","INFO", JOptionPane.INFORMATION_MESSAGE);
////            
////            con.close();
//        }
//        catch(Exception e) {
//        	System.out.println("Conexiune esuata!");
//        	System.out.println(e.getMessage());
//        }
    	Principal c =new Principal();
//    	CardLayout cardLayout = new CardLayout();
//    	PaginaPornire frame=new PaginaPornire(s);
//    	Container paginaP = frame.getContentPane();
    	if(c.cauta(s))
    	{
    		//JOptionPane.showMessageDialog(null, "Utilizator gasit ","INFO", JOptionPane.INFORMATION_MESSAGE);
    		
    		 new PaginaPornire(s);
    	}
    	else
    		JOptionPane.showMessageDialog(null, "Utilizatorul nu a fost gasit ","INFO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void primaConectare()
    {
    	String s=field1.getText();
    	
    	Principal c =new Principal();

    	if(c.cauta(s))
    	{
    		JOptionPane.showMessageDialog(null, "Utilizator cu aceasta adresa de email exista deja ","INFO", JOptionPane.INFORMATION_MESSAGE);
    		
    	}
    	else
    		{
    			
    			if(c.adaugaUtilizator(s))
    				new PaginaPornire(s);
    			else
    				JOptionPane.showMessageDialog(null, "Eroare la adaugare ","INFO", JOptionPane.INFORMATION_MESSAGE);
    		}
    	
    }
}




