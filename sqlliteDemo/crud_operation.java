package sqlliteDemo;
import java.sql.*;
import java.util.Scanner;

public class crud_operation {

	public static void main(String[] args) throws Exception {
		// CRUD operation Using Java with SqLite Database
		//C-CREATE R-READ U-UPDATE D-DELETE
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\ARO EDWIN\\Documents\\sqllite\\edwin.db");
		Statement stmt=con.createStatement();
		PreparedStatement st;
		ResultSet rs;
		
		String qry="";
		int id,age,choice;
		String name,city;
		
		Scanner in=new Scanner(System.in);
		Scanner str=new Scanner(System.in);
		
		while(true) {
			System.out.println("SQLite java CRUD Operation");
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Select");
			System.out.println("5. Exit");
			System.out.println("Enter a Choice: ");
			choice=in.nextInt();
			System.out.println("--------------------------------------------------------------");
			
			switch(choice) {
			
			case 1:
				System.out.println("1.Inserting a New Data");
				System.out.println("Enter Your Name :");
				name=str.nextLine();
				System.out.println("Enter Your Age :");
				age=in.nextInt();
				System.out.println("Enter Your City :");
				city=str.nextLine();
				
				qry="insert into user (NAME,AGE,CITY) values (?,?,?)";
				st=con.prepareStatement(qry);
				
				st.setString(1, name);
				st.setInt(2, age);
				st.setString(3, city);
				st.executeUpdate();
				System.out.println("Data Insert Sucess");
				
				break;
			case 2:
				System.out.println("2. Upadaing a Data");
				System.out.println("Enter ID :");
				id=in.nextInt();
				System.out.println("Enter Name :");
				name=str.nextLine();
				System.out.println("Enter Age :");
				age=in.nextInt();
				System.out.println("Enter City ");
				city=str.nextLine();
				
				qry="update user set NAME=?,AGE=?,CITY=? where ID=?";
				st=con.prepareStatement(qry);
				
				st.setString(1, name);
				st.setInt(2, age);
				st.setString(3, city);
				st.setInt(4, id);
				st.executeUpdate();
				System.out.println("Update Scucess");
				
				break;
			case 3:
				System.out.println("3. Deleting a Data");
				
				System.out.println("Enter ID :");
				id=in.nextInt();
				
				qry="delete from user where ID=?";
				st=con.prepareStatement(qry);
				st.setInt(1, id);
				st.executeUpdate();
				System.out.println("Data Deleted Scucess");
				break;
			case 4:
				System.out.println("4. Printing all Records");
				qry="SELECT ID,NAME,AGE,CITY from user";
				rs=stmt.executeQuery(qry);
				while(rs.next()) {
					id=rs.getInt("ID");
					name=rs.getString("NAME");
					age=rs.getInt("AGE");
					city=rs.getString("CITY");
					
					System.out.print(id+ "  ");
					System.out.print(name+ "  ");
					System.out.print(age+ "  ");
					System.out.print(city+ "  ");
					System.out.println("");
				}
				break;
			case 5:
				System.out.println("Thank You !!!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Selection");
				break;
			}
			System.out.println("------------------------------------------------------------");
			
		}
		
		
		
		
	}

}
