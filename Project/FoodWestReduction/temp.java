
package Project.FoodWestReduction;
import java.sql.*;

public class temp
{

    public static void main(String args[]) throws Exception
    {
        Connection con;
        Statement stmt;

        Class.forName("com.mysql.cj.jdbc.Driver");

        con=DriverManager.getConnection(
                "jdbc:mysql://aws.connect.psdb.cloud/food-storage?sslMode=VERIFY_IDENTITY",
                "yyue74u1lkjsjp1g3sz5",
                "pscale_pw_FIQZ1UeRSiYZcboInDqbStxAWPQdYVxhqZfev1lsgkD");
        System.out.println("database connected");

        stmt=con.createStatement();

        stmt.executeUpdate("Create table stud2(cno varchar2(5) check(cno in('AA','CC','EE','II','MM')),r_no number(4),name varchar2(50),score number(5) check(score>40 AND score<100),gender varchar(2) check(gender in('M','F')),category varchar2(10),class varchar2(5) check(class in('F','S','T','B')),Address varchar2(15))");
        System.out.println("table created");

        stmt.executeUpdate("insert into stud2 values('AA',1,'Ganesh',99,'M','Open','B','swarg')");
        System.out.println("value inserted");
        con.close();



    }


}