import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectareBaza {
	
	public  boolean cauta1(String s)
	{

        
        try {
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
        	
        	
        	
        	
        	
//        	Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarie","root","");
//
//            System.out.println("Conexiune reusita!");
//            
//            Statement st = con.createStatement();
//            String sql = ("SELECT * FROM utilizator");
//            
//            boolean gasitUtilizator=false;
//            
//            ResultSet rs = st.executeQuery(sql);
//            while(rs.next()) { 
//             String num = rs.getString("Nume"); 
//             String em= rs.getString("Email");
//            
//             if(em.equals(s))
//            	 gasitUtilizator=true;                   
//             
//            }
//            con.close();
//            if(!gasitUtilizator)
//            	return false;
//            else
//            	return true;
//            
        	
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarie","root","");

            System.out.println("Conexiune reusita!");
            
            Statement st = con.createStatement();
            String sql = ("SELECT * FROM utilizator");
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) { 
             String id = rs.getString("Nume"); 
             String str1 = rs.getString("Email");
             //String parola =rs.getString("Paroal");
             
             System.out.println(id+" "+str1+" ");
            }
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
