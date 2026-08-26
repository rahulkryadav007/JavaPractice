package jdbc;
import java.sql.*;
public class JdbcDemo { public static void main(String[] args) { String url="jdbc:mysql://localhost:3306/testdb"; String user="root"; String password="root"; try(Connection con=DriverManager.getConnection(url,user,password); Statement st=con.createStatement(); ResultSet rs=st.executeQuery("SELECT id,name FROM student")){while(rs.next())System.out.println(rs.getInt("id")+" "+rs.getString("name"));}catch(SQLException e){e.printStackTrace();} } }
