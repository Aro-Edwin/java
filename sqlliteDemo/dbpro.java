package sqlliteDemo;
import java.sql.*;
public class dbpro {

	public static void main(String[] args) throws Exception {
		
	Class.forName("org.sqlite.JDBC");
	Connection con=DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\ARO EDWIN\\Documents\\sqllite\\edwin.db");
	Statement stmt=con.createStatement();
	String qry="SELECT ID,NAME,AGE,CITY from user";
	ResultSet rs=stmt.executeQuery(qry);
	int id,age;
	String name,city;
	while(rs.next())
	{
		id=rs.getInt("ID");
		name=rs.getString("NAME");
		age=rs.getInt("AGE");
		city=rs.getString("CITY");
		
		System.out.println(id+" ");
		System.out.println(name+" ");
		System.out.println(age+" ");
		System.out.println(city+" ");
	}
	stmt.close();
	con.close();
	}

}
