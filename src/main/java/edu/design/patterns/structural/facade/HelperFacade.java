package edu.design.patterns.structural.facade;

import java.sql.Connection;

public class HelperFacade {
	
	public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
		Connection conn = null;
		
		switch (dbType) {
		case MYSQL:
			conn = MySqlHelper.getMySqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();
			switch (reportType) {
			case HTML:
				mySqlHelper.generateMySqlHTMLReport(tableName, conn);
				break;
			case PDF:
				mySqlHelper.generateMySqlHTMLReport(tableName, conn);
				break;
			}
			break;
		case ORACLE:
			conn = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch (reportType) {
			case HTML:
				oracleHelper.generateOracleHTMLReport(tableName, conn);
				break;
			case PDF:
				oracleHelper.generateOraclePDFReport(tableName, conn);
				break;
			}
		}
	}
	
	public static enum DBTypes {
		MYSQL, ORACLE;
	}
	
	public static enum ReportTypes {
		PDF, HTML;
	}
	
}
