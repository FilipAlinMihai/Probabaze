import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

class TestareBaza {

	Principal p=new Principal();
	@Test
	void testCarte() {
		
		assertTrue(!p.cautaCarte("alin1@gmail.com","Viata lui PI", "Yann Martel"));
		assertTrue(p.cautaCarte("alin@gmail.com","Viata lui PI", "Yann Martel"));		
	
	}
	
	@Test
	void testUtilizator() {
		
		assertTrue(p.cauta("alin1@gmail.com"));
		assertTrue(!p.cauta("alin@gmail.com"));		
	
	}

}
