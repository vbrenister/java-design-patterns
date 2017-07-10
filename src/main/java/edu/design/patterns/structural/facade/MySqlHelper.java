package edu.design.patterns.structural.facade;

import java.sql.Connection;

public class MySqlHelper {
	
	public static Connection getMySqlDBConnection() {
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection conn) {
		//get data from table and generate pdf report
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection conn) {
		//get data from table and generate html report
	}
	
}
