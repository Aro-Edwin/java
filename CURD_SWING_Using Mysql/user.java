import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.sql.DriverManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.sql.*;
import java.sql.*
;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;public class user {

	private JFrame frmCrudcreateReadUpadate;
	private JTextField txtid;
	private JTextField txtname;
	private JTextField txtage;
	private JTextField txtcity;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user window = new user();
					window.frmCrudcreateReadUpadate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public user() {
		initialize();
		Connect();
		loaddata();
	}
	
	//database Connection
	Connection con=null;
	PreparedStatement pst;
	ResultSet rs;
	
	public void Connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dbedwin?characterEncoding=utf8";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//clear all
	public void clear() {
		txtid.setText("");
		txtname.setText("");
		txtage.setText("");
		txtcity.setText("");
		txtname.requestFocus();
	}
	//Load Table
	public void loaddata() {
		try {
			pst=con.prepareStatement("select * from users");
			rs=pst.executeQuery();
			table.setModel(DbUtiles.resultSetToTableModel(rs));
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrudcreateReadUpadate = new JFrame();
		frmCrudcreateReadUpadate.setTitle("CRUD-Swin in MYSQL");
		frmCrudcreateReadUpadate.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmCrudcreateReadUpadate.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User ManageMent System");
		lblNewLabel.setBounds(10, 11, 183, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmCrudcreateReadUpadate.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 44, 350, 231);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		frmCrudcreateReadUpadate.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 11, 74, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NAME");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 54, 74, 32);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("AGE");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 97, 74, 32);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("CITY\r\n");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(10, 140, 74, 32);
		panel.add(lblNewLabel_1_3);
		
		txtid = new JTextField();
		txtid.setEditable(false);
		txtid.setBounds(59, 11, 281, 32);
		panel.add(txtid);
		txtid.setColumns(10);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(59, 54, 281, 32);
		panel.add(txtname);
		
		txtage = new JTextField();
		txtage.setColumns(10);
		txtage.setBounds(59, 97, 281, 32);
		panel.add(txtage);
		
		txtcity = new JTextField();
		txtcity.setColumns(10);
		txtcity.setBounds(59, 140, 281, 32);
		panel.add(txtcity);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=txtid.getText();
				String name=txtname.getText();
				String age=txtage.getText();
				String city=txtcity.getText();
				
				if(name==null || name.isEmpty() || name.trim().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Please Enter Your Name");
					txtname.requestFocus();
					return;
				}
				if(age==null || age.isEmpty() || age.trim().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Please Enter Your Age");
					txtage.requestFocus();
					return;
				}
				if(city==null || city.isEmpty() || city.trim().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Please Enter Your City");
					txtcity.requestFocus();
					return;
				}
				
				if(txtid.getText().isEmpty()) {
					try {
						String sql="insert into users (NAME,AGE,CITY) values (?,?,?)";
						pst=con.prepareStatement(sql);
						pst.setString(1, name);
						pst.setString(2, age);
						pst.setString(3, city);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null,"Data Insert Sucess");
						clear();
						loaddata();	
					}
					catch(SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSave.setBounds(38, 197, 89, 23);
		panel.add(btnSave);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=txtid.getText();
				String name=txtname.getText();
				String age=txtage.getText();
				String city=txtcity.getText();
				
				if(name==null || name.isEmpty() || name.trim().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Please Enter Your Name");
					txtname.requestFocus();
					return;
				}
				if(age==null || age.isEmpty() || age.trim().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Please Enter Your Age");
					txtage.requestFocus();
					return;
				}
				if(city==null || city.isEmpty() || city.trim().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Please Enter Your City");
					txtcity.requestFocus();
					return;
				}
				
				if(!txtid.getText().isEmpty()) {
					try {
						String sql="update users set NAME=? , AGE=? , city=? where id=?";
						pst=con.prepareStatement(sql);
						pst.setString(1, name);
						pst.setString(2, age);
						pst.setString(3, city);
						pst.setString(4,id);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null,"Data update Sucess");
						clear();
						loaddata();	
					}
					catch(SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUpdate.setBounds(152, 197, 89, 23);
		panel.add(btnUpdate);
		//delete details
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=txtid.getText();
				if(!txtid.getText().isEmpty()) {
					int result=JOptionPane.showConfirmDialog(null,"sure? You want to delete?","delete",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if(result == JOptionPane.YES_OPTION) {
						try {
							String sql="delete from users where id=?";
							pst=con.prepareStatement(sql);
							pst.setString(1, id);
							pst.executeUpdate();
							JOptionPane.showMessageDialog(null, "Data Deleted Sucess");
							clear();
							loaddata();
						}
						catch(SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDelete.setBounds(251, 197, 89, 23);
		panel.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(384, 44, 323, 231);
		frmCrudcreateReadUpadate.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index=table.getSelectedRow();
				TableModel model=table.getModel();
				//ID NAME AGE CITY
				txtid.setText(model.getValueAt(index, 0).toString());
				txtname.setText(model.getValueAt(index, 1).toString());
				txtage.setText(model.getValueAt(index, 2).toString());
				txtcity.setText(model.getValueAt(index, 3).toString());
			}
		});
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
		frmCrudcreateReadUpadate.setBounds(100, 100, 744, 355);
		frmCrudcreateReadUpadate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
