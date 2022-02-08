package com.mathan;
//Java DataBase Connectivity  - Project

//Step 1 register driver
//step 2: open a connection between java and sql
//step 3: create statement
//step4 : execute the statement with Sql Queries
//step 5: close the connection

//What is a driver? - It is interfaces between Mysql and Java like translator
//Statement -- carrier java command to SQl database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
}

class DatabaseConnection
{
    public static void main(String[] args) {
        try
        {
            //Register the driver
            //Get Mysql Connector for java

            Class.forName("com.mysql.cj.jdbc.driver");

            //create connection

            Connection con = DriverManager.getConnection("jdbc:mysql//localhost:portno/essentials","root","czvcvsv");

            //create statement
            Statement st =con.createStatement();

            //executing query
            ResultSet rs=st.executeQuery("select * form student:");

            while (rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3
                 ));
            }

            //close connection

            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("exception handled");
        }



    }
}

