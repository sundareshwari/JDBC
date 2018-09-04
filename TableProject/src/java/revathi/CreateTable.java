/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revathi;

import java.sql.*;

import java.io.*;
 
public class CreateTable {
   
  public static void main(String args[])
   {
         try
           {
              //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //  Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/JdbcDb","APP","APP");
               
               Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sundari","deo","deo");
               String qry = "create table StudentDb( Sid varchar(20), Sname varchar(20), Sadd varchar(20), Scourse varchar(20))";
		Statement s = con.createStatement( );
		s.execute(qry);
		System.out.println("Table created");
               s.close();
               con.close();
             }catch(Exception  e){} 
             System.out.println(" Successfully Created");

   }
}
