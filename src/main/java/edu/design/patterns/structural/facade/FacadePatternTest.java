package edu.design.patterns.structural.facade;

import java.sql.Connection;

public class FacadePatternTest {
	public static void main(String[] args) {
		String tableName = "Employees";
		
		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection conn = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, conn);
		
		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}
}
