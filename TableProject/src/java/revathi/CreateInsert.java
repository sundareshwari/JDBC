/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revathi;

import java.sql.*;
 
 
public class CreateInsert {
    public static void main(String args[])
{
try
{
//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/JdbcDb","APP","APP");
 
    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sundari","deo","deo");
    String qry = "insert into StudentDb values('S101','angel','Chennai','MTEch')";
		Statement s = con.createStatement();
		int i=	s.executeUpdate(qry );
	System.out.println("No of rows inserted  = " + i);

s.close();
con.close();
}
catch(SQLException e){}
}
}

