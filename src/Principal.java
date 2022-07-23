import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
public class Principal {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bazatest","root","");

            System.out.println("Conexiune reusita!");
            
            Statement st = con.createStatement();
            String sql = ("SELECT * FROM dateproba");
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) { 
             String id = rs.getString("Nume"); 
             String str1 = rs.getString("Email");
             String parola =rs.getString("Paroal");
             
             System.out.println(id+" "+str1+" "+parola);
            }
            con.close();
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }

	}

}
