package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Datainset {

	public static void main(String[] args) throws Exception {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poc_poi?useSSL = false","root","waba12vixo");
			PreparedStatement stmt =null;
			int count = 0;
			String sql = "insert into category(id,name,Sub_Category_id_fk) values (?,?,?)";
			stmt = con.prepareStatement(sql);
			for(int i = 1;i <= 1000 ; i++) {
				stmt.setInt(1, i);
				stmt.setString(2, "Category "+i);
				stmt.setInt(3, i);
				count = stmt.executeUpdate();
			}
			if(count > 0){
				System.out.println("inserted into database ");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
