/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NewClass {
       
    public static void main(String args[])
{
try
{
//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sundari","deo","deo");
String qry = "delete from StudentDb where Sid='S101'";
		Statement s = con.createStatement();
		int i=	s.executeUpdate(qry );
	System.out.println("No of rows deleted from Database  = " + i);

s.close();
con.close();
}
catch(SQLException e){}
}
}


