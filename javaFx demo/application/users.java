package application;

import java.sql.*;
import javax.swing.JOptionPane;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class users {
	
	//database connection
	Connection con = null;
	PreparedStatement pst;
	ResultSet rs;
	Statement st;
	
	public void Connect() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://locahost:3306/dbedwin1?characterEncoding=utf8";
		String username = "root";
		String password = "root";
		con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		}
		public ObservableList<usermodel> getUserList(){
			ObservableList<usermodel> userList =FXCollections.observableArrayList();
			String sql="SELECT ID,NAME,AGE,CITY from users";
			try {
				st = con.createStatement();
				rs = st.executeQuery(sql);
				usermodel user;
				while(rs.next()) {
					user = new usermodel(rs.getInt("ID"),rs.getString("NAME"),rs.getInt("AGE"),rs.getString("CITY"));
					userList.add(user);
				}
			}
				catch(Exception e) {
					e.printStackTrace();
				}
			return userList;
			}
		//show user details
		public void loadData() {
			ObservableList<usermodel> list= getUserList();
			colid.setCellValueFactory(new PropertyValueFactory<usermodel,Integer>("id"));
			colname.setCellValueFactory(new PropertyValueFactory<usermodel,String>("name"));
			colage.setCellValueFactory(new PropertyValueFactory<usermodel,Integer>("age"));
			colcity.setCellValueFactory(new PropertyValueFactory<usermodel,String>("city"));
			table1.setItems(list);
		}
		
		
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnclear;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnsave;

    @FXML
    private Button btnupdate;

    @FXML
    private TableColumn<usermodel,Integer> colage;

    @FXML
    private TableColumn<usermodel,String> colcity;

    @FXML
    private TableColumn<usermodel,Integer> colid;

    @FXML
    private TableColumn<usermodel,String> colname;

    @FXML
    private TableView<usermodel> table1;

    @FXML
    private TextField txtage;

    @FXML
    private TextField txtcity;

    @FXML
    private TextField txtid;

    @FXML
    private TextField txtname;

    @FXML
    void btnclearClicked(ActionEvent event) {
    	txtid.setText("");
    	txtname.setText("");
    	txtage.setText("");
    	txtcity.setText("");

    }

    @FXML
    void btndeleteClicked(ActionEvent event) {
    	// Delete Details
    	String id=txtid.getText();
    	if(!txtid.getText().isEmpty()){
    	    int result = JOptionPane.showConfirmDialog(null,"Sure?You want to Delte?","Delete",
    	             JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    	    if(result == JOptionPane.YES_OPTION){
    	         try{
    	             String sql="delete from users where ID=?";
    	             pst = con.prepareStatement(sql);
    	             pst.setString(1,id);
    	             pst.executeUpdate();
    	             JOptionPane.showMessageDialog(null,"Data Deleted Success");
    	             btnclearClicked(event);
    	             loadData();
    				}
    	    	catch(SQLException e1) {
    	    		e1.printStackTrace();
    	    	}
    		}   
    	}
    }
    @FXML
    void btnsaveClicked(ActionEvent event) {
    	// save details
    	String name=txtname.getText();
    	String age=txtage.getText();
    	String city=txtcity.getText();
    	
    	if(name==null || name.isEmpty() ||name.trim().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Plese Enter Name");
    		txtname.requestFocus();
    		return;
    	}
    	if(age==null || age.isEmpty() ||age.trim().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Plese Enter Age");
    		txtage.requestFocus();
    		return;
    	}
    	if(city==null || city.isEmpty() || city.trim().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Plese Enter City");
    		txtcity.requestFocus();
    		return;
    	}
    	if(txtid.getText().isEmpty()) {
    		try {
    			String sql="insert into users (NAME,AGE,CITY) values (?,?,?)";
    			pst = con.prepareStatement(sql);
    			pst.setString(1, name);
    			pst.setString(2, age);
    			pst.setString(3, city );
    			pst.executeUpdate();
    			JOptionPane.showMessageDialog(null, "Data insert Sucess");
    			btnclearClicked(event);
    			loadData();
    		}
    		catch(Exception e1) {
    			e1.printStackTrace();
    		}
    	}
    }

    @FXML
    void btnupdateClicked(ActionEvent event) {
    	//update option
    	
    	String name=txtname.getText();
    	String age=txtage.getText();
    	String city=txtcity.getText();
    	
    	if(name==null || name.isEmpty() ||name.trim().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Plese Enter Name");
    		txtname.requestFocus();
    		return;
    	}
    	if(age==null || age.isEmpty() ||age.trim().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Plese Enter Age");
    		txtage.requestFocus();
    		return;
    	}
    	if(city==null || city.isEmpty() || city.trim().isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Plese Enter City");
    		txtcity.requestFocus();
    		return;
    	}
    	if(!txtid.getText().isEmpty()) {
    		try {
    			String sql="update users set NAME=?,AGE=?,CITY=? where ID=?";
    			pst = con.prepareStatement(sql);
    			pst.setString(1, name);
    			pst.setString(2, age);
    			pst.setString(3, city );
    			pst.executeUpdate();
    			JOptionPane.showMessageDialog(null, "Data insert Sucess");
    			btnclearClicked(event);
    			loadData();
    		}
    		catch(Exception e1) {
    			e1.printStackTrace();
    		}
    	}
    }
    @FXML
    void tableClicked(MouseEvent event) {
    	usermodel user=table1.getSelectionModel().getSelectedItem();
    	txtid.setText(String.valueOf(user.getId()));
    	txtname.setText(String.valueOf(user.getName()));
    	txtage.setText(String.valueOf(user.getAge()));
    	txtcity.setText(String.valueOf(user.getCity()));
    }

    @FXML
    void initialize() {
    	Connect();
    	loadData();

    }

}
