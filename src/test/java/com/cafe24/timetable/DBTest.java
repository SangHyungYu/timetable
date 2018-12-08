package com.cafe24.timetable;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DBTest {
   private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
   private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
   private static final String USER = "scott";
   private static final String PWD = "tiger";
   
   
   @Test
   public void testConn() throws Exception{
      Class.forName(DRIVER);
      
      try(Connection conn = (Connection) DriverManager.getConnection(URL, USER, PWD)){
         System.out.println(conn);
      }catch(Exception e) {
         e.printStackTrace();
      }
      
   
   }


   
         

}