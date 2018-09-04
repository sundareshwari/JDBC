/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
public class CreateRet {
   public static void main(String args[])throws SQLException,IOException
{
//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sundari","deo","deo");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from StudentDb");
while(rs.next())
{
String Stud_id=rs.getString(1);
String Stud_name=rs.getString(2);
String Stud_add=rs.getString(3);
String Stud_course=rs.getString(4);

System.out.println(Stud_id);
System.out.println(Stud_name);
System.out.println(Stud_add);
System.out.println(Stud_course);
}
con.close();
}

}
