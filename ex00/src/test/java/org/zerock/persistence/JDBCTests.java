package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	String user = "ora_user";
	String password = "1234";
	
	@Test
	public void testConnection() throws Exception {
		Class clz = Class.forName("oracle.jdbc.driver.OracleDriver");
//		log.info(clz);
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<100; i++) {
			Connection conn = DriverManager.getConnection(url, user, password);
			log.info(conn);
			
			conn.close();	// bad code
		}
		
		long end = System.currentTimeMillis();
		
		log.info("------------------------------");
		log.info(end-start);
		
	}
}
