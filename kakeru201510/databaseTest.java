package kakeru_201510;
import java.sql.*;
import java.io.*;
import java.util.*;

public class databaseTest {
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		Connection con=null;
		try{
			con=DriverManager.getConnection(
					"jdbc:mysql://localhost/mysql","root","Zn246246");
			PreparedStatement pstmt = con.prepareStatement(
					"SELECT * FROM USER WHERE USER = ?");
			pstmt.setString(1, "root");
			ResultSet rs = pstmt.executeQuery();
			if(!(rs.next())){
				System.out.println("No Result.");
			}else{
			do{
				System.out.println("NAME:" + rs.getString("USER"));
			}while(rs.next());
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			if(con != null){
				try{
					con.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
}
