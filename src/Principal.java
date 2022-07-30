import java.sql.*;
import java.util.ArrayList;
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
	
	public Carte getCarte(String email,String titlu,String autor)
	{
		Carte c=new Carte();
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
             int nrP =rs.getInt("NRPagini");
             int nrPC=rs.getInt("PaginiCitite");
             
             if(em.equals(email) && ti.equals(titlu) && au.equals(autor))
            	 c=new Carte(ti,au,nrP,nrPC);
            	
            
            }
            con.close();
            return c;
        }
        catch(Exception e) {
        	System.out.println("Conexiune esuata!");
        	System.out.println(e.getMessage());
        	return c;
        }
	}
	
	public boolean aduagaCarteNoua(String email,String titlu,String autor,int pag)
	{
		 try {

	        	
	        	Class.forName("com.mysql.jdbc.Driver");
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarie","root","");

	            System.out.println("Conexiune reusita!");
	            
	            Statement st = con.createStatement();
	           
	             st.executeUpdate("INSERT INTO carte VALUES ('"+titlu+"','"+autor+"',"+pag+",'"+email+"',0)");
	            
	            con.close();
	            return true;
	        }
	        catch(Exception e) {
	        	System.out.println("Conexiune esuata!");
	        	System.out.println(e.getMessage());
	        	return false;
	        }
	}
	
	public ArrayList<Carte> getBooks(String s)
	{
		ArrayList<Carte> carti = new ArrayList<>();
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarie","root","");

        System.out.println("Conexiune reusita!");
        
        Statement st = con.createStatement();
        String sql = ("SELECT * FROM carte where Email='"+s+"'");
        ResultSet rs = st.executeQuery(sql);
        boolean gasitUtilizator=false;
        while(rs.next()) { 
         String t = rs.getString("Titlu"); 
         String aut = rs.getString("Autor");
         String pg = rs.getString("NRPagini");
         int pgC=rs.getInt("PaginiCitite");
         
         Carte c =new Carte(t,aut,Integer.parseInt(pg),pgC);
         carti.add(c);
        
        }
        con.close();
        
        	
    }
    catch(Exception e) {
    	System.out.println("Conexiune esuata!");
    	System.out.println(e.getMessage());
    	
    }

		
		return carti;
	}
	
	public boolean uppdateCarte(Carte c,String s)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarie","root","");

	        System.out.println("Conexiune reusita!");
	        
	        Statement st = con.createStatement();
	        //String sql = ("update carte set PaginiCitite="+c.getPgCitite()+"where Email='"+s+"' and Titlu='"+c.getTitlu()+"' and Autor='"+c.getAutor()+"'");
	         st.executeUpdate("update carte set PaginiCitite="+c.getPgCitite()+" where Email='"+s+"' and Titlu='"+c.getTitlu()+"' and Autor='"+c.getAutor()+"'");
	        
	     
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
