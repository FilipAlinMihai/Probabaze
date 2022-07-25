import java.sql.*;
public class Principal {

	public  boolean cauta(String s)
	{

        
        try {

        	
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarie","root","");

            System.out.println("Conexiune reusita!");
            
            Statement st = con.createStatement();
            String sql = ("SELECT * FROM utilizator");
            ResultSet rs = st.executeQuery(sql);
            boolean gasitUtilizator=false;
            while(rs.next()) { 
             String id = rs.getString("Nume"); 
             String em = rs.getString("Email");
             //String parola =rs.getString("Paroal");
             if(em.equals(s))
            	 gasitUtilizator=true;  
             
             System.out.println(id+" "+em+" ");
            }
            con.close();
            if(gasitUtilizator)
            	return true;
            else 
            	return false;
        }
        catch(Exception e) {
        	System.out.println("Conexiune esuata!");
        	System.out.println(e.getMessage());
        	return false;
        }

	}
	
	public boolean adaugaUtilizator(String s)
	{
		 try {

	        	
	        	Class.forName("com.mysql.jdbc.Driver");
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarie","root","");

	            System.out.println("Conexiune reusita!");
	            
	            Statement st = con.createStatement();
	           
	             st.executeUpdate("INSERT INTO utilizator VALUES ('"+s+"','Numele')");
	            
	            con.close();
	            return true;
	        }
	        catch(Exception e) {
	        	System.out.println("Conexiune esuata!");
	        	System.out.println(e.getMessage());
	        	return false;
	        }

	}
	
	public boolean cautaCarte(String email,String titlu,String autor)
	{
		 try {

	        	
	        	Class.forName("com.mysql.jdbc.Driver");
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarie","root","");

	            System.out.println("Conexiune reusita!");
	            
	            Statement st = con.createStatement();
	            String sql = ("SELECT * FROM carte");
	            ResultSet rs = st.executeQuery(sql);
	            boolean gasitCarte=false;
	            while(rs.next()) { 
	             String ti = rs.getString("Titlu"); 
	             String em = rs.getString("Email");
	             String au = rs.getString("Autor");
	             //String parola =rs.getString("Paroal");
	             if(em.equals(email) && ti.equals(titlu) && au.equals(autor))
	            	 gasitCarte=true;  
	            
	            }
	            con.close();
	            if(gasitCarte)
	            	return false;
	            else 
	            	return true;
	        }
	        catch(Exception e) {
	        	System.out.println("Conexiune esuata!");
	        	System.out.println(e.getMessage());
	        	return false;
	        }
	}
	
	public boolean aduagaCarteNoua(String email,String titlu,String autor,int pag)
	{
		 try {

	        	
	        	Class.forName("com.mysql.jdbc.Driver");
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarie","root","");

	            System.out.println("Conexiune reusita!");
	            
	            Statement st = con.createStatement();
	           
	             st.executeUpdate("INSERT INTO carte VALUES ('"+titlu+"','"+autor+"',"+pag+",'"+email+"')");
	            
	            con.close();
	            return true;
	        }
	        catch(Exception e) {
	        	System.out.println("Conexiune esuata!");
	        	System.out.println(e.getMessage());
	        	return false;
	        }
	}

}
